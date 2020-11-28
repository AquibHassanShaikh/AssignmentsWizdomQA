package class5;


/*Create a rectangle Class and define length and breadth properties, 
now create at least 3 different rectangle object that are different from each other 
by setting different length and breadth values, and print them in the console.*/

public class Rectangle {

	static int length;
	static int breadth;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rect1 = new Rectangle();

		Rectangle rect2 = new Rectangle();

		Rectangle rect3 = new Rectangle();

		rect1.length = 10;

		System.out.println("The Length of Rectangle1 : "+length);

		rect1.breadth = 3;
		System.out.println("The breadth of Rectangle1 : "+breadth);

		rect2.length = 11;

		System.out.println("The Length of Rectangle2 : "+length);

		rect2.breadth = 2;
		System.out.println("The Breadth of Rectangle2 : "+breadth);

		rect3.length = 5;

		System.out.println("The Length of Rectangle3 : "+length);

		rect3.breadth = 1;
		System.out.println("The Breadth of Rectangle3 : "+breadth);
	}

}
