package com.alex;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(Palindrome.isPalindrome("Ana"));
	}

	private static boolean isPalindrome(String palindrome) {
		String lowercase = palindrome.toLowerCase();
		StringBuilder sb = new StringBuilder(lowercase);
		StringBuilder sbNew = new StringBuilder(lowercase);
		sbNew.reverse();
		
		for (int i = 0; i < sb.length() /2; i++) {
			if(sb.charAt(i) != sbNew.charAt(i)) {
				return false;
			}
		}
		
		return true;
	}

}
