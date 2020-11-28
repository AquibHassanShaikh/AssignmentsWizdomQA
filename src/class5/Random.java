package class5;

public class Random {

	public static void main(String[] args) {

		Random obj = new Random();

		obj.Rand();

	}

	public void Rand() {

		int i;
		int[] array = new int[5];
		for (i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
			System.out.print(array[i] + " ");
		}

	}

}
