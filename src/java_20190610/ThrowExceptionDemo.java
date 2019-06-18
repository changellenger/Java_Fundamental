package java_20190610;

class InsufficientBalanceException extends Exception {
	InsufficientBalanceException(String msg) {
		super(msg);
		// exception 클래스의 매개변수 String인 생성자를 호출해준다
		// msg는 에러 메세지를 출력할 목적으로 사용한다ㅜ
	}
}

class InCorrectAccountException extends Exception {
	InCorrectAccountException(String msg) {

		super(msg);
	}
}

public class ThrowExceptionDemo {

	public static double withdraw(String account, int amount) {
		double balance = 100000;
		String dbAcount = "123-12-123123";

		if (account != null && account.equals(dbAcount)) {
			if (balance - amount > 0) {
				balance = balance = amount;
			} else {
				try {
					throw new InsufficientBalanceException("잔액이부족합니다");
				} catch (InsufficientBalanceException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		} else {
			try {
				throw new InCorrectAccountException("계좌번호가 잘못되었습니다.");
			} catch (InCorrectAccountException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return balance;
	}

	public static void main(String[] args) {
		double balance = withdraw("123-12-123123", 200000);
		System.out.println("잔액 : " + balance);
	}
}
