package com.alex;
import java.util.*;

public class ZooAnimals {
	public static boolean IsValid(String[][] zooGrid) {

		// rule elephant far from mouse
		// rule snake far from mongoose and mouse

		boolean flag = true;

		for (int i = 0; i < zooGrid.length; i++) {
			for (int j = 0; j < zooGrid[i].length; j++) {

				if (zooGrid[i][j].equals("elephant")) {
					if (i > 0) {
						if (zooGrid[i - 1][j].equals("mouse")) {
							flag = false;
							break;
						}
						if (j > 0) {
							if (zooGrid[i - 1][j - 1].equals("mouse")) {
								flag = false;
								break;
							}
						}
						if (j < zooGrid[i].length - 1) {
							if (zooGrid[i - 1][j + 1].equals("mouse")) {
								flag = false;
								break;
							}
						}

					}
					if (i < zooGrid.length - 1) {
						if (zooGrid[i + 1][j].equals("mouse")) {
							flag = false;
							break;
						}
						if (j > 0) {
							if (zooGrid[i + 1][j - 1].equals("mouse")) {
								flag = false;
								break;
							}
						}
						if (j < zooGrid[i].length - 1) {
							if (zooGrid[i + 1][j + 1].equals("mouse")) {
								flag = false;
								break;
							}
						}

					}
					if (j > 0) {
						if (zooGrid[i][j - 1].equals("mouse")) {
							flag = false;
							break;
						}
					}

					if (j < zooGrid[i].length - 1) {
						if (zooGrid[i][j + 1].equals("mouse")) {
							flag = false;
							break;
						}

					}

				}

				if (zooGrid[i][j].equals("snake")) {

					if (i > 0) {
						if (zooGrid[i - 1][j].equals("mongoose")) {
							flag = false;
							break;
						}

						if (j > 0) {
							if (zooGrid[i - 1][j - 1].equals("mongoose")) {
								flag = false;
								break;
							}
						}
						if (j < zooGrid[i].length - 1) {
							if (zooGrid[i - 1][j + 1].equals("mongoose")) {
								flag = false;
								break;
							}
						}

						if (zooGrid[i - 1][j].equals("mouse")) {
							flag = false;
							break;
						}

						if (j > 0) {
							if (zooGrid[i - 1][j - 1].equals("mouse")) {
								flag = false;
								break;
							}
						}
						if (j < zooGrid[i].length - 1) {
							if (zooGrid[i - 1][j + 1].equals("mouse")) {
								flag = false;
								break;
							}
						}

					}
					if (i < zooGrid.length - 1) {
						if (zooGrid[i + 1][j].equals("mongoose")) {
							flag = false;
							break;
						}

						if (j > 0) {
							if (zooGrid[i + 1][j - 1].equals("mongoose")) {
								flag = false;
								break;
							}
						}
						if (j < zooGrid[i].length - 1) {
							if (zooGrid[i + 1][j + 1].equals("mongoose")) {
								flag = false;
								break;
							}
						}

						if (zooGrid[i + 1][j].equals("mouse")) {
							flag = false;
							break;
						}

						if (j > 0) {
							if (zooGrid[i + 1][j - 1].equals("mouse")) {
								flag = false;
								break;
							}
						}
						if (j < zooGrid[i].length - 1) {
							if (zooGrid[i + 1][j + 1].equals("mouse")) {
								flag = false;
								break;
							}
						}

					}
					if (j > 0) {
						if (zooGrid[i][j - 1].equals("mongoose")) {
							flag = false;
							break;
						}
						if (zooGrid[i][j - 1].equals("mouse")) {
							flag = false;
							break;
						}
					}

					if (j < zooGrid[i].length - 1) {
						if (zooGrid[i][j + 1].equals("mongoose")) {
							flag = false;
							break;
						}
						if (zooGrid[i][j + 1].equals("mouse")) {
							flag = false;
							break;
						}
					}

				}
			}
		}

		return flag;

	}

	public static void main(String[] args) {
		String zooGrid[][] = { { "", "", "", "", "" }, { "", "", "elephant", "snake", "" },
				{ "", "", "mongoose", "", "" }, { "", "mouse", "", "elephant", "" }, { "", "", "", "", "" } };

		System.out.println("Upper bound of the first dimension:  " + zooGrid[0].length);
		System.out.println("Upper bound of the second dimension: " + zooGrid[1].length);
		System.out.println(IsValid(zooGrid));
	}
}