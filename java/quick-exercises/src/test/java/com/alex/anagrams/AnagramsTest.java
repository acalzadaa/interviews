package com.alex.anagrams;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnagramsTest {

	@Test
	void testIsAnagram() {
		Anagrams testAnagrams = new Anagrams();
		
		assertFalse(testAnagrams.isAnagram("", "BAAB"));
		assertFalse(testAnagrams.isAnagram("ABBA", ""));
		assertFalse(testAnagrams.isAnagram("", ""));
		assertFalse(testAnagrams.isAnagram("1", "1"));
		assertFalse(testAnagrams.isAnagram("121", "211"));
		assertFalse(testAnagrams.isAnagram("222", "222"));

		assertTrue(testAnagrams.isAnagram("ABBA", "BAAB"));
		assertTrue(testAnagrams.isAnagram("abbA", "baaB"));

		assertTrue(testAnagrams.isAnagram("AaAa", "aAaA"));
		assertTrue(testAnagrams.isAnagram("aaaabbbbaaaa", "aaaabbaabbaa"));

	}

}
