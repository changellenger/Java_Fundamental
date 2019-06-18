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
				//Socket 객체가 생성되었다는 것은 host, port로 통신할 수 있다는 것이기 때문에
				// 해당 host, port 를 사용중 
				s = new Socket("138.111.174.34", i);
				System.out.println(i);
			} catch (UnknownHostException e) {
				// TODO: handle exception

				System.out.println("해당호스트가 잘못되었습니다");
			} catch (IOException e) {
				// TODO: handle exception
				System.out.println(i+"포트가 사용중이지 않습니다");
			}
			
		}
				


	}

	public static void main(String[] args) {
		SocketScanDemo ssd = new  SocketScanDemo();
		ssd.start();
	}
}
