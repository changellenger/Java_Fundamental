package java_20190617;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketScanDemo extends Thread {

	@Override
	public void run() {
		ServerSocket s = null;
		for (int i = 0; i < 65535; i++) {
			try {
				
				// ServerSocket Ŭ������ �ش缭���� port ��ȣ�� ����� �� ������
				// ServerSocket �������� ������ �� �ְ�, ���ܰ� �߻��ϴ� ���� �ش� port �� ����ϴ� ����̴�.
				s = new ServerSocket(i);
				Socket socket = s.accept();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(i + "��ȣ�� ����� �� �����ϴ�.");
			}

		}
	}

	public static void main(String[] args) {

		ServerSocketScanDemo s = new ServerSocketScanDemo();
		s.start();

	}

}
