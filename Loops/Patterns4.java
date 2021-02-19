package Loops;

import java.util.Scanner;

public class Patterns4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number for patterns: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=n-i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
