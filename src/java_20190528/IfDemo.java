package java_20190528;

public class IfDemo {
	public static void main(String[] args) {
		//args[0] 프로그램 실행시 입력받은 값
		int month = Integer.parseInt(args[0]);
		
		if(month==12 || month == 1 || month == 2){
			System.out.println(month + "월은 겨울 입니다.");
		}else if(month==3 || month == 4 || month == 5){
			System.out.println(month + "월은 봄 입니다.");
		}else if(month==6 || month == 7 || month == 8){
			System.out.println(month + "월은 여름 입니다.");
		}else if(month==9 || month == 10 || month == 11){
			System.out.println(month + "월은 가을 입니다.");
		}
	}
}
