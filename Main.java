package oops;
class shape{
	public double getArea() {
		return 0;
	}
}
class rectangle extends shape{
	private int length;
	private int height ;
	
	public rectangle(int length , int height ) {
		this.length = length;
		this.height = height;
	}
	
	public double getArea() {
		return length*height;
	}
}
public class Main {
   public static void main(String[] args) {
	   rectangle  a = new rectangle(3,5);
	   System.out.println(a.getArea());
}
}
