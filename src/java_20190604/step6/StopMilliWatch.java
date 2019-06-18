package java_20190604.step6;

public class StopMilliWatch extends StopWatchAbs{


	public void start() {
		startTime = System.currentTimeMillis();

	}

	public void stop() {
		endTime = System.currentTimeMillis();
	}

	public double getElapsedTime() {
		return (double) (endTime - startTime) / (double) 1000;
	}

}
