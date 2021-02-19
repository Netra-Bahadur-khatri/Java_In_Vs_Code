package week_03;
/*
Any Fool can write a code that a machine can understand,
But Good Progammer writes a code that human can understand.
*/
public class Exercise_01 {
    public static void main(String[] args) {
    
        /*
        while loop syntax:
        */
        int i = 5 ;
        System.out.println("\n\n");
        System.out.println("Printing an numbers from 5 to 1 using an while loop:");
        while(i >= 1){
            System.out.println(i);
            i--;
        }

        /*
        Do while loop syntax;
        */
        int j = 5;
        System.out.println("\n\n");
        System.out.println("Printing an numbers from 5 to 1 using an do while loop: ");
        do{
            System.out.println(j);
            j--;
        }while(j >= 1);



        /* 
        for loop syntax:
        */
        int a = 5;
        System.out.println("\n\n");
        System.out.println("Numbers from 5 to 1 using an for loop: ");
        for(int b = 5; b >= 1; b--){
            System.out.println(b);
        }
    }
}
