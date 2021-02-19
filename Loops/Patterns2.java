package Loops;

import java.util.Scanner;

public class Patterns2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number to print pattern: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<= n; i++) {
			for(int j =1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
