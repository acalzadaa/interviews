import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class RomanNumerals2 {

	public static void main(String[] args) {

		int numeroArabigo = 3666;
		System.out.println(arabigoARomano(numeroArabigo));

	}

	private static String arabigoARomano(int numeroArabigo) {

		int numeroArabigoRestante = numeroArabigo;

		List<String> romanString = new ArrayList<String>();

		Map<String, Integer> romanNumerals = new HashMap<String, Integer>();
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
		for (int index = 0; index < romanArray.length; index += 2) {
			String romanDigit = romanArray[index];
			int romanIntValue = romanNumerals.get(romanDigit);

			romanDigitCount = numeroArabigoRestante / romanIntValue;
			numeroArabigoRestante -= romanIntValue * romanDigitCount;
			
			
			if (romanDigitCount == 9) {
				romanString.add(romanArray[index]);
				romanString.add(romanArray[index - 2]);
				continue;
			}
			if (romanDigitCount > 3) {

				if (romanDigitCount == 4) {
					romanString.add(romanArray[index]);
					romanString.add(romanArray[index - 1]);
					continue;
				}
				if (romanDigitCount >= 5) {
					romanString.add(romanArray[index - 1]);

					for (int normalIndex = 0; normalIndex < romanDigitCount - 5; normalIndex++) {
						romanString.add(romanArray[index]);
					}
					continue;
				}

			}
			if (romanDigitCount > 0) {

				for (int normalIndex = 0; normalIndex < romanDigitCount; normalIndex++) {
					romanString.add(romanArray[index]);
				}
				continue;
			}

		}

		return romanString.toString();
	}

}
