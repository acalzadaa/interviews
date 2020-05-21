import java.util.ArrayList;
import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 0, 0, 0 };
		int[] b = { 2, 4, 6 };

		System.out.println(Arrays.toString(mergeArrays(a, b)));
	}

	private static int[] mergeArrays(int[] a, int[] b) {

		int index = 0;
		int tmp = 0;
		// find 0's
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0)
				a[i] = b[index++];
		}

		// order a
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}

		return a;
	}

}
