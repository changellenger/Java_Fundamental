package java_20190604;

public class ImplementClass implements InterB, InterC {

	@Override
	public void mB() {
		// TODO Auto-generated method stub
		System.out.println("implementClass - mB()");
	}

	@Override
	public void mC() {
		// TODO Auto-generated method stub

		System.out.println("implementClass - mC()");
	}
	
	
	public static void main(String[] args) {
		/*ImplementClass i = new ImplementClass();
		i.mB();
		i.mC();*/
		
		
		
		// InterB b = new InterB(); 불가함 오류발생
		InterB b = new ImplementClass();
		b.mB();
		
		InterC c = new ImplementClass();
		c.mC();
			
	}
}
