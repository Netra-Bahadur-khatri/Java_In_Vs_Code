package Loops;


import java.util.Scanner;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first Number: ");
		
		boolean isPrime = true;
		int n = sc.nextInt();
		
		
		for (int i = 2; i * i<= n; i++) {
			if(n % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if(n < 2) {
			isPrime = false;
		}
		System.out.println("isPrime "+isPrime);
			
	}

}
