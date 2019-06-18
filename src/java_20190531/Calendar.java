package java_20190531;

public class Calendar {
	public static final int SUNDAY = 0;
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WEDNESDAY = 3;
	public static final int THURSDAY = 4;
	public static final int FRIDAY = 5;
	public static final int SATURDAY = 6;

	
	// �������� �ƴ����� �Ǵ��ϴ� �޼���
	private boolean isLeafYear(int year) {
		boolean isLeafYear = false;
		if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
			isLeafYear = true;
		}
		return isLeafYear;
	}
	
	
	//1�� 1�� 1�Ϻ��� ~ �� �� ���� ���ϼ��� ���ϴ� �޼���
	private int getCount(int year, int month, int day){
		// �� �ϼ� ���Ҷ��� �⵵�� �����⵵���� �� ���� ���ؾ� �ϱ� ������ pre Year ������ ����
		int preYear = year - 1;
		int preMonth = month - 1;
		int totalCnt = 0;
		
		//2018�⵵ �� �� ���ϱ�
		totalCnt = preYear * 365 + 
				(preYear/4 - preYear/100 + preYear/400);
		
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for (int i = 0; i < preMonth; i++) {
			
			totalCnt += monthArray[i];
		}
		
		//�ش� �⵵�� �������� �Ǵ��ϰ� ������ ��� 3�� �̻��̸� 1�� �߰����ش�.
		if (month >=3 && isLeafYear(year)) {
			totalCnt++;
		}
		
		totalCnt += day;
		return totalCnt;
	}
	

	private int getLastDay(int year, int month) {

		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (isLeafYear(year)) {
			monthArray[1] = 29;
		}
		return monthArray[month - 1];
	}

	public Calendar() {

	}

	public void print(int year) {
		for(int i = 1; i<= 12; i++){
			print(year,i);
		}

	}

	public void print(int year, int month) {
		
		int totalCnt = getCount(year,month,1);
		
		int rest = totalCnt % 7;
		//System.out.println(getLastDay(year,month));
	
		
		System.out.println("��\t��\tȭ\t��\t��\t��\t��\t");
		
	/*	int day=0;
		
		for(int k = 0;k<= (getLastDay(year,month)+rest)/7;k++){
			for(int l=0;l<7;l++){
				if(day<rest){
					System.out.print(" \t");
					day++;
				}else{
						System.out.print(day -rest +1 +"\t");
						day++;
						}
				if(day-rest+1 > getLastDay(year,month)) break;
					}
			System.out.println("");
				}*/
		
		int start = 1;
		int end = getLastDay(year,month);
		
		
		for(int i =0; i<rest; i++){
			System.out.print("\t");
		}
		
		for(int i = start; i<=end ; i++){
			System.out.print(i+"\t");
			rest++;
			if(rest%7 ==0){
				System.out.println("");
			}
		}
		System.out.println("");
		
		
			}

	public void print(int year, int month, int day) {

		int totalCnt = getCount(year,month,day);
		
		int rest = totalCnt % 7;
		String dayOfWeek = "";

		switch (rest) {

		case Calendar.MONDAY:
			dayOfWeek = "������";
			break;
		case Calendar.TUESDAY:
			dayOfWeek = "ȭ����";
			break;
		case Calendar.WEDNESDAY:
			dayOfWeek = "������";
			break;
		case Calendar.THURSDAY:
			dayOfWeek = "�����";
			break;
		case Calendar.FRIDAY:
			dayOfWeek = "�ݿ���";
			break;
		case Calendar.SATURDAY:
			dayOfWeek = "�����";
			break;
		case Calendar.SUNDAY:
			dayOfWeek = "�Ͽ���";
			break;

		}

		System.out.println(year + "�� " + month + "��" + day + "���� " + dayOfWeek + "�Դϴ�");

	}

}

/*
 * public Calendar(int year, int month, int date) {
 * 
 * }
 * 
 * public Calendar(int year, int month) {
 * 
 * }
 * 
 * public Calendar(int year) {
 * 
 * }
 */
