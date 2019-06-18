package java_20190617;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class EchoClient1 {
	private String ip;
	private int port;
	private Socket socket;

	EchoClient1(String ip, int port) {
		this.ip = ip;
		this.port = port;

		try {
			//3.4 클라이언트 Socket 객체를 생성
			
			socket = new Socket(ip, port);
			//4.5 서버아 TCP커넥션이 만들어지면서 서버와 통신할 수 있는 Socket객체가 생성됨

			//6 서버에게 메세지를 보낸다
			OutputStream out = socket.getOutputStream();	
			
			//6-1
			OutputStreamWriter osw = new OutputStreamWriter(out);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write("안녕하세요 안창입니다");
			bw.newLine();
			bw.flush();
			
			//9 서버로부터 메세지를 받는다.
			InputStream in = socket.getInputStream();
			
		} catch (IOException e) {
			// TODO: handle exception
			
		}

	}

	public static void main(String[] args) {
		//127.0.0.1
		new EchoClient1("127.0.0.1", 3001);
	}
}
