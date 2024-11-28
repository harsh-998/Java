package oops;
class vehic{
	public void drive() {
		System.out.println("Driving a vehicle");
	}
}
class car extends vehic{
	public void drive() {
		System.out.println("repairing a car");
	}
}

public class Vehicle {
   public static void main(String[] args) {
	vehic V1 = new vehic();
	V1.drive();
	
	car C1 = new car();
	C1.drive();
 }
}
