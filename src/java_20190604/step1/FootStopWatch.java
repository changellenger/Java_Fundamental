package java_20190604.step1;
//1. �䱸������ �и� ������� ��� �ð��� �µ���ּ���
public class FootStopWatch {
	public long startTime;
	public long endTime;
	
	public double getElapsedTime(){
		return (double)(endTime-startTime)/(double)1000;
	}
	
	public static void main(String[] args) {
		FootStopWatch f = new FootStopWatch();
		
		f.startTime = System.currentTimeMillis();  //1970 �� 1��1�� �������� ���ݱ����� �и������� �ð�
		
		
		for(int i =0; i<2_000_000_000l;i++){
			
		}
		
		f.endTime = System.currentTimeMillis();
		
		double elapsedTime = f.getElapsedTime();
		System.out.println("����Ƚð� :" + elapsedTime);
	}

}
