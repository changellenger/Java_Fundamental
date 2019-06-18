package java_20190531;

public class Calendar {
	public static final int SUNDAY = 0;
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WEDNESDAY = 3;
	public static final int THURSDAY = 4;
	public static final int FRIDAY = 5;
	public static final int SATURDAY = 6;

	
	// 윤년인지 아닌지를 판단하는 메서드
	private boolean isLeafYear(int year) {
		boolean isLeafYear = false;
		if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
			isLeafYear = true;
		}
		return isLeafYear;
	}
	
	
	//1년 1월 1일부터 ~ 년 월 일의 총일수를 구하는 메서드
	private int getCount(int year, int month, int day){
		// 총 일수 구할때는 년도는 이전년도까지 일 수를 구해야 하기 때문에 pre Year 변수를 설정
		int preYear = year - 1;
		int preMonth = month - 1;
		int totalCnt = 0;
		
		//2018년도 일 수 구하기
		totalCnt = preYear * 365 + 
				(preYear/4 - preYear/100 + preYear/400);
		
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for (int i = 0; i < preMonth; i++) {
			
			totalCnt += monthArray[i];
		}
		
		//해당 년도가 윤년인지 판단하고 윤년인 경우 3월 이상이면 1을 추가해준다.
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
	
		
		System.out.println("일\t월\t화\t수\t목\t금\t토\t");
		
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
			dayOfWeek = "월요일";
			break;
		case Calendar.TUESDAY:
			dayOfWeek = "화요일";
			break;
		case Calendar.WEDNESDAY:
			dayOfWeek = "수요일";
			break;
		case Calendar.THURSDAY:
			dayOfWeek = "목요일";
			break;
		case Calendar.FRIDAY:
			dayOfWeek = "금요일";
			break;
		case Calendar.SATURDAY:
			dayOfWeek = "토요일";
			break;
		case Calendar.SUNDAY:
			dayOfWeek = "일요일";
			break;

		}

		System.out.println(year + "년 " + month + "월" + day + "일은 " + dayOfWeek + "입니다");

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
