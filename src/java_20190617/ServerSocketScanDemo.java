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
				
				// ServerSocket 클래스는 해당서버의 port 번호를 사용할 수 있으면
				// ServerSocket 객ㅊ레를 생성할 수 있고, 예외가 발생하는 경우는 해당 port 를 사용하는 경우이다.
				s = new ServerSocket(i);
				Socket socket = s.accept();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(i + "번호를 사용할 수 없습니다.");
			}

		}
	}

	public static void main(String[] args) {

		ServerSocketScanDemo s = new ServerSocketScanDemo();
		s.start();

	}

}
