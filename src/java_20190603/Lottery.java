package java_20190603;

public class Lottery {

	public void print(int count) {
		int[] number = new int[45];
		int random;
		int n = 0;
		while (n < count) {

			for (int k = 0; k < 45; k++) {
				number[k] = k + 1;
			}

			// int[] check = new int[6];

			for (int k = 0; k < 6; k++) {
				if (k == 0) {

					random = (int) (Math.random() * 45) + 1;
					System.out.print(random + "\t");
					// check[k]=random;
					number[random - 1] = 0;
				} else {
					random = (int) (Math.random() * 45) + 1;
					while (number[random - 1] == 0) {
						random = (int) (Math.random() * 45) + 1;
						// check[k]=random;
					}
					System.out.print(random + "\t");
					number[random - 1] = 0;

				}
			}
			System.out.println("");
			n++;
		}

	}
}
