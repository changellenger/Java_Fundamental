package java_20190531;

import java_20190531.tt.Cat;

public class AccessModifierDemo extends Cat {
	public static void main(String[] args) {
		Car c = new Car();
		
		//private는 같은 클래스에서만 접근 가능
		//c.modelNumber = "10가2345";
		
		//default는 같은 패키지 에서 접근가능
		c.color = "green";
		
		
		
		//서로 다른 패키지에서 상속받은 경우 접근가능
		c.doorCount = 5;
		
		//서로 다른 패키지 에서 접근가능
		c.price = 10_000_000;
		
		System.out.println(c.color);
		System.out.println(c.doorCount);
		System.out.println(c.price);
		
		
		
		Cat cat = new Cat();
		cat.nickName = "tomcat";
		
		
		AccessModifierDemo a = new AccessModifierDemo();
		a.age = 10;
		a.nickName ="먼지";
		
		
	}
}
