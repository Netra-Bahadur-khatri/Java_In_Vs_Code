package week_02;
import java.util.Scanner;
public class Ques_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Reserved memory at heap section
        System.out.println("Names for first Array:  ");
        String names[] = new String[5];
        String courseTitle[] = new String[5];

        System.out.println("Name of Five Students: ");
        names[0] = sc.nextLine();
        names[1] = sc.nextLine();
        names[2] = sc.nextLine();
        names[3] = sc.nextLine();
        names[4] = sc.nextLine();

        System.out.println("Names of Five Courses: ");
        courseTitle[0] = sc.nextLine();
        courseTitle[1] = sc.nextLine();
        courseTitle[2] = sc.nextLine();
        courseTitle[3] = sc.nextLine();
        courseTitle[4] = sc.nextLine();

        System.out.println("Displaying an first array: ");
        for(int i = 4; i >= 0; i--){
            System.out.print(names[i] + " ,");
        }
        System.out.println("\n\n");

        System.out.println("Displaying a second array: ");
        for(int i = 0; i < courseTitle.length; i++){
            System.out.print(names[i] + " ,");

        }
        System.out.println("\n\n");
        sc.close();
    }
}
