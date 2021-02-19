package swithcCaseJava;

public class Rating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rating = 5;
		
		switch(rating) {
		case 1:
		case 2:
			System.out.println("Bad Review");
			break;
		
		case 3:
			System.out.println("Average review");
			break;
		case 4:
		case 5:
			System.out.println("Excellent review");
			break;
		default:
			System.out.println("I dont want to review");

	}
}

}
