package Loops;

import java.util.Scanner;

public class SeriesSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number for sum: ");
		
		int n = sc.nextInt();
		
		float result = 0;
		
		for (float i  = 0; i<= n; i++) {
			result = result + 1/i - 1/i;
		}
		
		System.out.println(result);
		
	}

}
