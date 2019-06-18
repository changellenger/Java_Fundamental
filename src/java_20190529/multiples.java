package java_20190529;

public class multiples {
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = a;
		b[1] =100;
		System.out.println(a[1]);
		
		int[] k = new int[4];
		
		for(int i =0;i<4;i++){
			k[i]=i;
			System.out.println(k[i]);
		}
		System.out.println("------------");
		
		int []l = k;

		for(int i =0;i<4;i++){
			System.out.println(k[i]);
		}
		System.out.println("------------");
		l[1] = 100;
		for(int i =0;i<4;i++){
			System.out.println(k[i]);
		}
		
		
	
	}
}
