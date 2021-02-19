package Lab_04;
import java.util.Scanner;

public class Question_04 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String Description[] = new String[4];
    float Price[] = new float[4];
    int Vat[] = new int[4];
    float cost[] = new float[4];
    float new_cost[] = new float[4]; // to store an final cost by adding an Vat and Price of Description

    System.out.println("Enter an description: ");
    for(int i = 0; i< Description.length; i++){
        Description[i] = sc.nextLine();
    }

    System.out.println("Enter an Price for each Description:");{
        for(int i = 0; i< Price.length; i++){
            Price[i] = sc.nextFloat();
        }
    }

    System.out.println("Enter an VAT% for each Price: ");{
        for(int i = 0; i< Vat.length; i++){
            Vat[i] = sc.nextInt();
        }
    }

    System.out.println("Enter the Final cost of the corresponding products: ");{
        for(int i = 0; i < cost.length; i++){
            cost[i] = sc.nextFloat();
        }
    }
    
    System.out.println("Description " + " Price" + "    VAT%" + "    Cost");
    System.out.println("======== " + "    =======" + "  ======" + "  ======");

    for(int i = 0; i < 4; i++){
        System.out.print(Description[i] + "       ");
        System.out.print(Price[i] + "       ");
        System.out.print(Vat[i] + "       ");
        System.out.print(cost[i] + "      ");
        System.out.println();
    }

     sc.close();  
   }
}
