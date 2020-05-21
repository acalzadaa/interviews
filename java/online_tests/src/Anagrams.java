import java.util.HashMap;

/*
 * Given two strings find out if they're anagrams
 * 
 * private static boolean isAnagram(String string, String string2)
 */

public class Anagrams {

	public static void main(String[] args) {

		boolean returnValue = isAnagram("Abba", "baab");
		System.out.println(returnValue);
	}

	private static boolean isAnagram(String string, String string2) {

		if (string.isEmpty() || string2.isEmpty())
			return true;

		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		for (Character character : string.toCharArray()) {
			character = Character.toLowerCase(character);
			if (map1.containsKey(character)) {
				map1.put(character, map1.get(character) + 1);
			} else {
				map1.put(character, 1);
			}
		}

		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		for (Character character : string2.toCharArray()) {
			character = Character.toLowerCase(character);

			if (map2.containsKey(character)) {
				map2.put(character, map2.get(character) + 1);
			} else {
				map2.put(character, 1);
			}
		}

		if (map1.size() != map2.size())
			return false;

		for (Character chars3 : map1.keySet()) {
			if (!map1.containsKey(chars3) || !map2.containsKey(chars3)) {
				return false;
			}

			if (map1.get(chars3) != map2.get(chars3)) {
				return false;
			}
		}

		return true;
	}
}
