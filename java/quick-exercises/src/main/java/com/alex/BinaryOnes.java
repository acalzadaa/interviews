package com.alex;
/*
 * Given a Binary number return the number of 1's
 */
public class BinaryOnes {

	public static void main(String[] args) {
		System.out.println(binaryOnes(100));
	}

	private static int binaryOnes(int i) {
		int x = i;
		int acum = 0;
		while (x > 0) {
			if ((x & 1) == 1) {
				acum++;
			}
			x = x >> 1;
		}

		return acum;
	}

}
