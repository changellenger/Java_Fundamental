package java_20190604.step6;

public class StopNanoWatch extends StopWatchAbs {

	public void start() {
		startTime = System.nanoTime();

	}

	public void stop() {
		endTime = System.nanoTime();
	}

	public double getElapsedTime() {
		return (double) (endTime - startTime) / (double) 1000000000;
	}

}
