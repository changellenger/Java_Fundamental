package java_20190529;

public class ArrayDemo {
	public static void main(String[] args) {
		// int �迭 ����
		int[] test = new int[4];

		// �迭 �Ҵ�
		test[0] = 1;
		test[1] = 2;
		test[2] = 3;
		test[3] = 4;

		int[] test1 = new int[4];

		test1[0] = 100;
		test1[1] = 200;
		test1[2] = 300;
		test1[3] = 400;

		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
		}

		for (int value : test) {
			System.out.println(value + " enhance");
		}

		// test2 �� test1�� ���������� ����Ű�� �迭�� ���� ���� ����
		//int[] test2 = test1;

		//test2[3] = 4000;

		System.out.println(test1[3]);

		int[][] test3 = new int[2][3];
		test3[0][0] = 10;
		test3[0][1] = 20;
		test3[0][2] = 30;
		test3[1][0] = 40;
		test3[1][1] = 50;
		test3[1][2] = 60;
		int[][] test4 = { { 10, 20, 30 }, { 40, 50, 60 } };
		
		for (int i = 0; i < test4.length; i++) {
			for (int j = 0; j < test4[i].length; j++) {
				System.out.println(test4[i][j]);
			}
		}
		
		for (int[] is : test4) {
			for (int value : is) {
				System.out.println(value);
				
			}
		}
		
		
		int[] test5 = new int[8];
		System.arraycopy(test1, 0, test5, 0, 4);
		//				����	// ���    //������ //  ������ ���� ��ġ//���� ���ۺ��� ���� ����
		
		test5[4]= 500;
		test5[5]= 600;
		test5[6]= 700;
		test5[7]= 800;
		
		for (int i = 0; i < test5.length; i++) {
			System.out.println(test5[i]);
		}
		
		
		
		
		
		
	}
}
