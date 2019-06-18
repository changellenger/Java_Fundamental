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
		
		// extends Thread 와 다르게 implements Runnalbe 을 이용하면 쓰레드에서 객체를 공유할 수 있음 
		// 
		
		System.out.println("************start************");
		RunnableDemo r1 = new RunnableDemo();
		Thread t1 = new Thread(r1,"1st Thread");
		System.out.println("첫번째 스레드 우선순위 :" +t1.getPriority());
		t1.start();	// thread 안의 overriding 된 run method 실행
		
		RunnableDemo r2 = new RunnableDemo();
		Thread t2 = new Thread(r2,"2nd Thread");
		System.out.println("두번째 스레드 우선순위 :" +t2.getPriority());
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		
		System.out.println("*************end*************");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
