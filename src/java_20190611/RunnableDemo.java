package java_20190611;

public class RunnableDemo implements Runnable{
	int x=0;
	int y=0;
	
	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		for (int i = 0; i < 20; i++) {
			
			x++;
			y++;
			String threadName = Thread.currentThread().getName();
			System.out.printf("x: %d, y : %d, threadName: %s%n", x,y,threadName);
			
		}
	}
	
	public static void main(String[] args) {
		
		// extends Thread �� �ٸ��� implements Runnalbe �� �̿��ϸ� �����忡�� ��ü�� ������ �� ���� 
		// 
		
		System.out.println("************start************");
		RunnableDemo r1 = new RunnableDemo();
		Thread t1 = new Thread(r1,"1st Thread");
		System.out.println("ù��° ������ �켱���� :" +t1.getPriority());
		t1.start();	// thread ���� overriding �� run method ����
		
		RunnableDemo r2 = new RunnableDemo();
		Thread t2 = new Thread(r2,"2nd Thread");
		System.out.println("�ι�° ������ �켱���� :" +t2.getPriority());
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		
		System.out.println("*************end*************");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
