package com.alex;
/* 
 * consider a clock, given two values, hour and minutes, find the angle between the two hands
 */
public class ClockAngle {

	public static void main(String[] args) {

		int hour = 12;
		int minutes = 15;
		
		System.out.println(findAngle(hour, minutes));
	}

	private static double findAngle(int hour, int minutes) {

		int anglePerHour = 360/12;
		int anglePerMinute = 360/60;
		
		double angleHour = anglePerHour * (hour == 12 ? 0 : hour);
		double angleMinute = anglePerMinute * minutes;
		
		return Math.abs(angleHour - angleMinute);
		
		
	}

}
