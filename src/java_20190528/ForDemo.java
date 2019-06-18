package java_20190528;

public class ForDemo {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		for(;i<=10;i=i+2){
			sum = sum +i;
		}
		System.out.println("1부터 "+(i-2)+"까지의 짝수의 합은 : "+ sum);
		
		
		
		/*
		for(int j = 2; j<=9; j++){
			for(int k =1; k<=9; k++){
				System.out.println(j+" X "+ k +" = "+j*k);
			}
		}
		*/
		
		//break - 해당 반복문 블럭을 나감
		
		
		/*tt: for (){
				for(){
				
				if() break tt;
				}
	}
	
	 아예 다 나가버림 tt라는 이름의 반복문 중지
	 
	*
	*
	*/
		
		//continue - 이하 코드 진행 중단 시킨뒤 다음 루프로 이동
		
		//소수 구하기 - 
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
		
		//소수 구하기 - 강사님
		int primeCount =0;
		for(int a=1 ;a<=100;a++){
			int count =0;
			for(int k=1;k<=a;k++){
				if(a%k==0){
					count++;
				}
			}
			if(count==2){
				System.out.println(a+"는 소수입니다");
				primeCount++;
			}
		}
		System.out.println("소수의 갯수는 : "+primeCount);
		
		*/
		
	}
}
