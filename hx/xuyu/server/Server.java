package hx.xuyu.server;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import hx.xuyu.Stat;
import hx.xuyu.XuyuLexer;
import hx.xuyu.XuyuParser;
import hx.xuyu.XuyuParser.FileContext;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.vertx.java.core.Handler;
import org.vertx.java.core.http.HttpServer;
import org.vertx.java.core.http.HttpServerRequest;
import org.vertx.java.platform.Verticle;

public class Server extends Verticle {

  public void start() {
    HttpServer hs = vertx.createHttpServer();
   
    hs.requestHandler(new Handler<HttpServerRequest>(){

		@Override
		public void handle(HttpServerRequest request) {
			
			System.out.println(request.path());
			System.out.println(request.method());
			
			if(request.path().equals("/")){
				request.response().sendFile("./bin/client/client.html");
				return;
			}else if(request.path().startsWith("/static/")){
				request.response().sendFile("./bin/client" + request.path());
				return;
			}else if(!request.path().startsWith("/run"))return;
			
			String source = request.params().get("source");
			if(source == null){
				request.response().end();
				return;
			}
			ANTLRInputStream ais = null;
			try {
				ais = new ANTLRInputStream(new ByteArrayInputStream(source.getBytes()));
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try{
				XuyuLexer xl = new XuyuLexer(ais);
				CommonTokenStream cts = new CommonTokenStream(xl);
				XuyuParser xp = new XuyuParser(cts);
				
				FileContext fc = xp.file();
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				Stat.PRINT.os = new PrintStream(baos);
				
				fc.content.exec();
				request.response().end(baos.toString(), "utf-8");
			}catch(Exception e){
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				PrintStream ps = new PrintStream(baos);
				e.printStackTrace(ps);
				request.response().end(baos.toString(), "utf-8");
			}
//			request.response().end();
		}
    	
    });

    hs.listen(1057);
  }
}