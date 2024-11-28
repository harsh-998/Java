package oops;

public class Complexnumberuse {
    
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       Complexnumber C1 = new Complexnumber(1,2);
       Complexnumber C2 = new Complexnumber(3,4);
       
//       int value = C2.getreal();
//       System.out.println(value);
//       C1.setreal(44);
//       System.out.println(C1.getreal());
//       int data = C2.getimaginary();
//       System.out.println(data);
//       C2.setimaginary(24);
//       System.out.println(C2.getimaginary());
//       C2.print();
//       C1.add(C2);
//       C2.minus(C1);
//       C2.print();
         Complexnumber result =Complexnumber.sum(C1,C2);
         result.print();
         int total=Complexnumber.total();
         System.out.println(total);
	}	
	}

	
	


