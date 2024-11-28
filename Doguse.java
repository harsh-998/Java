package oops;
class Dog{
	private String name;
	private String breed;
	
	public Dog(String name , String breed) {
		this.name = name;
		this.breed = breed;
	}
	void displayinfo(){
		System.out.println(name);
		System.out.println(breed);
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setBreed(String breed) {
		this.breed = breed;
	}
	
}

public class Doguse {
      public static void main(String[] args) {
		Dog D1 = new Dog("Ishan","pagalkhana");
		Dog D2 = new Dog("Harsh","bheeelwadi");
		
		D1.displayinfo();
		D2.displayinfo();
		
		D1.setName("Keshav");
		D2.setName("Ayushman");
		
		D1.setBreed("dihadi");
		D2.setBreed("Bivari");
		
		D1.displayinfo();
		D2.displayinfo();
	}
}
