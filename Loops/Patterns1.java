package Loops;

import java.util.Scanner;

public class Patterns1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {

			for (int j = 1; j<=5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
