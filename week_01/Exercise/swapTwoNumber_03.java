package week_01.Exercise;

public class swapTwoNumber_03 {
	
	public static void main(String[] args) {
		
		int a = 10,c;
		int b = 5;
		System.out.println("Before swaping an two numbers: ");
		System.out.println("a " + " = " + a);
		System.out.println("b " + " = " + b);
		
		/*
 		 Swapping an two Numbers using an two Numbers:
		 
		int temp;
		temp = a;
		a = b;
		b = temp;
		*/
		
		System.out.println("After swaping an two numbers: ");
		System.out.println("a " + " = " + a);
		System.out.println("b " + " = " + b);

		/*
		 Swapping an two Numbers without using an third variables:
		*/
		a = a + b; 
		b = a - b; 
		a = a - b; 
		
		System.out.println("After swaping an two numbers: ");
		System.out.println("a " + " = " + a);
		System.out.println("b " + " = " + b);

	}

}
