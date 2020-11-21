package class3;

//Print the numbers from 1 to 100 in reverse order which are divisible by 9
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printReverseOrder(100);

	}

	public static void printReverseOrder(int N) {

		for (int i = N; i > 0; i--) {

			if (i % 9 == 0)
				System.out.println("Numbers divisible by 9  : " + i);

		}

	}

}
