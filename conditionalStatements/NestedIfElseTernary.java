package conditionalStatements;

public class NestedIfElseTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 12, b = 180, c = 100;
		int result = 0;
		
		result = a > b ? a > c ? a : c : b > c ? b : c;
		
		System.out.println("largest of the three numbers is "+result);

	}

}
