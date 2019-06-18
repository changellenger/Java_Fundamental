package java_20190612;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriter {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			fr = new FileReader("c:\\down\\HelloWorld.java");
			fw = new FileWriter("c:\\down\\2019\\HelloWorld.java");
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			String readLine = null;
			// br.readLine() 은 개행을 포함하지 않은 한줄을 반환한다
			while((readLine = br.readLine()) != null){
				bw.write(readLine);
				bw.newLine();
				
			}
			bw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally{
			try {
				if(fr != null ) fr.close();
				if(fw != null ) fw.close();
				if(br != null ) br.close();
				if(bw != null ) bw.close();
			} catch (IOException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
}
