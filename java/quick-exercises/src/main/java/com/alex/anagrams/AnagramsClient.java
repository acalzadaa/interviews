package com.alex.anagrams;
/*
 *  Create a method that evaluates if TWO strings are ANAGRAMS 
 *  and RETURN a BOOLEAN
 *  
 *  - ANAGRAM is when the TWO strings have the SAME letters but in different order
 *  - ONLY ALPHANUMERIC, NO DIGITS
 *  - IGNORE THE CASE!!
 *  
 */
public class AnagramsClient {

	public static void main(String[] args) {

		boolean returnValue = new Anagrams().isAnagram("Abba", "baab");
		System.out.println(returnValue);
		
	}

}
