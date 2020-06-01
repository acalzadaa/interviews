package com.alex.anagrams;
/*
 *  Create a method that evaluates if TWO strings are ANAGRAMS 
 *  and RETURN a BOOLEAN
 *  
 *  - ANAGRAM is when the TWO strings have the SAME letters but in different order
 *  - IGNORE THE CASE!!
 *  
 */
public class Client {

	public static void main(String[] args) {

		boolean returnValue = new Anagrams().isAnagram("Abba", "baab");
		System.out.println(returnValue);
		
	}

}
