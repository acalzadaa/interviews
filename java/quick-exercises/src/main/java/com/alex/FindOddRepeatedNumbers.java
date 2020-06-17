package com.alex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FindOddRepeatedNumbers {

	public static void main(String[] args) {

		Integer[] numbers = { 1, 1, 2, 2, 3, 5, 66, 34, 22, 7, 7, 7 };

		Integer[] results = findNumbers(numbers);

		for (Integer value : results) {
			System.out.println(value);
		}

	}

	private static Integer[] findNumbers(Integer[] numbers) {

		Map<Integer, Integer> intMap = new HashMap<>();

		for (Integer number : numbers) {
			intMap.put(number, intMap.getOrDefault(number, 0) + 1);
		}

		List<Integer> intList = new ArrayList<>();

		for (Entry<Integer, Integer> intElem : intMap.entrySet()) {
			if (intMap.get(intElem.getKey()) % 2 != 0) {
				intList.add(intElem.getKey());
			}
		}

		Integer[] intReturn = new Integer[intList.toArray().length];

		intReturn = intList.toArray(intReturn);

		return intReturn;
	}

}
