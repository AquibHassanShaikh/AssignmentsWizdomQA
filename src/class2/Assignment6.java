package class2;

//Swap two variables without using third variable	
public class Assignment6 {

	static int x = 50;
	static int y = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		beforeSwap();
		afterSwap();

	}

	public static void beforeSwap() {
		System.out.println("Before swapping");

		System.out.println("value of x:" + x);
		System.out.println("value of y:" + y);

	}

	public static void afterSwap() {
		System.out.println("After swapping");
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("value of x:" + x);
		System.out.println("value of y:" + y);
	}

}
