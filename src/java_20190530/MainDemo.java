package java_20190530;

public class MainDemo {
	public static void main(String[] args) {
		/*
		 * Customer c = new Customer();
		 */

		// 1. Customer c ���� Customer �� Reference Type, c �� reference
		// 2. new Customer()�� Object

		/*
		 * c.name =" �� â"; c.cphone = "010-8930-3260"; c.interestRate = 4.3;
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
		 * c3.name = "������"; c3.cphone = "010-1111-2222";
		 * 
		 * c2.register(); c3.register();
		 */

		// static ���� = ���� ���� ex) ���� ���α׷����� �ϰ� ����Ǵ� ������
		// instance ���� = �������� ����, ex)�̸� ��ȭ��ȣ

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
