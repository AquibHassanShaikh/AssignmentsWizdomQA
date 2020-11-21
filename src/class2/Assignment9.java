package class2;

///Compute the area of a polygon
public class Assignment9 {

	public static void main(String[] args) {
		polygonArea(6, 4.5);

	}

	public static void polygonArea(int ns, double lenside) { // ns = number of sides on the polygon , lenside = length
																// of one of the sides

		double area = 0;

		area = (ns * (lenside * lenside)) / (4.0 * Math.tan((Math.PI / ns))); // formula = Area of a polygon =
																				// (n*s^2)/(4*tan(π/n))

		System.out.print("The area is: " + area);
	}

}
