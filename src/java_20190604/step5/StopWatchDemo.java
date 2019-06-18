package java_20190604.step5;

public class StopWatchDemo {

	public static void execute(StopWatch sw) {
		sw.start();

		for (int i = 0; i < 2_000_000_000l; i++) {

		}
		sw.stop();
		System.out.println("경과시간: " + sw.getElapsedTime());
	}


	public static void main(String[] args) {
		StopWatch sm = new StopMilliWatch();
		execute(sm);

		StopWatch sn = new StopNanoWatch();
		execute(sn);
		
		StopWatch smc = new StopMicroWatch();
		execute(smc);
	}
}
