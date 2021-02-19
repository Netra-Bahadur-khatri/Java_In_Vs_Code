package operatorsJava;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = -45;
//		In bitwise AND both condition is checks
		
		if (number >= 1 & number <= 100) {
			System.out.println("The number lies is in the range");
		}
		else {
			System.out.println("The number is not in the range");
		}
		
		int grade = 11;
		
		if (grade == 10 || grade == 12) {
			System.out.println("You can give board exam now");
		}
		else {
			System.out.println("You are not eligible for board exam");
		}
		
		int grade_ =10;
		if(!(grade_ == 10 || grade_ == 12)) {
			System.out.println("You can not give board exam now");
		}
		else {
			System.out.println("You can give board now");
		}

	}

}
