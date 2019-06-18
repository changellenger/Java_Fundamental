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
			//3.4 Ŭ���̾�Ʈ Socket ��ü�� ����
			
			socket = new Socket(ip, port);
			//4.5 ������ TCPĿ�ؼ��� ��������鼭 ������ ����� �� �ִ� Socket��ü�� ������

			//6 �������� �޼����� ������
			OutputStream out = socket.getOutputStream();	
			
			//6-1
			OutputStreamWriter osw = new OutputStreamWriter(out);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write("�ȳ��ϼ��� ��â�Դϴ�");
			bw.newLine();
			bw.flush();
			
			//9 �����κ��� �޼����� �޴´�.
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
