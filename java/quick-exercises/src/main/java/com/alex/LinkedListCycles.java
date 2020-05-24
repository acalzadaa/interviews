package com.alex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCycles {

	// Given a linked list, determine whether it contains a cycle.
	// User FLOYD cycle-finding
	public static void main(String[] args) {

		LinkedList<Integer> cycle = new LinkedList<>();
		cycle.addLast(1);
		cycle.addLast(2);
		cycle.addLast(2);
		cycle.addLast(4);
		cycle.addLast(2);

		System.out.println(isCycle(cycle));
	}

	private static boolean isCycle(LinkedList<Integer> cycle) {
		HashMap<Integer, Integer> cycleTest = new HashMap<>();
		boolean isCyclic = false;

		for (Iterator<Integer> iterator = cycle.iterator(); iterator.hasNext();) {
			Integer cycleRound = iterator.next();
			System.out.println(cycleRound);
			if (cycleTest.containsKey(cycleRound)) {
				cycleTest.replace(cycleRound, cycleTest.get(cycleRound) + 1);
				isCyclic = true;
				break;
			} else {
				cycleTest.put(cycleRound, 0);
			}
		}

		return isCyclic;
	}

}
