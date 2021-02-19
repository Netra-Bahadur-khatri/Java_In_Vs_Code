package Lab_04;
import java.util.Scanner;
public class Question_01 {
   public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    /*
    java program to repeatdly ask the user to enter Student ID until the user enters "NS":
    */
    boolean a = true;

    while(a){
        System.out.println("Enter an Student ID until users enter NS: ");
        String StdId = sc.nextLine();
        if( StdId.equals("NS")){
            System.out.println("This will terminate string.");
            System.exit(0);
        }
    }
    sc.close();
       
   }
}
