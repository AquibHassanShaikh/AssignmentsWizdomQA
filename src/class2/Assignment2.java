package class2;

//Assignment 2.	Verify a number is Even or Odd	
public class Assignment2 {

	public static void main(String[] args) {

		Assignment2.evenOdd(5);
	}

	public static void evenOdd(int i) {

		if ((i % 2) == 0) {

			System.out.println("The is number is even");

		} else {

			System.out.println("The number is odd");
		}
	}

}
