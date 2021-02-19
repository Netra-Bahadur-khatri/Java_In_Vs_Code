package OOPS;

//Main function outside of the class
class Car{

    //Instance variables.
    int RegisNum;
    String Name;
    //Methods or function
    void accelarate(){
        System.out.println("Car is an Accelerating.");
    }

}
public class Class_Java_02 {
    public static void main(String[] args) {

        //Creating an instance of the class Car
        Car c1 = new Car();


        //Assiging an values to instance variables through class's object.
        c1.RegisNum = 123;
        c1.Name = "Netra Bahadur khatri";

        //Displaying an class properties
        System.out.println("Displaying an class Properties: ");
        System.out.println(c1.RegisNum);
        System.out.println(c1.Name);


    }
}




