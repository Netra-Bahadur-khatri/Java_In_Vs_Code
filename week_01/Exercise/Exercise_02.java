package week_01.Exercise;

public class Exercise_02 {

	public static void main(String[] args) {

/*		Write a java program to store the following information about a car:
			•	Registration number
			•	Model 
			•	Price 
			•	Make of the car.
			Display the information on the console.
*/
		long ph = 9866653965L;
		int RegistrationNum = 234;
		String Model = "23W";
		int Price = 2100;
		String makeOfCar = "Toyota";
		
		System.out.println("Accesing an Phone number: "+ph);
		System.out.println("Displaying an Detail about Your Car: ");
		System.out.println("RegistrationNumber "+ "\t"+ "Model" + "\t\t" + "Cost" + "\t\t" + "Make of the car");
		System.out.println(RegistrationNum + "\t\t\t" + Model + "\t\t" + "$" +Price + "\t\t" + makeOfCar );

		
	}

}
