package java_20190617;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


public class SocketScanDemo extends Thread {
	@Override
	public void run() {
		Socket s = null;
		for (int i = 20; i < 200; i++) {

			try {
				//Socket ��ü�� �����Ǿ��ٴ� ���� host, port�� ����� �� �ִٴ� ���̱� ������
				// �ش� host, port �� ����� 
				s = new Socket("138.111.174.34", i);
				System.out.println(i);
			} catch (UnknownHostException e) {
				// TODO: handle exception

				System.out.println("�ش�ȣ��Ʈ�� �߸��Ǿ����ϴ�");
			} catch (IOException e) {
				// TODO: handle exception
				System.out.println(i+"��Ʈ�� ��������� �ʽ��ϴ�");
			}
			
		}
				


	}

	public static void main(String[] args) {
		SocketScanDemo ssd = new  SocketScanDemo();
		ssd.start();
	}
}
