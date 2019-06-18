package java_20190610;

public class TryCatchFinallyDemo {
public static void main(String[] args) {
/*	if(args.length != 2){
		System.err.println("usage : java TryCatchFinallyDemo " + "[국어점수] [영어점수]");
		 return;	//리턴을 줘버려서 조건에 맞지 않을때 종료를 시켜버림
		 		
	}*/
	
	//Integer.parseInt() 매서드는 숫자가 아닌 문자열일 경우, 즉 일반 문자열일 경우
	//NumberFormatException 예외가 발생됨
	
	
	try {
		int korea = Integer.parseInt(args[0]);
		
		//JVM은 실행을 중지 시키고, 예외 객체인 NumberFormatException 객체를 생성한후   Catch 블럭을 찾는다
		
		int english = Integer.parseInt(args[1]);
		double avg = average(korea, english);
		System.out.printf("평균 : %.2f %n",avg);
		
		
	} catch (NumberFormatException e) {
		//JVM 메세지와 동일하게 출력됨
		//e.printStackTrace();
		//System.err.println("예외메세지 : " +e.getMessage());
		System.err.println("숫자를 입력하셔야 합니다");
		
		// TODO: handle exception
	}catch (ArrayIndexOutOfBoundsException e) {
		//JVM 메세지와 동일하게 출력됨
		//e.printStackTrace();
		//System.err.println("예외메세지 : " +e.getMessage());
		System.err.println("usage : java TryCatchFinallyDemo " + "[국어점수] [영어점수]");
		
		// TODO: handle exception
	} finally{
		System.out.println("finally block");
	}
	
}

 public static double average (int i, int j){
	 return (i+j)/2;
 }




}
