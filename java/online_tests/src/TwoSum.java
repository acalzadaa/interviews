import java.util.ArrayList;
import java.util.List;

public class TwoSum {
	public static int[] findTwoSum(int[] list, int sum) {

		for (int i = 0, diff = 0; i < list.length; i++) {

			diff = sum - list[i];

			if (diff > 0) {

				for (int j = i + 1; j < list.length; j++) {
					if (list[i] + list[j] == sum) {
						return new int[] { i, j };
					}
				}
			}

		}
		
		

		return null;

	}

	public static void main(String[] args) {
		int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 1);
		if (indices != null) {
			System.out.println(indices[0] + " " + indices[1]);
		}
	}
}