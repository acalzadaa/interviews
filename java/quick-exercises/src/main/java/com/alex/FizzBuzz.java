package com.alex;
import java.util.Arrays;

public class FizzBuzz {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(fizzbuzz(25)));

	}

	private static String[] fizzbuzz(int i) {

		String[] fizzbuzzArray = new String[i];

		for (int j = 1; j <= i; j++) {
			if (j % 3 == 0 && j % 5 != 0) {
				fizzbuzzArray[j - 1] = "Fizz";
			}

			if (j % 5 == 0 && j % 3 != 0) {
				fizzbuzzArray[j - 1] = "Buzz";
			}
			if (j % 5 == 0 && j % 3 == 0) {
				fizzbuzzArray[j - 1] = "FizzBuzz";
			}
			if (j % 5 != 0 && j % 3 != 0) {
				fizzbuzzArray[j - 1] = new Integer(j).toString();
			}
		}

		return fizzbuzzArray;

	}

}
