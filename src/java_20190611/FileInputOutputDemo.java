package java_20190611;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
// IO ó�� �Ҷ��� throw ���� try/catch �̿��ؼ� fis, fos close �������.
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
				// fos.write(readByte); // 1����Ʈ�� �а� �����Ͽ� �� �ӵ��� �ſ����
				fos.write(readBytes, 0, readByteCnt);

			}
			
			
			long end = System.currentTimeMillis();
			
			System.out.println("����ð� : " + (end - start));
			
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
