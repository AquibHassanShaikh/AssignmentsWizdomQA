package class3;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mul = 0; // track how many multiples found

		int num = 1; // start checking at 1

		do {

			if (num % 4 == 0) {

				mul++;

				System.out.println("multiple of 4: " + num);

			}

			num++;

		} while (mul < 10);
	}

}