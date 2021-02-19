package week_02;
import java.util.Scanner;


public class Ques_02  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n");
        System.out.println("Enter value of a and b");

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter an operator for calculation:");
        String choice = sc.next();

        switch(choice){
            case "+":{
                System.out.println("Addition: ");
                int result = a + b;
                System.out.println("The sum of two numbers is "+result);
                break;
            }
            case "-":{
                System.out.println("Subtraction: ");
                int result = a - b;
                System.out.println("The Subtraction of two numbers is "+result);
                break;
            }
            case "*":{
                System.out.println("Multiplication: ");
                int result = a * b;
                System.out.println("The Multiplication of two numbers is "+result);
                break;
            }
            case "/":{
                System.out.println("Division: ");
                int result = a / b;
                System.out.println("The Division of two numbers is "+result);
                break;
            }
            case "%":{
                System.out.println("Remainder: ");
                int result = a % b;
                System.out.println("The Modulo division of two numbers is "+result);
                break;
            }
            default:{
                System.out.println("Wrong input");
            }
        }
       
        System.out.println("This is your calculation.");
        System.out.println("\n\n");
        sc.close();//closing an scanner class.
    }

}




