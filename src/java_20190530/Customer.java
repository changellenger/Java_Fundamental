package java_20190530;

public class Customer {
	//instance variable
	String name;
	String cphone;
	static double interestRate;
	
	static final String BANKNAME = "��������";
	//static variable
	public void register() {
		System.out.println("���� ��� �Ǿ����ϴ�.");
		System.out.println("�̸� : " + name + ", �ڵ��� ��ȣ : " + cphone +", ������: "+ interestRate+" ����� : "+BANKNAME);
	}

}
