package conditionalStatements;

public class NestedIfStataments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12, b = 8, c = 10;
		int result = 0;
		
		if (a > b) {
			if ( a > c) {
				result = a;
			}
			else {
				result = c;
			}
		}
		else {
			if (b > c) {
				result = b;
			}else {
				result = c;
			}
		}
		System.out.println("The largest of the three number is "+result);

	}

}
