package com.alex;

public class LineIntersectEq {

	public static void main(String[] args) {
		System.out.println(intersect("2x + 2", "2x - 2"));
	}

	private static boolean intersect(String line1, String line2) {
		System.out.println(line1 + " " + line2);

		line1 = line1.replace(" ", "");
		line2 = line2.replace(" ", "");

		System.out.println(line1 + " " + line2);

		String[] eq1 = line1.split("x");
		String[] eq2 = line2.split("x");

		System.out.println(eq1.length + " " + eq2.length);

		double x1 = (-1 * new Double(eq1[1])) / new Double(eq1[0]);
		double y1 = Double.parseDouble(eq1[0]);
		System.out.println(x1 + " a " + y1);

		double x2 = (-1 * new Double(eq2[1])) / new Double(eq2[0]);
		double y2 = Double.parseDouble(eq2[0]);
		System.out.println(x2 + " a " + y2);

		System.out.println((y1 / x1) + " m " + (-1 * (y2 / x2)));

		return ((y1 / x1) == (-1 * (y2 / x2))) ? true : false;


	}

}
