package java_20190603;

public class CallByReferenceDemo {
	
	public static void change(int i , int[] a, String str){
		i = 20;
		a[2] =3000;
		str += "def";
	}
	
	
	
	public static void main(String[] args) {
		int i = 10;
		int[] a = {10,20,30,40};
		String tt = "abc";
		System.out.println("i : "+i);
		System.out.println(a[2]);
		System.out.println(tt);
		
		// i 는 call by value, a 는 call by reference
		change(i, a, tt);
		
		// change( i , b) 로 생각하면 덜 헷갈림
		// 레퍼런스를 넘기면 참조가능한데, 벨류값은 그저 벨류 값일뿐
		// String class 는 레퍼런스인데도 안바뀜
		System.out.println(a[2]);
		System.out.println(tt);
		
		
		
	}
}
