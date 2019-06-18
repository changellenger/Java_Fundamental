package java_20190612;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BUfferedInputOutputDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try {
			fis = new FileInputStream("c:\\down\\flower.jpg");
			fos = new FileOutputStream("c:\\down\\2019\\flower.jpg");

			// stream chainning * 로컬 보다는 네트워크에서 속도차이가 확연히 보임
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);

			int readByteCount = 0;
			byte[] readBytes = new byte[1024];
			while ((readByteCount = bis.read(readBytes)) != -1) {
				bos.write(readBytes, 0, readByteCount);
			}
			// 버퍼드스프링에서 출력할때는 꽉찬 버퍼만 출력을 하기 때문에 마지막에 남은 버퍼에 존재하는 데이터를 넘겨주기 위하여
			// flush 사용
			bos.flush();

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

			} catch (IOException e2) {
				e2.printStackTrace();

			}
		}
	}

}
