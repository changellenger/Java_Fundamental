package java_20190614;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnectionDemo {
	public static void main(String[] args) throws Exception {
		URL url = new URL(
				"https://www.fwrd.com/product-comme-des-garcons-play-large-emblem-low-top-canvas-/CDES-UZ13/?d=Mens");

		URLConnection urlCon = url.openConnection();

		String server = urlCon.getHeaderField("Server");
		String cacheControl = urlCon.getHeaderField("Cache-Control");
		String expires = urlCon.getHeaderField("Expires");
		String contentType = urlCon.getHeaderField("Content-Type");
		String location = urlCon.getHeaderField("Location");
		String connection = urlCon.getHeaderField("Connection");
		String setCookie = urlCon.getHeaderField("Set-Cookie");
		int len = urlCon.getContentLength();
		
		
		System.out.println("server \t\t: " +server);
		System.out.println("Cache-Control \t: "+cacheControl);  
		System.out.println("Expires \t: "+expires);  
		System.out.println("Content-Type \t: "+contentType);  
		System.out.println("Location \t: "+location);  
		System.out.println("Connection \t: "+connection);  
		System.out.println("SetCookie \t: "+setCookie);  
		System.out.println("Length \t\t: "+len);
		
		InputStream in = urlCon.getInputStream();
		InputStreamReader ir = new InputStreamReader(in,"UTF-8");
		BufferedReader br = new BufferedReader(ir);
		String readLine = null;
		//PrintWriter pw = new PrintWriter("c:\\down\\soccer.html","UTF-8");
		
		
		while((readLine = br.readLine()) != null ){
			System.out.println(readLine);
			//pw.println(readLine);
		}
	
	}
}
