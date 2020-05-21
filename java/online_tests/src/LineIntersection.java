
public class LineIntersection {

	class Points {
		int x;
		int y;

		public Points(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

	}

	public static void main(String[] args) {

		int[] line1 = { 0, 0, 2, 2 };
		int[] line2 = { 0, 1, 2, 1};
		System.out.println(intersect(line1, line2));

	}

	private static boolean intersect(int[] line1, int[] line2) {

		// create a line 1
		int y1 = line1[3] - line1[1];
		int x1 = line1[2] - line1[0];

		// create a line 2
		int y2 = line2[3] - line2[1];
		int x2 = line2[2] - line2[0];

		// create an equation
		// y=mx => m = x/y

		//si Y es igual a 0 el angulo marcara error
		
		
		double eqLine1 = x1 / y1;
		System.out.println("x1: " + x1 + " y1: " + y1 + " m: " + eqLine1);
		double eqLine2 = x2 / y2;
		System.out.println("x2: " + x2 + " y2: " + y2 + " m: " + eqLine2);


		if (eqLine1 == (-1*eqLine2)) {
			return true;
		} else {
			return false;
		}

	}

}
