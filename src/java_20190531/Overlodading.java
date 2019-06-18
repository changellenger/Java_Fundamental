package java_20190531;

public class Overlodading {
	public void print(int i) {
		System.out.println(i);

	}

	public void print(String s) {
		System.out.println(s);
	}

	public void print(double d) {
		System.out.println(d);
	}
	public void printInt(int i ){	// 인자가 다르면 같은 함수이름 사용 가능 *오버로딩
		System.out.println(i);
	}
	
	public void search(String id){
		// 아이디
	}
	
	public void search(String f, String e){
	 //이메일	
	}
	
	public void search( String zipcode, int flag, String address){
		
	}
	


}
