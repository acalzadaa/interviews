package com.alex;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ConsecutiveNumbers {

	public static void main(String[] args) {

		int[] numbers = {4,2,1,6,5,7,9};
		
		int consecutiveArray = consecutive(numbers);
		System.out.println(consecutiveArray);
	}

	private static int consecutive(int[] numbers) {

//order list
		List<Integer> orderedNumbers = new ArrayList<>();
		for (int number : numbers) {
			orderedNumbers.add(number);
		}
		
		Collections.sort(orderedNumbers);
		
		int secuential = -1;
		int acum = 0;
		int maxAcum = 0;
		
		for (Iterator<Integer> iterator = orderedNumbers.iterator(); iterator.hasNext();) {
			Integer numberList = iterator.next();

			//primer numero 1
			if(secuential == -1) {
				acum = 1;
				secuential = numberList;
				continue;
			}
			
			//segundo numero 2
			if(numberList == (secuential + 1)) {
				acum++;
				secuential = numberList;
			} else {
				if(maxAcum == 0) {
					maxAcum = acum;
				} else {
					maxAcum = maxAcum < acum ? acum : maxAcum;
				}
				acum = 1;
				secuential = numberList;
			}

		}
		maxAcum = maxAcum < acum ? acum : maxAcum;
		return maxAcum;
	}

}
