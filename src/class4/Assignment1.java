package class4;

///Compute a program which adds all given numbers	
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
	}

	public static void sum(int... nums) {

		int sum = 0;
		for (int num : nums) {
			sum += num;
		}

		System.out.println("Addition of all the no is " + sum);

	}
}
