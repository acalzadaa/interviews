
public class GrayNumber2 {

	public static void main(String[] args) {

		System.out.println(grayNumber(4,5));
	}

	private static boolean grayNumber(int i, int j) {
		// 3 -> 011
		// 6 -> 110
		
		//xor i ^ j
		int x = i ^ j;
		return (x & (x-1)) == 0;
		
		

	}

}
