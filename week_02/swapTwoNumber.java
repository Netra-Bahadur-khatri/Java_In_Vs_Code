package week_02;
import java.util.Scanner;
public class swapTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an first number: ");
        int a = sc.nextInt();
        System.out.println("Enter an second number: ");
        int b = sc.nextInt();
        int temp;

        /*
        Swapping an two numbers:
        */
        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: ");
        System.out.println("The value of a is: ");
        System.out.println(a);
        System.out.println("The value of b is: ");
        System.out.println(b);

        sc.close();
    }
}
