public class QuadraticEquation {
	public static Roots findRoots(double a, double b, double c) {
		double r1, r2;
		// first result
		r1 =(-1*b + Math.sqrt((b*b)-(4*a*c)) ) /(2*a) ;
		// second result
		r2 =(-1*b - Math.sqrt((b*b)-(4*a*c)) ) /(2*a) ;
		return new Roots(r1, r2);
	}

	public static void main(String[] args) {
		Roots roots = QuadraticEquation.findRoots(2, 10, 8);
		System.out.println("Roots: " + roots.x1 + ", " + roots.x2);
	}
}

class Roots {
	public final double x1, x2;

	public Roots(double x1, double x2) {
		this.x1 = x1;
		this.x2 = x2;
	}
}