package com.alex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class MergeNames {

	public static String[] uniqueNames(String[] names1, String[] names2) {

		ArrayList<String> listOfNames = new ArrayList<>();

		listOfNames.addAll(Arrays.asList(names1));
		listOfNames.addAll(Arrays.asList(names2));

		// eliminate the repeated ones
		HashSet<String> uniqueListOfNames = new HashSet<>(listOfNames);
		String[] arrayOfNames = new String[uniqueListOfNames.size()];
		arrayOfNames = uniqueListOfNames.toArray(arrayOfNames);
		return arrayOfNames;
	}

	public static void main(String[] args) {
		String[] names1 = new String[] { "Ava", "Emma", "Olivia" };
		String[] names2 = new String[] { "Olivia", "Sophia", "Emma" };
		System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma,
																						// Olivia, Sophia
	}
}