package Java_Lab_02;

import java.util.Scanner;

public class InformCar_02 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the Details about car: ");

       System.out.println("Enter the registration Number for the car: ");
       int registrationNum = sc.nextInt();

       System.out.println("Enter an Model of Car: ");
       int model = sc.nextInt();

       System.out.println("Enter the price of the car: ");
       int price = sc.nextInt();

       System.out.println("Enter the make of the car: ");
       var makeOfCar = sc.nextLine();

       System.out.println("Displaying an Details of the Car:");
       System.out.println("Registration Number " + "\t" +" Model" +"\t"  +" price" + "\t"+" MakeOfCar");
       System.out.println(registrationNum + "\t\t\t" + model + "\t\t"+ price +"\t\t" +makeOfCar);
       sc.close();
   } 
}
