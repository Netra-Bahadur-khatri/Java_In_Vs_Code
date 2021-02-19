package week_02;
import java.util.Scanner;
public class EvenNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter an first number: ");
        // int num1 = sc.nextInt();
        // System.out.println("Enter an second number: ");
        // int num2 = sc.nextInt();

        System.out.print("Enter an string: ");
        String name = sc.nextLine();
        System.out.println(name);
        // int result = num1 / num2; 
        // System.out.println(result);

        /*
        if(num1 % num2 == 0){
            System.out.println("Even number.");
        }
        else{
            System.out.println("Odd Number. ");
        }
        */

        // if(num1 < 0){
        //     System.out.println("Negative number.");
        // }
        // else{
        //     System.out.println("Positive number. ");
        // }

        sc.close();
    }
}
