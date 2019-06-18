package java_20190611;

import java.io.File;
import java.util.Calendar;

public class FileDemo {
	public boolean mkdir(String path) {
		boolean isSuccess = false;
		File f1 = new File(path);
		boolean isExisted = f1.isDirectory();
		if (!isExisted) {
			isSuccess = f1.mkdirs(); // 경로에있는 디렉토리 다 만들어줌
			// boolean isSuccess = f1.mkdir(); 맨 마지막 경로 디렉토리만 만들어줌
			System.out.println("디렉토리 만들기 성공");
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

		// 파일 크기 구하기
		File f1 = new File("c:\\down", "aaa.exe");
		long fileSize = f1.length();

		System.out.println(fileSize);

		// 파일 크기 출력
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
				System.out.println(value + "- 디렉토리");

			} else if (f4.isFile()) {
				long size = f4.length();
				System.out.println(value + "- 파일(" + size + ")");
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
		System.out.println(year + "년" + month + "월" + day + "일");
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

		switch (dayOfWeek) {
		case Calendar.MONDAY:
			System.out.println("월");
			break;
		case Calendar.TUESDAY:
			System.out.println("화");
			break;
		case Calendar.WEDNESDAY:
			System.out.println("수");
			break;
		case Calendar.THURSDAY:
			System.out.println("목");
			break;
		case Calendar.FRIDAY:
			System.out.println("금");
			break;
		case Calendar.SATURDAY:
			System.out.println("토");
			break;
		case Calendar.SUNDAY:
			System.out.println("일");
			break;

		}

	}
}
