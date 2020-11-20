package assignmentsclass2;

//Print the area and perimeter of a circle.	

public class Assignment4 {

	public static void main(String[] args) {

		radius(5.5);
	}

	public static void radius(double r) {

		double perimeter = 2 * Math.PI * r; // formula to calculate circumference of circle

		double area = Math.PI * r * r; // formula to calculate area of circle

		System.out.println("Perimeter is = " + perimeter);
		System.out.println("Area is = " + area);
	}

}
