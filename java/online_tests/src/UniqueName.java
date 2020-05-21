import java.util.HashMap;

public class UniqueName {
	public static String firstUniqueName(String[] names) {

		HashMap<String, Integer> unique = new HashMap<>();

		for (int i = 0; i < names.length; i++) {

			if (unique.containsKey(names[i])) {
				unique.replace(names[i], unique.get(names[i]) + 1);
			} else {
				unique.put(names[i], 1);
			}

		}

		for (String key : unique.keySet()) {
			if (unique.get(key) == 1)
				return key;
		}

		return null;

	}

	public static void main(String[] args) {
		System.out.println(firstUniqueName(new String[] { "Abbi", "Adeline", "Abbi", "Adalia" }));
	}
}