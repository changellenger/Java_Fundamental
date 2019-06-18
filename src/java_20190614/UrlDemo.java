package java_20190614;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

public class UrlDemo {
	public static void main(String[] args) throws Exception {
		URL url = new URL("https://www.fwrd.com/product-comme-des-garcons-play-large-emblem-low-top-canvas-/CDES-UZ13/?d=Mens");
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort();
		String path = url.getPath();
		String query = url.getQuery();
		String ref =url.getRef();
		
		
		System.out.println("protocol :"+protocol);
		System.out.println("host :"+host);
		System.out.println("port :"+port);
		System.out.println("path :"+path);
		System.out.println("query :"+query);
		System.out.println("ref :" +ref);
		
		InputStream in = url.openStream();
		
		PrintWriter pw = new PrintWriter("c:\\down\\sports.html","UTF-8");
		//InputStreamReader ir = new InputStreamReader(in,"UTF-8");
		BufferedReader br = new BufferedReader(new InputStreamReader(in,"UTF-8"));
		String readLine = null;
		
		while((readLine = br.readLine()) != null ){
			System.out.println(readLine);
			pw.println(readLine);
		}
		
		
		if (in != null)
			in.close();

		if (br != null)
			br.close();
		

		if (pw != null)
			pw.close();
		
	}

}
