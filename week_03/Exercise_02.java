package week_03;
import java.util.*;
public class Exercise_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("You are adult.");
        }
        else{
            System.out.println("You are still young boy.Go and eat lolipop.");
        }





        sc.close();
    }
    
}
