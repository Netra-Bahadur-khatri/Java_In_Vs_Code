package week_02;

import java.util.*; 
/* 
using an java.util.*; import all the classes of java 
*/

public class Ques_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        To allocate a memory for names and courseTitle arrays:
        */

        /*
        for question no. 1
        */
        String names[] = new String[5]; // allocate a memory for arrays elements.
        String courseTitle[] = new String[5];

        /*
        Assing a values for 5 elements of names and courseTitle arrays and display them in console.

    
        for question no. 2
        
        names[0] = "Netra";
        names[1] = "Aman";
        names[2] = "Jesis";
        names[3] = "Sajil";
        names[4] = "Ankit";

        courseTitle[0] = "Python";
        courseTitle[1] = "java";
        courseTitle[2] = "Javascript";
        courseTitle[3] = "C";
        courseTitle[4] = "C++";

        System.out.println("The elements of first arrays are: ");
        for(int i = 4; i >= 0; i--){
            System.out.println(names[i]);
        }

        System.out.println("The elements of second arrays are: ");
        for(int i = 0; i < courseTitle.length; i++){
            System.out.println(courseTitle[i]);
        }

        */

        /*
        for question no. 3; 
        Taking an input from an users for names and courseTitle arrays:
        */
        System.out.println("Taking an input from an users for names arrays: ");
        names[0] = sc.nextLine();
        names[1] = sc.nextLine();
        names[2] = sc.nextLine();
        names[3] = sc.nextLine();
        names[4] = sc.nextLine();

        System.out.println("Taking an input from an users for courseTitle arrays: ");
        courseTitle[0] = sc.nextLine();
        courseTitle[1] = sc.nextLine();
        courseTitle[2] = sc.nextLine();
        courseTitle[3] = sc.nextLine();
        courseTitle[4] = sc.nextLine();

        System.out.println("The elements of first arrays are: ");
        for(int i = 4; i >= 0; i--){
            System.out.println(names[i]);
        }

        System.out.println("The elements of second arrays are: ");
        for(int i = 0; i < courseTitle.length; i++){
            System.out.println(courseTitle[i]);
        }

        sc.close();
    }
}




