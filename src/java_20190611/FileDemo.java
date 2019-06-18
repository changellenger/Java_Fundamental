package java_20190611;

import java.io.File;
import java.util.Calendar;

public class FileDemo {
	public boolean mkdir(String path) {
		boolean isSuccess = false;
		File f1 = new File(path);
		boolean isExisted = f1.isDirectory();
		if (!isExisted) {
			isSuccess = f1.mkdirs(); // ��ο��ִ� ���丮 �� �������
			// boolean isSuccess = f1.mkdir(); �� ������ ��� ���丮�� �������
			System.out.println("���丮 ����� ����");
		}

		return isSuccess;
	}

	public String getComma(int number) {

		return String.format("%,d", number);

	}

	public String getComma(double number, int precision) {

		return String.format("%,." + precision + "f", number);

	}

	public String getComma(double number) {

		return String.format("%,f", number);

	}

	public String getComma(long number) {

		return String.format("%,d", number);

	}

	public void cahngeFile(String path) {
		File f1 = new File(path);
		String fileName = f1.getName();

		String name = fileName.substring(0, fileName.lastIndexOf("."));
		String extension = fileName.substring(fileName.lastIndexOf("."), fileName.length());
		name = String.valueOf(System.currentTimeMillis());
		name += extension;
		System.out.println(name);
		System.out.println(extension);

		String parent = f1.getParent();
		File f2 = new File(parent, name);

		f1.renameTo(f2);
	}

	public static void main(String[] args) {
		FileDemo f = new FileDemo();
		// f.mkdir("c:\\down2\\2019\\06\\11");

		// ���� ũ�� ���ϱ�
		File f1 = new File("c:\\down", "aaa.exe");
		long fileSize = f1.length();

		System.out.println(fileSize);

		// ���� ũ�� ���
		/*
		 * String fileLength = String.format("%,d", Math.round((double) fileSize
		 * / (double) 1024));
		 */

		String fileLength = f.getComma(Math.round((double) fileSize / (double) 1024));
		System.out.println(fileLength + "KB");

		String fileName = f1.getName();
		String path = f1.getPath();

		String name = fileName.substring(0, fileName.lastIndexOf("."));
		String extension = fileName.substring(fileName.lastIndexOf("."), fileName.length());
		name = String.valueOf(System.currentTimeMillis());
		name += extension;
		System.out.println(name);
		System.out.println(extension);

		System.out.println(fileName);
		System.out.println(path);

		File f2 = new File("c:\\down", name);
		f1.renameTo(f2);

		File f3 = new File("C:\\ ");
		String[] list = f3.list();

		for (String value : list) {
			File f4 = new File(f3, value);
			if (f4.isDirectory()) {
				System.out.println(value + "- ���丮");

			} else if (f4.isFile()) {
				long size = f4.length();
				System.out.println(value + "- ����(" + size + ")");
			}
		}

		File f5 = new File("c:\\down\\jre-8u211-windows-x64.exe");
		long lastModified = f5.lastModified();
		
		
		
		
		Calendar c = Calendar.getInstance();
		// c.set(2019, 5,10);
		c.setTimeInMillis(lastModified);

		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DATE);
		System.out.println(year + "��" + month + "��" + day + "��");
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

		switch (dayOfWeek) {
		case Calendar.MONDAY:
			System.out.println("��");
			break;
		case Calendar.TUESDAY:
			System.out.println("ȭ");
			break;
		case Calendar.WEDNESDAY:
			System.out.println("��");
			break;
		case Calendar.THURSDAY:
			System.out.println("��");
			break;
		case Calendar.FRIDAY:
			System.out.println("��");
			break;
		case Calendar.SATURDAY:
			System.out.println("��");
			break;
		case Calendar.SUNDAY:
			System.out.println("��");
			break;

		}

	}
}
