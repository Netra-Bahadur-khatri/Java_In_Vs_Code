package week_02;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namesOfStudents[] = new String[5];
        int labMarks[] = new int[5];
        int bonusMarks[] = new int[5];

        //Taking an names of students from an users:
        System.out.println("Enter the names of any Five students: ");
        for(int i = 0; i < namesOfStudents.length; i++){
        namesOfStudents[i] = sc.nextLine();
        }

        // Taking an lab marks for each students:
        System.out.println("Enter an Labs marks of each students: ");
        for(int a = 0; a < labMarks.length; a++){
            System.out.println(labMarks[a]);
        }

        //Taking an Bonus marks for each students:
        System.out.println("Enter an bonus marks of students: ");
        for(int i = 0; i < bonusMarks.length; i++){
            System.out.println(i);
        }

        //Displaying an students names:
        System.out.println("Displaying an names of five students :");
        for(int i = 0; i < namesOfStudents.length; i++){
            System.out.println(namesOfStudents[i]);

        }

        //Displaying an lab marks of each students:
        System.out.println("Displaying an marks of all students: ");
        for(int i = 0; i < labMarks.length; i++){
            System.out.println(i);
        }

        //Displaying an Bonus marks of each students:
        System.out.println("Displaying an Bonus marks of each students: ");
        for(int i = 0; i < bonusMarks.length; i++){
            System.out.println(bonusMarks[i]);
        }

        //Displaying an sum of two arrays i.e. labmarks and Bonusmarks.
        int sum[] = new int[5];
        System.out.println("Sum of labMarks and Bonus marks of students: ");
        for(int i = 0; i<sum.length; i++){

        }


        sc.close();
    }
}
