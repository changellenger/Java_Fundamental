package java_20190610;

public class TryCatchFinallyDemo {
public static void main(String[] args) {
/*	if(args.length != 2){
		System.err.println("usage : java TryCatchFinallyDemo " + "[��������] [��������]");
		 return;	//������ ������� ���ǿ� ���� ������ ���Ḧ ���ѹ���
		 		
	}*/
	
	//Integer.parseInt() �ż���� ���ڰ� �ƴ� ���ڿ��� ���, �� �Ϲ� ���ڿ��� ���
	//NumberFormatException ���ܰ� �߻���
	
	
	try {
		int korea = Integer.parseInt(args[0]);
		
		//JVM�� ������ ���� ��Ű��, ���� ��ü�� NumberFormatException ��ü�� ��������   Catch ���� ã�´�
		
		int english = Integer.parseInt(args[1]);
		double avg = average(korea, english);
		System.out.printf("��� : %.2f %n",avg);
		
		
	} catch (NumberFormatException e) {
		//JVM �޼����� �����ϰ� ��µ�
		//e.printStackTrace();
		//System.err.println("���ܸ޼��� : " +e.getMessage());
		System.err.println("���ڸ� �Է��ϼž� �մϴ�");
		
		// TODO: handle exception
	}catch (ArrayIndexOutOfBoundsException e) {
		//JVM �޼����� �����ϰ� ��µ�
		//e.printStackTrace();
		//System.err.println("���ܸ޼��� : " +e.getMessage());
		System.err.println("usage : java TryCatchFinallyDemo " + "[��������] [��������]");
		
		// TODO: handle exception
	} finally{
		System.out.println("finally block");
	}
	
}

 public static double average (int i, int j){
	 return (i+j)/2;
 }




}
