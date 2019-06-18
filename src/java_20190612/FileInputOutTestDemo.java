package java_20190612;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutTestDemo {
public static void main(String[] args) {
	FileInputStream fin = null;
	FileOutputStream fos = null;
	try {
		fin = new FileInputStream("");
		fos = new FileOutputStream("");
		
		
		long start = System.currentTimeMillis();
		
		int readByteCnt = 0;
		byte[] bytes = new byte[10240];
		while((readByteCnt =fin.read(bytes)) != -1){
			fos.write(bytes, 0, readByteCnt);
			
			
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("소요시간 : "+ (start-end));
		
		
		
	} catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
		
	} finally {
		try{
			if(fin != null)
				fin.close();
			if(fos != null)
				fos.close();
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}	

}
