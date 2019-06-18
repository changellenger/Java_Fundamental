package java_20190618.multicastserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MultiServer {
	private ServerSocket serverSocket;
	private ArrayList<MultiServerThread> list;
	public MultiServer(int port) {
		
		list = new ArrayList<MultiServerThread>();
		try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			System.out.println(port + "�ش� ��Ʈ ��ȣ�� ����ϰ� �ֽ��ϴ�");
			e.printStackTrace();
			System.exit(0); // �������α׷� ����
		}

		MultiServerThread mst = null;

		while(true){
			System.out.println("Ŭ���̾�Ʈ ������ ����ϰ� �ֽ��ϴ�");
			Socket socket = null;

			try {
				socket = serverSocket.accept();
				System.out.println("client ip : " + socket.getInetAddress().getHostAddress());

				mst = new MultiServerThread(socket, list);
				
				list.add(mst);
				
				Thread t = new Thread(mst);
				t.start();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new MultiServer(3003);
	}
}
