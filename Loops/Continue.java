package Loops;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		System.out.println(num);
		
		for (int i = 1; i<= 100; i++) {
			if (i>= 40 && i<= 50) {
				continue;
			}
			System.out.println(i);
		}
		
	}

}

//Continue skips the current situation of the condition.