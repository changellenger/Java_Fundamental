package java_20190607;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer s1 = new StringBuffer();
		StringBuffer s2 = new StringBuffer();

		s1.append("select name, age");
		s1.append("from member");
		s1.append("where name = 창");
		s1.append("order by name desc");

		s2.append("select name, age");
		s2.append("from member");
		s2.append("where name = 창");
		s2.append("order by name desc");

		System.out.println(s1 == s2);
		//StringBUffer의 equals () 매서드는 Object 클래스의 equals () 매서드
		System.out.println(s1.equals(s2));

		String s3 = s1.toString();
		String s4 = s2.toString();
		
		System.out.println(s3.equals(s4));	
		System.out.println(s3 == s4);
		
		s1.setLength(0);
		
		s1.append("select nom writer from board");
		//StringBuffer 클래스는 Object의 toString() 매서드를 오버라이딩 했기때문에 
		//StringBuffer 클래스으 ㅣ문자열이 출력됨
		
		System.out.println(s1);
		 
	}
}
