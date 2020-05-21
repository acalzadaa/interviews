public class SortedSearch {
	public static int countNumbers(int[] sortedArray, int lessThan) {
		int count = 0; 
		int start = 0;
		int middle = sortedArray.length / 2;
		int end = sortedArray.length - 1;

		if ( lessThan <= sortedArray[0]) {
			count = 0;
		} else {
			while (sortedArray[middle] <= lessThan -1) {
				start = middle;
				middle += (end - start) / 2;
			}
			count = middle;
		}

		return count;
	}

	public static void main(String[] args) {
		System.out.println(SortedSearch.countNumbers(new int[] { 2, 3 }, 2));
	}
}