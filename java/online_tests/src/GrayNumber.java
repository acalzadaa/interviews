
public class GrayNumber {

	public static void main(String[] args) {

		System.out.println(grayNumber(2,3));
	}

	private static boolean grayNumber(int i, int j) {
		// 3 -> 011
		// 6 -> 110
		
		//xor i ^ j
		int x = i ^ j;
		
		while(x > 0 ) {
			//estoy buscando un numero impar... pero al recorrer un bit el numero debe ser igual a 0
			if(x % 2 == 1 && x >> 1 > 0 ) return false;
			x = x >> 1;
		}
		return true;

	}

}
