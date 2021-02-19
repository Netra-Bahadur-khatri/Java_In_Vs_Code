package week_02;
import java.util.Scanner;
public class Ques_04 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age");
    int age = sc.nextInt();

    if(age <= 18){
        System.out.println("Young Person.");
    }
    else {
        System.out.println("Adult");
    }
    sc.close();
       
   }
}

