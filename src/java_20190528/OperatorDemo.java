package java_20190528;

public class OperatorDemo {
	public static void main(String[] args) {
		/*
		 * �޷� �����
		 * 1. 1�� 1�� 1���� ������
		 * 2. ������ 4�⿡ �ѹ� 100���� ����� ���� 400���� ����� �����Ѵ�
		 * 2019�� 5�� 28���� ������ ���Ϸ��� 2018�� ���� �� �ϼ��� ���ϰ� 1������ 4������ �ϼ��� ���ϰ�  28���� ���ϸ� �� 
		 */
		
		int x,y,z;
		
		int totalday = 2019*365;
		
		x = 2018/4 ;
		y = 2018/100;
		z = 2018/400;
		
		totalday += x-y+z+(31+28+31+30)+28;

		totalday ++;
		
		int date = totalday%7;
		
		if(date == 1){
			System.out.println("mon");
		}else if(date==2){
			System.out.println("tue");
		}else if(date==3){
			System.out.println("wed");
		}else if(date==4){
			System.out.println("thu");
		}else if(date==5){
			System.out.println("fri");
		}else if(date==6){
			System.out.println("sat");
		}else if(date==0){
			System.out.println("sun");
		}
		
		
		
		int a = 10;
		System.out.println(a++);
		System.out.println(++a);
		
		int temp =123 ;
		int share  = temp%10 ==0 ? temp/10 : temp/10+1;
		System.out.println(share);
	}
}
