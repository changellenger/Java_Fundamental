package java_20190603;

public class ExtendsDemo {
	public static void main(String[] args) {
		Customer c = new Customer();
		c.name = "��â";
		c.cphone = "01089303260";
		
		System.out.println("�̸� :" +c.cphone);
		System.out.println("�ڵ��� :" +c.name);
		c.actionCustomer();
		
		Alba a = new Alba();
		a.name = "�˹�";
		a.cphone = "01000000000";
		a.address ="����";
		
		System.out.println("�̸� :" +a.cphone);
		System.out.println("�ڵ��� :" +a.name);
		System.out.println("�ּ� :"+a.address);
		
		
		Manager m = new Manager();
		m.name = "�Ŵ���";
		m.cphone ="01011111111";
		m.address = "����";
		m.id = "dksckd8282";
		m.password ="0000";
		m.actionCustomer();
		m.actionManager();
		m.actionAlba();
		
		System.out.println("�̸� :" +m.cphone);
		System.out.println("�ڵ��� :" +m.name);
		System.out.println("�ּ� :"+m.address);
		System.out.println("���̵� :"+ m.id);
		System.out.println("��й�ȣ :" +m.password);
		
		
		// Super Ÿ��(Alba)���� sub ��ü(<Manager)�� ������ �� �ִ�.
		// ��������� Super Ÿ��(Alba)�� ������ ���� Ŭ����(Custmomer) ���� ����.
		Alba alba = new Manager();	// ���۷��� Ÿ���� �˹�, ��ü�� �Ŵ���  ���� name cphone address �� ���� ����
									// �� �̷����� �ϳ�? new alba �ϸ� �Ǵ°�
		
		alba.name = "�Ŵ���";
		alba.cphone ="01011111111";
		alba.address = "����";
		alba.actionAlba();
		alba.actionCustomer();
		
		//alba.id = "dksckd8282";
		//alba.password ="0000";
		
		
		
	}
}
