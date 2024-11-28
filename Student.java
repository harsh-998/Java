package oops;
class Std{
	 String name;
	int roll_no ;
	public Std() {
		
	}
	public Std(String name , int roll_no) {
		this.name=name;
		this.roll_no=roll_no;	
	}
	void displayinfo(){
		System.out.println(name);
		System.out.println(roll_no);
	}
}


public class Student {
     public static void main(String[] args) {
		Std S1 = new Std("John",2);
		S1.displayinfo();
	}
}
