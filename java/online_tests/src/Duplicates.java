import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Duplicates {

	public static void main(String[] args) {
		int[] intArray = { 1, 2, 2, 3, 3, 3 };

		System.out.println(Arrays.deepToString(dups(intArray)));
	}

	private static Integer[] dups(int[] intArray) {

		HashMap<Integer, Integer> intMap = new HashMap<>();

		for (int i = 0; i < intArray.length; i++) {
			if (intMap.containsKey(intArray[i])) {
				intMap.replace(intArray[i], intMap.get(intArray[i]) + 1);
			} else {
				intMap.put(intArray[i], 1);
			}
		}

		List<Integer> intList = new ArrayList<>();

		for (Integer intElem : intMap.keySet()) {
			if (intMap.get(intElem) > 1) {
				intList.add(intElem);
			}
		}

		// convert to Array
		Integer[] intReturn = new Integer[intList.toArray().length];

		intReturn = intList.toArray(intReturn);

		return intReturn;
	}

}
