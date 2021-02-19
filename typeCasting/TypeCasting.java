package typeCasting;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte x = 4;
//		int y = x;
		double y = x;
		System.out.println(y);
		System.out.println(x);
//		manual type casting is called Narrowing
		double myDouble = 3.14;
		int myInt = (int)myDouble;
		System.out.println(myDouble);
		System.out.println(myInt);
	}

}

//java is automatic type casting.
