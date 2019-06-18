package java_20190531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalendarDemo {
	// 키보드로 입력받은 한줄을 반환하는 함수
	public static String console() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}

	public static void main(String[] args) throws IOException {

		Calendar c = null;

		while (true) {
			System.out.println("날짜를 입력하세요>");
			String readLine = console();

			System.out.println("한줄읽은 문자열: " + readLine);

			if (readLine.equals("bye"))
				break;

			// split("") 공백문자로 문자열을 분리해서 배열로 변환 해주는 함수
			String[] data = readLine.split(" ");
			c = new Calendar();
			if (data.length == 1) {
				int year = Integer.parseInt(data[0]);
				c.print(year);
			} else if (data.length == 2) {
				int year = Integer.parseInt(data[0]);
				int month = Integer.parseInt(data[1]);
				c.print(year, month);
			} else if (data.length == 3) {
				int year = Integer.parseInt(data[0]);
				int month = Integer.parseInt(data[1]);
				int day = Integer.parseInt(data[2]);
				c.print(year, month, day);
			}
		}

	}

}
