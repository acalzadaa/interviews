package com.alex;

public class SwapVariables {

	
	
	public static void main(String[] args) {
			int x = 10;
			int y = 20;
			swap(x,y);
	}
//10 30
	private static void swap(int x, int y) {
		System.out.println("values: " + x + " and " + y);
		x = x + y; //40
		y = x - y;
		x = x - y;
		System.out.println("values: " + x + " and " + y);

	}

}
