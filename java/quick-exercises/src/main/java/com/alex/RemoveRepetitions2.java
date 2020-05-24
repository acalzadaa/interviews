package com.alex;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveRepetitions2 {
	public static String transform(String input) {

		List<Character> chars = new ArrayList<Character>();
		List<Character> singleChar = new ArrayList<Character>();

		for (char ch : input.toCharArray()) {
			chars.add(ch);
		}
		
		Character charUnity = '&';
		
		for (int i = 0; i < chars.size(); i++) {

			if(charUnity != chars.get(i)) {
				charUnity = chars.get(i);
				singleChar.add(charUnity);
			}

		}
		
		return singleChar.toString();

	}

	public static void main(String[] args) {
		System.out.println(RemoveRepetitions2.transform("abbcbbb"));
	}
}