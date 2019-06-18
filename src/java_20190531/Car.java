package java_20190531;

public class Car {
	private String modelNumber;
	String color;
	protected int doorCount;
	public double price;
	
	
	
	
	public Car() {
		// alt shift s > c 디폴트 생성자
		super();
		// TODO Auto-generated constructor stub
	}
	
		// als shift s > o 매개변수있는 생성자
	
	
	public Car(String modelNumber, String color, int doorCount, double price) {
		super();
		this.modelNumber = modelNumber;
		this.color = color;
		this.doorCount = doorCount;
		this.price = price;
	}


	




}

