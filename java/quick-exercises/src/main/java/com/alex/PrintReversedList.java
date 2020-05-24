package com.alex;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PrintReversedList {

	public static void main(String[] args) {

		List<String> linkedList = new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");

		System.out.println(printReversedList(linkedList));
	}

	private static String printReversedList(List<String> linkedList) {
StringBuilder sb = new StringBuilder();

for (Iterator<String> iterator = linkedList.iterator(); iterator.hasNext();) {
	sb.append(iterator.next());
}

		return sb.reverse().toString();
	}


}
