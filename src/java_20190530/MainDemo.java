package java_20190530;

public class MainDemo {
	public static void main(String[] args) {
		/*
		 * Customer c = new Customer();
		 */

		// 1. Customer c 에서 Customer 는 Reference Type, c 는 reference
		// 2. new Customer()는 Object

		/*
		 * c.name =" 안 창"; c.cphone = "010-8930-3260"; c.interestRate = 4.3;
		 * c.register();
		 * 
		 * Customer c2 = new Customer(); c2.name = "Steve jobs"; c2.cphone =
		 * "010-0000-0000";
		 * 
		 * c.interestRate = 4.5;
		 * 
		 * c2.register();
		 * 
		 * Customer c3 = c2;
		 * 
		 * c3.name = "손정의"; c3.cphone = "010-1111-2222";
		 * 
		 * c2.register(); c3.register();
		 */

		// static 변수 = 공유 변수 ex) 은행 프로그램에서 일괄 적용되는 이쟈율
		// instance 변수 = 개개인의 정보, ex)이름 전화번호

		Member m = new Member();
		m.setName("Chang");
		m.setAddress("seoul");
		m.setCphone("010");
		m.setZipcode("011010");

		System.out.println(m.getName());
		System.out.println(m.getAddress());
		System.out.println(m.getCphone());
		System.out.println(m.getZipcode());

	}
}
