import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class RomanNumerals {

	public static void main(String[] args) {

		// M D C L X I

		// numero maximo 3999

		int numeroArabigo = 29;

		System.out.println(arabigoARomano(numeroArabigo));

	}

	private static String arabigoARomano(int numeroArabigo) {

		int numeroArabigoTotal = numeroArabigo;
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

		int arabigoValue = 0;
		int romanCount = 0;
		int romanRemainder = 0;

		for (int index = 0; index <= romanArray.length; index += 2) {
			arabigoValue = romanNumerals.get(romanArray[index]);
			if (numeroArabigoRestante > arabigoValue) {

				//calcula 10^2
				if ((numeroArabigo % arabigoValue) == 0) {
					romanRemainder = 0;
					romanCount = numeroArabigoRestante;
				} else {
					romanRemainder = numeroArabigoRestante - ((numeroArabigoRestante / arabigoValue) * arabigoValue);
					romanCount = (numeroArabigoRestante / arabigoValue);
					for (int i = 0; i < romanCount; i++) {
						romanString.add(romanArray[index]);
					}
					index+=2;
				}
				numeroArabigoRestante -= (romanCount * arabigoValue);

				//calcula las unidades
				if (romanRemainder == 9) {
					romanString.add(romanArray[index]);
					romanString.add(romanArray[index - 2]);
					break;
				}
				if (romanRemainder > 3) {

					if (romanRemainder == 4) {
						romanString.add(romanArray[index]);
						romanString.add(romanArray[index - 1]);
						break;
					}
					if (romanRemainder >= 5) {
						romanString.add(romanArray[index - 1]);

						for (int normalIndex = 0; normalIndex < romanRemainder - 5; normalIndex++) {
							romanString.add(romanArray[index]);
						}
						break;
					}

				}
				if (romanRemainder > 0) {

					for (int normalIndex = 0; normalIndex < romanRemainder; normalIndex++) {
						romanString.add(romanArray[index]);
					}
					break;
				}

			}
			if (numeroArabigoRestante == arabigoValue) {
				romanString.add(romanArray[index]);
				numeroArabigoRestante -= arabigoValue;
			}

		}

		return romanString.toString();

	}

}
