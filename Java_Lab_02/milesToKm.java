package Java_Lab_02;
import java.util.Scanner;
public class milesToKm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float km;
        System.out.println("Enter an Kilometer ?");
        km = sc.nextFloat();
        float miles = 1.609344f;
        float MilesToKm = miles * km;
        System.out.println("Converting miles to Kilometer: "+MilesToKm +" km");

        sc.close();
        
    }
}
