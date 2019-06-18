package java_20190611;

public class SynchronizedDemo implements Runnable {
	int x = 0;
	int y = 0;

	@Override
	public void run() {

		// TODO Auto-generated method stub
		synchronized (this) {
			for (int i = 0; i < 20; i++) {

				x++;
				y++;
				String threadName = Thread.currentThread().getName();
				System.out.printf("x: %d, y : %d, threadName: %s%n", x, y, threadName);
			}
		}
	}

	public static void main(String[] args) {
		SynchronizedDemo s1 = new SynchronizedDemo();
		Thread t1 = new Thread(s1, "1st Thread");

		Thread t2 = new Thread(s1, "2nd Thread");
		t1.start();
		t2.start();

	}
}