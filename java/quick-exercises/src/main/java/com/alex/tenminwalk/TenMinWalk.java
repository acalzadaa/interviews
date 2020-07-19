package com.alex.tenminwalk;

public class TenMinWalk {

	public static boolean isValid(char[] walk) {
		int x = 0;
		int y = 0;
		boolean returnValue = false;

		for (char step : walk) {
			switch (step) {
			case 'n':
				y++;
				break;
			case 's':
				y--;
				break;
			case 'w':
				x--;
				break;
			case 'e':
				x++;
				break;
			default:
				break;
			}
		}

		if (x == 0 && y == 0 && walk.length == 10) {
			returnValue = true;
		} else {
			returnValue = false;
		}

		return returnValue;
	}

}
