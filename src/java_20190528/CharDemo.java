package java_20190528;

public class CharDemo {
	public static void main(String[] args) {
		//����ǥ����
		char a = 'q';
		
		
		//�����ڵ� ǥ����
		char b = '\uC548';
		char c = '\uCC3D';
 
		System.out.println(a+b+c);
		
		// \,' �ΰ��� ���ڴ� char ���� �ν��� ���ϱ⶧����
		// �ι��� �տ� \�� �ٿ��־� ���ڷ� �ν��ϰ� �ؾ� �Ѵ�.
		char f = '\\';
		char g = '\'';
		char h = '"';

		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		
		
		
		
		
		
		
	}
	
	
}
