package java_20190605;

public class WrapperDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		String s1 = "42.5";
		String s2 = "90.5";

		// primitive data type 을 Wrapper 클래스로 변환 int => Integer

		Integer a1 = new Integer(a);
		Integer a2 = new Integer(b);

		// wrapper class => primitive data type 변환
		int a3 = a1.intValue() + a2.intValue();

		// primitive 에서 reference 로 자동 변환 되는것이 오토박싱 , 반대가 언박싱

		// int a4 = a1 + a2 ;

		// String => primitive data type 변환
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);

		double d3 = d1 + d2;

		System.out.println(a3);
		System.out.println(d3);

		// (auto)boxing : primitive data type =>Wrapper class 자동변환

		Integer a4 = 10;
		Integer a5 = 20;

		// (auto)unboxing : Wrapper class => primitive data type 자동변환

		int a6 = a4 + a5;
	}
}
