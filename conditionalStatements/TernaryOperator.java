package conditionalStatements;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		syntax for ternary operator: - variable = (condition) ? expressionTrue: expressionFalse;
		int a = 15;
		int b = 8;
		
		int maxOfBothNum = 0;

		maxOfBothNum = a > b ? a: b;
		
		System.out.println("Maximum of both number is "+maxOfBothNum);
	}

}
