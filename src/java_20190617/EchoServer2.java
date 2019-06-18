package java_20190617;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer2 {
	private int port;
	private ServerSocket serverSocket;

	EchoServer2(int port) {
		this.port = port;
		try {
			serverSocket = new ServerSocket(port);

			System.out.println("클라이언트 입장 대기중");
			

			Socket socket = serverSocket.accept();
			InetAddress ia = socket.getInetAddress();
			String ip = ia.getHostAddress();
			System.out.println(ip + "가 접속하였습니다.");

			InputStream in = socket.getInputStream();

			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);
			String readLine = br.readLine();
			System.out.println(readLine);

			OutputStream out = socket.getOutputStream();

			OutputStreamWriter osw = new OutputStreamWriter(out);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write(readLine);
			bw.newLine();
			bw.flush();

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new EchoServer2(3002);
	}

}
