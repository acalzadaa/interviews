package com.alex;
import java.util.Iterator;
import java.util.LinkedList;

public class EqualHalvesLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		split(list);

		
	}

	private static void split(LinkedList<Integer> list) {
		System.out.println(list.size());

		//cuanto mide?
		double sizeOfList = (double) list.size() /2;
		System.out.println(sizeOfList);

		long firstSize =  Math.round(sizeOfList);
		long secondSize = list.size() - firstSize;
		
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		
		System.out.println("List size: " + list.size() + " 1:" + list1.size() + " 2:" + list2.size());
		for (int i = 0; i < firstSize; i++) {
			list1.add(list.getFirst());
			list.removeFirst();
			System.out.println("List size: " + list.size() + " 1:" + list1.size() + " 2:" + list2.size());

		}
		System.out.println("List size out: " + list.size() + " 1:" + list1.size() + " 2:" + list2.size());
		for (int i = 0; i < secondSize; i++) {
			list2.add(list.getFirst());
			list.removeFirst();
			System.out.println("List size: " + list.size() + " 1:" + list1.size() + " 2:" + list2.size());

		}
		
		for (Iterator iterator = list1.iterator(); iterator.hasNext();) {
			System.out.println("1: " + iterator.next());
		}
		
		for (Iterator iterator = list2.iterator(); iterator.hasNext();) {
			System.out.println("2: " + iterator.next());
			
		}
		
	}

}
