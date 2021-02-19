package Lab_04;
public class InvertedTriPatterns {
	public static void main(String[] args) {
        /*
        Printing an square patterns in java using an nested for loop
        */
        int a = 10;
        for(int i = 0; i < a; i++){
            System.out.println();
            for(int j = i; j <= a; j++){
                System.out.print("*");
            }
        }
        System.out.println();
    }
}
