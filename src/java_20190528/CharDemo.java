package java_20190528;

public class CharDemo {
	public static void main(String[] args) {
		//문자표현법
		char a = 'q';
		
		
		//유니코드 표현법
		char b = '\uC548';
		char c = '\uCC3D';
 
		System.out.println(a+b+c);
		
		// \,' 두개의 문자는 char 에서 인식을 못하기때문에
		// 두문자 앞에 \를 붙여주어 문자로 인식하게 해야 한다.
		char f = '\\';
		char g = '\'';
		char h = '"';

		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		
		
		
		
		
		
		
	}
	
	
}
