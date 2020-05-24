package com.alex;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ShortenChain {

	public static void main(String[] args) {

		System.out.println(compress("aaaabbbbbbbcc"));

	}

	private static String compress(String sequence) {

		//convert string to char array
		List<Character> chars = new ArrayList<Character>();

		for (char ch : sequence.toCharArray()) {
			chars.add(ch);
		}

		
		//update the hashmap with ocurrences
		HashMap<Character, Integer> seqMap = new HashMap<>();

		for (Iterator<Character> iterator = chars.iterator(); iterator.hasNext();) {
			Character elem = (Character) iterator.next();

			if (seqMap.containsKey(elem)) {
				seqMap.replace(elem, seqMap.get(elem) + 1);
			} else {
				seqMap.put(elem, 1);
			}

		}

		//create the output string
		StringBuilder sb = new StringBuilder();

		for (Character keys : seqMap.keySet()) {
			sb.append(keys).append(seqMap.get(keys));
		}

		return sb.toString();

	}

}
