package java_20190604.step1;
//1. 요구사항은 밀리 세컨드로 경과 시간을 맞들어주세요
public class FootStopWatch2 {
	public long startTime;
	public long endTime;
	
	public long startNanoTime;
	public long endNanoTime;
	
	
	
	public double getElapsedTime(){
		return (double)(endTime-startTime)/(double)1000;
	}
	

	public double getElapsedNanoTime(){
		return (double)(endNanoTime-startNanoTime)/(double)1000000000;
	}
	
	
	
	public static void main(String[] args) {
		FootStopWatch2 f = new FootStopWatch2();
		
		f.startNanoTime = System.nanoTime();  //1970 년 1월1일 기준으로 지금까지의 밀리세컨즈 시간
		
		
		for(int i =0; i<2_000_000_000l;i++){
			
		}
		
		f.endNanoTime = System.nanoTime();
		
		double elapsedTime = f.getElapsedNanoTime();
		System.out.println("경과된시간 :" + elapsedTime);
	}

}
