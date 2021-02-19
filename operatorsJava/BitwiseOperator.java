package operatorsJava;

public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	Bitwise operator works in bits.
		 
		int a = 5;
		int b = 6;
		int c = a & b; //bitwise AND operator.
//		5 -> 101
//		6 -> 110
//		4	 100
		
		int d = 10;
		int e = 13;
		int f = d | e; //bitwise OR operator.
		
//		Right Shift in Bitwise operator.
		
//		1101 -> 0110 -> 0011 -> 0001 -> 0000 -> 0000
		
//		int g = e << 2; left shift 
		int g = e >> 2; //rigght shift
		
		System.out.println(g);
		
		}

}
