package Loops;

import java.util.Scanner;

public class MultiplicationTableUpto20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter Number for multiplication table: ");
//		int num = sc.nextInt();
		
		
		
		for(int j = 1; j<= 20; j++) {
			int tableOf = j;
			
			for(int i = 1; i <= 10; i++) {
				
				System.out.print(tableOf * i+" ");
			}
			
			System.out.println();
			
			
		}
		
		
	}

}
