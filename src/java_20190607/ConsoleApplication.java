package java_20190607;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ConsoleApplication {

	private ArrayList<Member> list;

	// �Է¹��� ������ ��ȯ�ϴ� �Լ�
	public String console(String message) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(message);
		return br.readLine();
	}

	public ConsoleApplication() {
		list = new ArrayList<Member>();

	}

	public void print() {
		System.out.println("***********************************************");
		System.out.println("1. Insert 2. Update 3. Delete 4. Search 5. Exit");
		System.out.println("***********************************************");

	}

	public void execute(String message) throws IOException {
		if (message.equals("1")) {
			insert();
		} else if (message.equals("2")) {
			update();
		} else if (message.equals("3")) {
			delete();
		} else if (message.equals("4")) {
			search();
		} else if (message.equals("5")) {
			System.out.println("���α׷��� �����մϴ�.");
		}
	}

	// 1. ���̵� �Է¹޴´�
	// 2. �̸��� �Է¹޴´�.
	// 3. ��� ����Ʈ�� �߰��Ѵ�
	// 4. ArrayList �� �ִ� ��� ���� ����Ѵ�
	// 5. print() �Լ�ȣ��
	// 6. �����ϼ��� �޼��� ȣ��
	public void insert() throws IOException {

		String id = console("���̵� �Է��ϼ��� : ");
		String name = console("�̸��� �Է��ϼ��� : ");
		Member m = new Member(name, id);

		// ����Ʈ�� �߰�
		list.add(m);
		common();
	}

	// 1. ������ ���̵� �Է¹޴´�.
	// 2. ArrayList ���� ������ ���̵� ã�Ƽ� �����ϸ� �̸��� �Է¹޴´�.
	// 3.

	public void update() throws IOException {
		String updateId = console("������ ���̵� : ");
		boolean isExisted = false;
		for (Member m : list) {
			if (updateId.equals(m.getId())) {
				isExisted = true;
				break;
			}
		}
		if (isExisted) {
			String updateName = console("������ �̸� : ");
			for (int i = 0; i < list.size(); i++) {
				Member m1 = list.get(i);
				if (updateId.equals(m1.getId())) {

					m1.setName(updateName);

					break;
				}
			}
		} else {
			System.out.println("������ �Ƶ�� �����ϴ�");
		}

		common();

	}

	public void delete() throws IOException {
		String updateId = console("������ ���̵� : ");
		boolean isExisted = false;
		for (int i = 0; i < list.size(); i++) {
			Member m1 = list.get(i);
			if (updateId.equals(m1.getId())) {
				isExisted = true;
				list.remove(i);
				
				break;
			}
		}
		if(!isExisted){
			System.out.println("������ ���̵� �����ϴ�.");
		}
			
		
		// ��Ŭ�� refactor >> extract method ����� �ڵ� �޼ҵ�ȭ 
		common();
		
		

	}

	private void common() throws IOException {
		for (Member m1 : list) {
			System.out.println(m1);
		}
		print();
		String message = console("�����ϼ��� : ");
		execute(message);
	}

	public void search()throws IOException {
		String searchId = console("�˻��� ���̵� : ");
		for (int i = 0; i < list.size(); i++) {
			Member m1 = list.get(i);
			if (searchId.equals(m1.getId())) {
				System.out.println(m1 +" �� "+(i+1)+" ��° �����Դϴ�");
			}
		}

		common();

	}

	public static void main(String[] args) throws IOException {
		ConsoleApplication c = new ConsoleApplication();
		c.print();
		String message = c.console("�����ϼ��� : ");
		c.execute(message);

	}
}
