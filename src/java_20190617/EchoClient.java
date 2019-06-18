package java_20190617;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {
	private String ip;
	private int port;
	private Socket socket;
	
	public EchoClient(String ip,int port){
		this.ip = ip;
		this.port = port;
		
		try {
			//3.4 Socket 개겣를 생선한다.  
			socket = new Socket(ip,port);
			//7 서버와 통신 할 수 있는 Socket 생성
			
			//8.서버와 통신할수 있는 in,out 스트림 생성
			OutputStream out = socket.getOutputStream();
			
			OutputStreamWriter osw = new OutputStreamWriter(out);
			BufferedWriter bw =new BufferedWriter(osw);
			bw.write("");
			bw.newLine();
			bw.flush();
			
			
			
			InputStream in = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br =  new BufferedReader(isr);
			String readLine = br.readLine();
			System.out.println(readLine);
		
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		//"192.168.0.159"
		new EchoClient("192.168.0.159",3000);
	}
}
