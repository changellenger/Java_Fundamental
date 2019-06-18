package java_20190603;

public class ExtendsDemo {
	public static void main(String[] args) {
		Customer c = new Customer();
		c.name = "안창";
		c.cphone = "01089303260";
		
		System.out.println("이름 :" +c.cphone);
		System.out.println("핸드폰 :" +c.name);
		c.actionCustomer();
		
		Alba a = new Alba();
		a.name = "알바";
		a.cphone = "01000000000";
		a.address ="서울";
		
		System.out.println("이름 :" +a.cphone);
		System.out.println("핸드폰 :" +a.name);
		System.out.println("주소 :"+a.address);
		
		
		Manager m = new Manager();
		m.name = "매니져";
		m.cphone ="01011111111";
		m.address = "서울";
		m.id = "dksckd8282";
		m.password ="0000";
		m.actionCustomer();
		m.actionManager();
		m.actionAlba();
		
		System.out.println("이름 :" +m.cphone);
		System.out.println("핸드폰 :" +m.name);
		System.out.println("주소 :"+m.address);
		System.out.println("아이디 :"+ m.id);
		System.out.println("비밀번호 :" +m.password);
		
		
		// Super 타입(Alba)으로 sub 객체(<Manager)를 생성할 수 있다.
		// 멤버변수는 Super 타입(Alba)의 포함한 상위 클래스(Custmomer) 접근 가능.
		Alba alba = new Manager();	// 레퍼런스 타입은 알바, 객체는 매니저  따라서 name cphone address 만 접근 가능
									// 왜 이런것을 하냐? new alba 하면 되는걸
		
		alba.name = "매니져";
		alba.cphone ="01011111111";
		alba.address = "서울";
		alba.actionAlba();
		alba.actionCustomer();
		
		//alba.id = "dksckd8282";
		//alba.password ="0000";
		
		
		
	}
}
