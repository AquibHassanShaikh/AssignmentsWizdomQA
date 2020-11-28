package class5;

/*Create an employee Class and define name, qualification and salary properties, now create at least 
3 different employee objects that are different from each other by setting different name, 
qualification and salary values, and print them in the console. Note: Use SETTERS - GETTERS	*/
public class Employee {

	String name;
	String qualification;
	int salary;

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();

		emp1.setName("Aquib Hassan Shaikh");
		emp1.setQualification("Msc DA");
		emp1.setSalary(32000);
		System.out.println(emp1.getName());
		System.out.println(emp1.getQualification());
		System.out.println(emp1.getSalary());

		emp2.setName("John Kelly");
		emp2.setQualification("Msc AI");
		emp2.setSalary(52000);
		System.out.println(emp2.getName());
		System.out.println(emp2.getQualification());
		System.out.println(emp2.getSalary());

		emp3.setName("Salemon Daiz");
		emp3.setQualification("Bsc");
		emp3.setSalary(22000);
		System.out.println(emp3.getName());
		System.out.println(emp3.getQualification());
		System.out.println(emp3.getSalary());

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
