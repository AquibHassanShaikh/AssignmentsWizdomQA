package assignmentsclass2;

//Extract the first half of a string of even length	
public class Assignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstHalf("helloworld");

	}

	public static void firstHalf(String str) {

		int len = str.length() / 2;

		String half = str.substring(0, len);

		System.out.println(half);
	}
}
