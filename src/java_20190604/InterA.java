package java_20190604;
//인터페이스 상속은 다중 상속이 가능하다.
public interface InterA extends InterB, InterC {
	
	//public static final 이 double PI 앞에 생략되어 있음.
	double PI = 3.14;
	// 인터페이스의 메서드 접근 한정자를 붙이지 않으면 public 이 생략되어 있는 것
	//abstract 는 생략 가능
	void mA();
}
