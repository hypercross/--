package hx.xuyu;


import hx.xuyu.XuyuParser.FileContext;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class XuyuLauncher {

	public static void doFile(File f) throws IOException{
		InputStream is = new FileInputStream(f);
		ANTLRInputStream ais = new ANTLRInputStream(is);
		XuyuLexer xl = new XuyuLexer(ais);
		CommonTokenStream cts = new CommonTokenStream(xl);
		XuyuParser xp = new XuyuParser(cts);
		
		FileContext file = xp.file();
		System.out.println(file.toStringTree(xp));
		file.content.exec();
	}
	
	public static void main(String[] arg) throws IOException{
		
		for(String f : arg){
			System.out.println(f);
			doFile(new File(f));
		}
		
	}
	
}
