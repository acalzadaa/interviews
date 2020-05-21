/*
 * Given a Binary number find if it has only one digit 1
 */
public class BinaryOnes {

	public static void main(String[] args) {
		System.out.println(binaryOnes(16));
	}

	private static int binaryOnes(int i) {
		int x = i;
		int acum = 0;
		while (x > 0) {
			if ((x & 1) == 1) {
				acum++;
			}
			x = x >> 1;
		}

		return acum;
	}

}
