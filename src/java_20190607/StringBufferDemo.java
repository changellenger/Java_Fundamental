package java_20190607;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer s1 = new StringBuffer();
		StringBuffer s2 = new StringBuffer();

		s1.append("select name, age");
		s1.append("from member");
		s1.append("where name = â");
		s1.append("order by name desc");

		s2.append("select name, age");
		s2.append("from member");
		s2.append("where name = â");
		s2.append("order by name desc");

		System.out.println(s1 == s2);
		//StringBUffer�� equals () �ż���� Object Ŭ������ equals () �ż���
		System.out.println(s1.equals(s2));

		String s3 = s1.toString();
		String s4 = s2.toString();
		
		System.out.println(s3.equals(s4));	
		System.out.println(s3 == s4);
		
		s1.setLength(0);
		
		s1.append("select nom writer from board");
		//StringBuffer Ŭ������ Object�� toString() �ż��带 �������̵� �߱⶧���� 
		//StringBuffer Ŭ������ �ӹ��ڿ��� ��µ�
		
		System.out.println(s1);
		 
	}
}