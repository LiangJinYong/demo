package demo;

import java.util.Arrays;
import java.util.List;
public class ArrayDemo {

	public static void main(String[] args) {

		String[] typeArr = { "WH", "RL", "SL", "TB", "DV", "DF", "LO", "UL", "PG", "UP" };

		boolean contains = Arrays.asList(typeArr).contains("SS");
		System.out.println(contains);

		String str = "";
		String[] split = str.split("\\|");
		System.out.println(Arrays.toString(split));
		List<String> strList = Arrays.asList(typeArr);
		String join = String.join(",", strList);
		System.out.println(join);

		String a = "Y|http://www.baidu.com";

		if (a != null && a.length() >= 3 && a.startsWith("Y|")) {
			System.out.println("aaa");
		}

		// String name = JOptionPane.showInputDialog("What is your name?");
		//
		// String message = String.format("Welcome, %s, to Java Programming!", name);
		//
		// JOptionPane.showMessageDialog(null, message, "Java",
		// JOptionPane.INFORMATION_MESSAGE);

		StringBuilder sb = new StringBuilder();
		sb.ensureCapacity(12);

		String[] word = { "left", "back", "front", "right" };
		System.out.println("Before sorting: " + Arrays.toString(word));

		Arrays.sort(word, (first, second) -> first.compareTo(second));
		System.out.println("After sorting: " + Arrays.toString(word));
	}
}