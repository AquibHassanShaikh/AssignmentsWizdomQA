package class4;

public class Assignment2 {

	public static void main(String[] args) {

		/*
		 * School Oxford_Public_School = new School(); School Delhi_Public_School = new
		 * School(); School Laurel_Hill_Public_School = new School();
		 * 
		 * System.out.println(Oxford_Public_School.studentName = "Aquib Hassan Shaikh");
		 * System.out.println(Oxford_Public_School.schoolFees = "Euro 10000");
		 * System.out.println(Oxford_Public_School.studentRollNo = 10403268);
		 * 
		 * Delhi_Public_School.studentName = "Zak Johnson";
		 * Delhi_Public_School.schoolFees = "Dollar 5000";
		 * Delhi_Public_School.studentRollNo = 10403266;
		 * 
		 * System.out.println(Delhi_Public_School.studentName);
		 * System.out.println(Delhi_Public_School.schoolFees);
		 * System.out.println(Delhi_Public_School.studentRollNo);
		 * 
		 * Laurel_Hill_Public_School.studentName = "Ramesh Kumar";
		 * Laurel_Hill_Public_School.schoolFees = "INR 500000";
		 * Laurel_Hill_Public_School.studentRollNo = 10403255;
		 * 
		 * System.out.println(Laurel_Hill_Public_School.studentName);
		 * System.out.println(Laurel_Hill_Public_School.schoolFees);
		 * System.out.println(Laurel_Hill_Public_School.studentRollNo);
		 * 
		 */

		School("Laurel_Hill_Public_School", "Zak Johnson", "INR 500000", 10403255);
		School("Delhi_Public_School", "Ramesh Kumar", "Dollar 5000", 10403266);
		School("Oxford_Public_School", "Aquib Hassan Shaikh", "Euro 10000", 10403268);
	}

	public static void School(String schoolName, String studentName, String schoolFees, int studentRollNo) {

		System.out.println(schoolName);
		System.out.println(studentName);
		System.out.println(schoolFees);
		System.out.println(studentRollNo);
	}

}
