package com.alex.anagrams;

import java.util.HashMap;
import java.util.regex.Pattern;

/*
 * Given two strings find out if they're anagrams
 * 
 * private static boolean isAnagram(String string, String string2)
 */

public class Anagrams {

	boolean isAnagram(String first, String second) {

		if (first.isEmpty() || second.isEmpty())
			return false;

		if (Pattern.compile("\\d").matcher(first).find() || Pattern.compile("\\d").matcher(second).find())
			return false;

		HashMap<Character, Integer> map1 = new HashMap<>();
		for (Character character : first.toCharArray()) {
			character = Character.toLowerCase(character);
			if (map1.containsKey(character)) {
				map1.put(character, map1.get(character) + 1);
			} else {
				map1.put(character, 1);
			}
		}

		HashMap<Character, Integer> map2 = new HashMap<>();
		for (Character character : second.toCharArray()) {
			character = Character.toLowerCase(character);

			if (map2.containsKey(character)) {
				map2.put(character, map2.get(character) + 1);
			} else {
				map2.put(character, 1);
			}
		}

		if (map1.size() != map2.size())
			return false;

		for (Character chars3 : map1.keySet()) {
			if (!map1.containsKey(chars3) || !map2.containsKey(chars3)) {
				return false;
			}

			if (!map1.get(chars3).equals(map2.get(chars3))) {
				return false;
			}
		}

		return true;
	}
}
