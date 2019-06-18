package java_20190529;

public class CalendarDemo {
	public static void main(String[] args) {
		/*
		 * 달력 만들기 1. 1년 1월 1일은 월요일 2. 윤년은 4년에 한번 100년의 배수는 제외 400년의 배수는 포함한다
		 * 2019년 5월 28일의 요일을 구하려면 2018년 까지 총 일수를 구하고 1월부터 4월까지 일수를 구하고 28일을 더하면
		 * 
		 */

		int x, y, z;

		x = Integer.parseInt(args[0]); // year
		y = Integer.parseInt(args[1]); // month
		z = Integer.parseInt(args[2]); // date

		int totalday = (x - 1) * 365 + z+ ((x-1)/4 - (x-1)/100 + (x-1)/400);
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		for (int i = 0; i < y - 1; i++) {
			totalday += monthArray[i];
		}

		// 윤년인데 3월 이후일때 추가
		if (y >= 3 && (x % 4 == 0 && x % 100 != 0 || x % 400 == 0)) {
			totalday++;
		}

		int date = totalday % 7;
		String day = "";

		switch (date) {

		case 1:
			day = "월요일";
			break;
		case 2:
			day = "화요일";
			break;
		case 3:
			day = "수요일";
			break;
		case 4:
			day = "목요일";
			break;
		case 5:
			day = "금요일";
			break;
		case 6:
			day = "토요일";
			break;
		case 0:
			day = "일요일";
			break;

		}

		System.out.println(x + "년 " + y + "월" + z + "일은 " + day + "입니다");

	}
}