package java_20190604.step4;

import java_20190604.step5.StopWatch;

public class StopMilliWatch  {
	public long startTime;
	public long endTime;
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