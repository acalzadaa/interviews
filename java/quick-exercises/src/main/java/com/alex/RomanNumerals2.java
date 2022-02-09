package com.alex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanNumerals2 {

	public static void main(String[] args) {

		int numeroArabigo = 3666;
		System.out.println(arabigoARomano(numeroArabigo));

	}

	private static String arabigoARomano(int numeroArabigo) {

		int numeroArabigoRestante = numeroArabigo;

		List<String> romanString = new ArrayList<>();

		Map<String, Integer> romanNumerals = new HashMap<>();
		romanNumerals.put("M", 1000);
		romanNumerals.put("D", 500);
		romanNumerals.put("C", 100);
		romanNumerals.put("L", 50);
		romanNumerals.put("X", 10);
		romanNumerals.put("V", 5);
		romanNumerals.put("I", 1);

		String[] romanArray = { "M", "D", "C", "L", "X", "V", "I" };

		int romanDigitCount = 0;

		// 333
		int index = 0;
		while (index < romanArray.length)
		{
			String romanDigit = romanArray[index];
			int romanIntValue = romanNumerals.get(romanDigit);

			romanDigitCount = numeroArabigoRestante / romanIntValue;
			numeroArabigoRestante -= romanIntValue * romanDigitCount;


			if (romanDigitCount == 9)
			{
				romanString.add(romanArray[index]);
				romanString.add(romanArray[index - 2]);
				index += 2;
				continue;
			}
			if (romanDigitCount > 3)
			{

				if (romanDigitCount == 4)
				{
					romanString.add(romanArray[index]);
					romanString.add(romanArray[index - 1]);
					index += 2;
					continue;
				}
				romanString.add(romanArray[index - 1]);

				for (int normalIndex = 0; normalIndex < romanDigitCount - 5; normalIndex++)
				{
					romanString.add(romanArray[index]);
				}
				index += 2;
				continue;

			}
			if (romanDigitCount > 0)
			{

				for (int normalIndex = 0; normalIndex < romanDigitCount; normalIndex++)
				{
					romanString.add(romanArray[index]);
				}
				index += 2;
				continue;
			}

			index += 2;
		}

		return romanString.toString();
	}

}
