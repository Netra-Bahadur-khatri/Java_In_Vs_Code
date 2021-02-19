package week_01;
import java.util.Scanner;
public class PersonalProject {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		System.out.println("Enter your address: ");
		String address = sc.next();
		System.out.println("Enter your phone number: ");
		String phoneNumber = sc.next();
		
		System.out.println("Your Personal Details: ");
		System.out.println("Name: "+name);
		System.out.println("age: "+age);
		System.out.println("address: "+address);
		System.out.println("phoneNumber: "+phoneNumber);
		
		

		

	}

}
