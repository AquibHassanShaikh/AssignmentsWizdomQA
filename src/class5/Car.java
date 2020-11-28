package class5;

/*Create a Car class and define a Global variable named topSpeed.
Now create a method to update the topSpeed value and a method to print the topSpeed in console. 
Create an instance of Car class and call the update topSpeed method and call topSpeed print method.*/

public class Car {

	String topSpeed;

	public static void main(String[] args) {

		Car obj = new Car();
		obj.updateTopSpeed();
		obj.printTopSpeed();

	}

	public void updateTopSpeed() {

		topSpeed = "139kmph";
	}

	public void printTopSpeed() {

		System.out.println("The TopSpeed of a Car is :" + topSpeed);
	}
}
