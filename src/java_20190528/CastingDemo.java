package java_20190528;

public class CastingDemo {
	public static void main(String[] args) {
		
		
		//byte 범위를 넘어가면 에러 발생
		//circuit 발생
		
		byte a = (byte) 128;
		System.out.println(a);
		
		
		//float, double로 캐스팅 하는 경우는 소수점 이하 ㅉ라림
		//cut 발생
		int b = (int)42.5;
		System.out.println(b);
		
		double c = (double)42/(double)4;
		
		System.out.println(c);
		
	}
}
