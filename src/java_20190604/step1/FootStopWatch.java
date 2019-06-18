package java_20190604.step1;
//1. 요구사항은 밀리 세컨드로 경과 시간을 맞들어주세요
public class FootStopWatch {
	public long startTime;
	public long endTime;
	
	public double getElapsedTime(){
		return (double)(endTime-startTime)/(double)1000;
	}
	
	public static void main(String[] args) {
		FootStopWatch f = new FootStopWatch();
		
		f.startTime = System.currentTimeMillis();  //1970 년 1월1일 기준으로 지금까지의 밀리세컨즈 시간
		
		
		for(int i =0; i<2_000_000_000l;i++){
			
		}
		
		f.endTime = System.currentTimeMillis();
		
		double elapsedTime = f.getElapsedTime();
		System.out.println("경과된시간 :" + elapsedTime);
	}

}
