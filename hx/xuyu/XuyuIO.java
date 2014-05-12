package hx.xuyu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.util.HashMap;

public abstract class XuyuIO<T>{
	
	public static class UnimplementedException extends RuntimeException{};
	
	abstract T open(URI uri);
	
	abstract void close(T conn);
		
	abstract public void operate(ByteBuffer data, T conn);
	
	public static class XuyuFileInput extends XuyuIO<FileInputStream>{

		@Override
		public FileInputStream open(URI uri) {
			try {
				return new FileInputStream(new File(uri));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			throw new UnimplementedException();
		}

		@Override
		public void operate(ByteBuffer buffer, FileInputStream conn) {
			try {
				conn.read(buffer.array(), buffer.arrayOffset(), buffer.capacity());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		@Override
		public void close(FileInputStream conn) {
			try {
				conn.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}
	
	public static class XuyuFileOutput extends XuyuIO<FileOutputStream>{

		@Override
		public FileOutputStream open(URI uri) {
			try {
				return new FileOutputStream(new File(uri.getPath()));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			throw new UnimplementedException();
		}

		@Override
		public void operate(ByteBuffer data, FileOutputStream conn) {
			try {
				conn.write(data.array(), data.arrayOffset(), data.position());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void close(FileOutputStream conn) {
			try {
				conn.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
