package oops;
class Employee{
	public void work() {
		System.out.println("Employee is working");
	}
	public double getsalary() {
		return 30000;
	}
}
class HR extends Employee{
	public void work() {
		System.out.println("Hr is managing human resources");
	}
	public void addEmployee(String Employee_name) {
		System.out.println(Employee_name);
	}
}

public class Employeeuse {
   public static void main(String[] args) {
	 Employee E1 = new Employee();
	 E1.work();
	 System.out.println(E1.getsalary());
	 
	 HR h1 = new HR();
	 h1.work();
	 h1.addEmployee("Harsh");
}
}
