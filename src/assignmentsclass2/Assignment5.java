package assignmentsclass2;

public class Assignment5 {

	// Print the average of the numbers
	public static void main(String[] args) {

		average(10, 20, 30, 40, 50);

	}

	public static void average(int... arr) {

		int total = 0;

		for (int i = 0; i < arr.length; i++) {

			total = total + arr[i];

		}

		int avg = total / arr.length;

		System.out.println("The average of all the numbers is :" + avg);
	}
}
