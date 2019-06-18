package java_20190605;

import java.text.DecimalFormat;

public class MathDemo {
	public static void main(String[] args) {
		
		
		//¿Ã¸²
		double d1 = Math.ceil(4.5);
		
		System.out.println( d1);
		
		double d2 = Math.floor(12.45);
		System.out.println(d2);
		
		long d3 = Math.round(42.5f);
		System.out.println(d3);
		
		
		double d4 = Math.abs(-42);
		System.out.println(d4);
	
		double d5 = Math.max(4.5, 2.3);
		System.out.println( d5);
		
		double d6 =Math.min(35.67, 45.23);
		System.out.println(d6);
		
		double d7 =Math.sqrt(4);
		System.out.println( d7);
		
		double d8 = Math.pow(2, 3);
		System.out.println( d8);
		
		double d9 = Math.random();
		System.out.println(d9);
		
		DecimalFormat cf = new DecimalFormat("#,###.###");
		String str = cf.format(123456.8868);
		
		System.out.println(cf);
	}
}
