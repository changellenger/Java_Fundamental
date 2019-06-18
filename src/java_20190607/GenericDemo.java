package java_20190607;

import java.util.ArrayList;

public class GenericDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		//list.add(10); string값으로 들어가야 출력가능
		
		for (int i = 0; i < list.size(); i++) {
				String temp = (String)list.get(i);
				System.out.println(temp);
				
		}
		
	}
}
