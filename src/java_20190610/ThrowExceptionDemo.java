package java_20190610;

class InsufficientBalanceException extends Exception {
	InsufficientBalanceException(String msg) {
		super(msg);
		// exception Ŭ������ �Ű����� String�� �����ڸ� ȣ�����ش�
		// msg�� ���� �޼����� ����� �������� ����Ѵ٤�
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
					throw new InsufficientBalanceException("�ܾ��̺����մϴ�");
				} catch (InsufficientBalanceException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		} else {
			try {
				throw new InCorrectAccountException("���¹�ȣ�� �߸��Ǿ����ϴ�.");
			} catch (InCorrectAccountException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return balance;
	}

	public static void main(String[] args) {
		double balance = withdraw("123-12-123123", 200000);
		System.out.println("�ܾ� : " + balance);
	}
}
