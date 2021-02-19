package swithcCaseJava;

import java.util.Scanner;

public class Switch_CaseLecture9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int dayOfWeek = sc.nextInt();
		
		switch (dayOfWeek ) {
			case 1:
				System.out.println("I am on leave");
				break;
			case 2:
				System.out.println("I am in office");
				break;
			case 3:
				System.out.println("I'm playing football");
				break;
			case 4:
				System.out.println("I am out of the  country");
				break;
			case 5:
				System.out.println("at home");
				break;
			case 6:
				System.out.println("With girlfriends");
				break;
			case 7:
				System.out.println("study time");
				break;
			default:
				System.out.println("I dont know what day it is");
		
		}

	}
	

}
