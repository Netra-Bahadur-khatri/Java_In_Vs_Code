package Java_Lab_02;
import java.util.Scanner;
public class calculation_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any three Numbers: ");

        /*  
        Calculating a sum of the three Numbers:
        */

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a + b + c;
        System.out.println("=====================");
        System.out.println("Sum of three Numbers: ");
        System.out.println("=====================");
        System.out.println("The sum of the three numbers is "+sum);
        System.out.println("\n\n");

        /*
        Calculating a average of three numbers:
        */
        int average = sum / 3;
        System.out.println("=====================");
        System.out.println("Average of three Numbers: ");
        System.out.println("=====================");
        System.out.println("The average of three numbers is "+ average);
        System.out.println("\n\n");

        /*
        Multiplying an three numbers and Displaying their result:
        */
        int productOfThreeNum = a * b * c;

        System.out.println("=====================");
        System.out.println("Product of three Numbers: ");
        System.out.println("=====================");
        System.out.println("The product of three Numbers is "+productOfThreeNum);
        System.out.println("\n\n");


        sc.close();

    }
    
}
