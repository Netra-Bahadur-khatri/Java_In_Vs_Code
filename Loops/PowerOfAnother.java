package Loops;

import java.util.Scanner;

public class PowerOfAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		
		int result = 1;
		
		for (int i = 0; i<b; i++) {
			result *= a;
		}
		
		System.out.print("The power of first number to the second number is: ");
		System.out.println(result);

	}

}
