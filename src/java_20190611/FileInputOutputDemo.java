package java_20190611;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
// IO 처리 할때는 throw 말고 try/catch 이용해서 fis, fos close 해줘야함.
public class FileInputOutputDemo {
	public static void main(String[] args) {
		FileInputStream fin = null;
		FileOutputStream fos = null;
		try {
			fin = new FileInputStream("c:\\down\\jdk-11.0.3_windows-x64_bin.exe");
			fos = new FileOutputStream("c:\\down\\2019\\jdk-11.0.3_windows-x64_bin.exe");

			long start = System.currentTimeMillis();
			
			int readByteCnt = 0;
			byte[] readBytes = new byte[10240];
			while ((readByteCnt = fin.read()) != -1) {
				// fos.write(readByte); // 1바이트씩 읽고 복사하여 씀 속도가 매우느림
				fos.write(readBytes, 0, readByteCnt);

			}
			
			
			long end = System.currentTimeMillis();
			
			System.out.println("경과시간 : " + (end - start));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fin != null)
					fin.close();
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
