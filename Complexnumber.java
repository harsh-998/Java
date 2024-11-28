package oops;

public class Complexnumber 
{
    private int real ;
    private  int imaginary;
    private static int counter;
    
    public Complexnumber(int real , int imaginary) 
    {
    	this.real=real;
    	this.imaginary=imaginary;
    	counter++;
    }
     int getreal(){
    	 return real;
     }
     void setreal(int real) {
    	 this.real=real;
     }
     int getimaginary() {
    	 return imaginary ;
     }
     void setimaginary(int imaginary) {
    	 this.imaginary = imaginary;
     }
     void print() 
     {
    	 if(imaginary>0)
    	 {
    	System.out.println(real+"+"+imaginary+"i");
    	 }
    	 else
    	 {
         System.out.println(real+""+imaginary+"i");	 
    	 }
     }
     void add(Complexnumber C2){
    	real = real + C2.real;
    	imaginary = imaginary +C2.imaginary;
     }
     void minus(Complexnumber C1) {
    	 real = real - C1.real;
    	 imaginary = imaginary - C1.imaginary;
     }
     public static Complexnumber sum(Complexnumber C1,Complexnumber C2)
       {
    	 Complexnumber c_main=new Complexnumber(C1.real+C2.real,C1.imaginary+C2.imaginary);
    	 return c_main;
       }
     public static int total()
     {
    	 return counter;
     }
}
 