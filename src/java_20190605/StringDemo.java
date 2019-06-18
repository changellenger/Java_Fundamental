package java_20190605;

public class StringDemo {
	public static void main(String[] args) {

		String str1 = new String("test");
		String str2 = new String("test");

		String str3 = "java";
		String str4 = "java";

		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));

		String ssn = "234567-8923456";

		// ���ڿ� �߿��� Ư�� index�� �ִ� ���ڸ� �ݺ��Ѵ�
		char c = ssn.charAt(6);
		System.out.println(c);

		// concat(String msg) �ż���� ���ڿ� ����
		String temp = ssn.concat("�ȳ��ϼ���");
		System.out.println(temp);

		// endsWith(String temp) �޼���� temp ���ڿ��� ������ true �ƴϸ� false
		String fileName = "test.zip";
		if (fileName.endsWith("zip")) {
			System.out.println("���������Դϴ�");
		} else if (fileName.endsWith("doc")) {
			System.out.println("Office�����Դϴ�");
		} else {
			System.out.println("�����Դϴ�");
		}

		// startsWith(String temp) �޼���� temp ���ڿ��� �����ϸ� true �ƴϸ� false

		String url = "http://www.naver.com/";
		String uri = "sports/";

		if (uri.startsWith("sports")) {
			System.out.println("������ �޴� �Դϴ�");
		} else if (uri.startsWith("news")) {
			System.out.println("���� �޴� �Դϴ�");
		} else {
			System.out.println("404 ������ �Դϴ�.");
		}

		String s1 = "Java";
		String s2 = "java";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));

		s2 = s2.toLowerCase();
		System.out.println(s2);

		s1 = s1.toUpperCase();
		System.out.println(s1);

		System.out.println(ssn.indexOf("-"));
		System.out.println(ssn.lastIndexOf("-"));

		ssn = ssn.replaceAll("-", "*");
		System.out.println(ssn);

		String html = "�ȳ��ϼ���\n ���� ��â�Դϴ�\n ������ �� ��Ź�帳�ϴ�";

		System.out.print(html);

		html = html.replaceAll("\n", "<br>");

		System.out.println(html);
		// ssn = 234567*8923456
		String ssn1 = ssn.substring(0, 6); // 0 ~ 6������
		String ssn2 = ssn.substring(7); // 7 ���� ����

		System.out.println(ssn1);
		System.out.println(ssn2);

		// String ssn1 = ssn.substring(0,indexOf("*")); // 0 ~ 6������
		// String ssn2 = ssn.substring(indexOf("*")+1); // 7 ���� ������

		fileName = "abc.def.hgi.zip";

		String fileName1 = fileName.substring(0, fileName.lastIndexOf("."));
		String fileName2 = fileName.substring(fileName.lastIndexOf(".") + 1);

		System.out.println(fileName1);
		System.out.println(fileName2);

		fileName1 = "hello";
		fileName2 = "hello ";
		if (fileName1.equals(fileName2.trim())) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}

		int a = 10;

		String t1 = String.valueOf(a);
		String t2 = a + "";

		System.out.println(t1);

		// 235678*8923456

		ssn = "235678-8923456";
		String[] t3 = ssn.split("-");
		System.out.println(t3[0]);
		System.out.println(t3[1]);

		int kkk = 12;
		String t4 = String.format("%d and %,d and %,.2f", kkk, 20000000, 13.5487); // 3�ڸ�����  , ����

		System.out.println(t4);

		String str = String.format("%f, %f, %f", 1111.11, 2222.22, 3333.33);

		System.out.println(str);

		str = String.format("%1$f, %1$f, %2$f", 1111.11, 2222.22, 3333.33);

		System.out.println(str);

		str = String.format("%1$,20.2f , %2$,20.2f , %3$,20.2f", 1111.11, 2222.22, 3333.33);

		System.out.println(str);
		
		int b1 = 10;
		int b2 = 20;
		System.out.printf("b1�� ���� %d �̰�, %nb2�� ���� %d �Դϴ�", b1,b2);

	}

}
