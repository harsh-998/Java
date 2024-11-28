package oops;
class one{
	public one() {
		System.out.println("one");
	}
}
class two extends one{
	public two() {
		System.out.println("two");
	}
}

class three extends two{
	public three() {
		System.out.println("three");
	}
}

public class Classuse {
 public static void main(String[] args) {
	  two two = new three();
	  System.out.println(two);
 }
}
