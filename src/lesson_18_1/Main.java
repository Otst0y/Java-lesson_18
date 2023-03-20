package lesson_18_1;

import java.util.ArrayList;

public class Main {
	
	static void addString(ArrayList stringList) {
		stringList.add("String");
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> intList = new ArrayList();
		
		intList.add(0);
		
		System.out.println(intList);
		
		addString(intList);
		
		System.out.println(intList);

	}

}
