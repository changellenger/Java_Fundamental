package java_20190528;

public class ForDemo {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		for(;i<=10;i=i+2){
			sum = sum +i;
		}
		System.out.println("1���� "+(i-2)+"������ ¦���� ���� : "+ sum);
		
		
		
		/*
		for(int j = 2; j<=9; j++){
			for(int k =1; k<=9; k++){
				System.out.println(j+" X "+ k +" = "+j*k);
			}
		}
		*/
		
		//break - �ش� �ݺ��� ���� ����
		
		
		/*tt: for (){
				for(){
				
				if() break tt;
				}
	}
	
	 �ƿ� �� �������� tt��� �̸��� �ݺ��� ����
	 
	*
	*
	*/
		
		//continue - ���� �ڵ� ���� �ߴ� ��Ų�� ���� ������ �̵�
		
		//�Ҽ� ���ϱ� - 
		int cn=0;
		int count=0;
		for(int x= 2 ; x<=100; x++){
			if(x==2){
				count++;
				System.out.println(x+", N ="+count);
				}else{
			int z = 2;
			for(int y=2;y<x;y++){
				cn++;
				if(x%y==0){
					y=x;
				}else{
					z++;
					if(z==x){
						count++;
						System.out.println(z+", N ="+count);
					}
				}
				
			}
			
		}
		}
		System.out.println( "ctn"+cn);
		/*
		
		//�Ҽ� ���ϱ� - �����
		int primeCount =0;
		for(int a=1 ;a<=100;a++){
			int count =0;
			for(int k=1;k<=a;k++){
				if(a%k==0){
					count++;
				}
			}
			if(count==2){
				System.out.println(a+"�� �Ҽ��Դϴ�");
				primeCount++;
			}
		}
		System.out.println("�Ҽ��� ������ : "+primeCount);
		
		*/
		
	}
}
