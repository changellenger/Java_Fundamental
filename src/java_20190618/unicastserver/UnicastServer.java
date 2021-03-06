package java_20190618.unicastserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class UnicastServer {
	private ServerSocket serverSocket;

	public UnicastServer(int port) {
		try {
			serverSocket = new ServerSocket(port);
			// 해당포트를 사용중이면 에러가 생김
		} catch (IOException e) {
			System.out.println(port + "해당 포트 번호를 사용하고 있습니다");
			e.printStackTrace();
			System.exit(0); // 응용프로그램 종료
		}

		UnicastServerThread ust = null;

		while (true) {
			System.out.println("클라이언트 접속을 대기하고 있습니다");
			Socket socket = null;

			try {
				socket = serverSocket.accept();
				System.out.println("client ip : " + socket.getInetAddress().getHostAddress());

				ust = new UnicastServerThread(socket);
				Thread t = new Thread(ust);
				t.start();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new UnicastServer(3002);
	}
}
