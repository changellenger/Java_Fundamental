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

			// stream chainning * ���� ���ٴ� ��Ʈ��ũ���� �ӵ����̰� Ȯ���� ����
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);

			int readByteCount = 0;
			byte[] readBytes = new byte[1024];
			while ((readByteCount = bis.read(readBytes)) != -1) {
				bos.write(readBytes, 0, readByteCount);
			}
			// ���۵彺�������� ����Ҷ��� ���� ���۸� ����� �ϱ� ������ �������� ���� ���ۿ� �����ϴ� �����͸� �Ѱ��ֱ� ���Ͽ�
			// flush ���
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
