package java_20190617;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class EchoClient2 {
	private int port;
	private String ip;
	private Socket socket;
	
	public EchoClient2(String ip,int port){
		this.ip = ip;
		this.port = port;
		
		try {
			
			socket = new Socket(ip,port);
			OutputStream out = socket.getOutputStream();
			
			OutputStreamWriter osw = new OutputStreamWriter(out);
			BufferedWriter bw= new BufferedWriter(osw);
			
			bw.write("æ»≥Á«œººøÍ æ»√¢¿‘¥œ¥Ÿ");
			bw.newLine();
			bw.flush();
			
			InputStream in = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br =  new BufferedReader(isr);
			String readLine = br.readLine();
			System.out.println(readLine);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
				
		
		
	}
	public static void main(String[] args) {
		new EchoClient2("127.0.0.1",3002);
	}

}
