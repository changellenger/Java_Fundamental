package java_20190610;

import java.util.Scanner;

public class pra {

	public static void main(String[] args) {

		int rn;

		Scanner scan = new Scanner(System.in);

		System.out.println("메시지를 입력하세요:");

		rn = scan.nextInt();

		System.out.println("room number : " + rn);

		int[] number = new int[10];

		for (int i = 0; i < number.length; i++) {
			number[i] = 0;
		}
		int max = 0;
		
		while (rn >= 10) {

			if (rn % 10 == 9 || rn% 10 ==6) {

				if (number[6] > number[9]) {

					number[9]++;

				} else {
					number[6]++;

				}
			} else {
				number[(rn % 10) ]++;
				;
			}

			rn = rn / 10;

		}

		number[rn]++;

		for (int i = 0; i < number.length; i++) {

			if (number[i] > max) {

				max = number[i];
			}

		}
		System.out.println("set of number : " + max);

	}
}
