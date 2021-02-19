package week_01;
import java.util.Scanner;
public class InformationOnCar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your car Registration Number: ");
		int registrationNumber = sc.nextInt();
		
		System.out.println("Enter your car model: ");
		int carModel = sc.nextInt();
		
		System.out.println("Enter the price of your car: ");
		String priceOfCar = sc.next();
		
		System.out.println("Enter the make of the car: ");
		String makeOfCar = sc.next();
		
		
		System.out.println("Displaying an car Details: ");
		System.out.println("RegistrationNumber\tCarModel\tCostOfCar\tMakeOfCar");
		System.out.println(registrationNumber+"\t\t\t"+carModel+"\t\t"+priceOfCar+"\t\t"+makeOfCar);


		

	}

}
