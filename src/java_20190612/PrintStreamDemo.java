package java_20190612;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;

		try {
			fis = new FileInputStream("c:\\down\\flower.jpg");
			fos = new FileOutputStream("c:\\down\\2019\\flower.jpg");
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			ps = new PrintStream(bos, true); 		// auto flush

			int readByteCnt = 0;
			byte[] Bytes = new byte[2048];

			while ((readByteCnt = bis.read(Bytes)) != -1) {
				ps.write(Bytes, 0, readByteCnt);
			}
			
			
			//PrintStream 의 목적지를 모니터로 설정
			PrintStream ps1 = System.out;
			ps1.println(1);
			ps1.println("aaaa");
			ps1.println(42.5);
			
			
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {

				if (fis != null)
					fis.close();
				if (fos != null)
					fos.close();
				if (bis != null)
					bis.close();
				if (bos != null)
					bos.close();
				if (ps != null)
					ps.close();
			} catch (IOException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
}
