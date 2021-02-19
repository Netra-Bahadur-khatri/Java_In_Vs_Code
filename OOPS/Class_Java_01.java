package OOPS;
// Main function within an class.
public class Class_Java_01 {
    /*
    What is an instance variables ?
    ans: A variable which is created inside an class but outside an methods is called an instance variables.
    --> Instance variables does not get memory at compile time.
    --> Instance variables gets memory at runtime when an instance or objects is created.
    --> so that it is called an instance variables.

    */

    //Creating an Instance variable.
    int a = 23;
    int b = 45;


    //Methods or function are same in OOPS.
    //methods is like a function which is used to exposed the behaviour of an objects.
    //Advantanges of methods: code Resuability and code Optimizations.
    // int AddTwoNumber() {

    // }

    /*
    New Keywords in java:
    --> used to allocate an memory at runtime.
    --> All objects gets memory at runtime in heap section of the memory.
    */

    int id; // Instance Variables --> Outside of methods but inside of class.
    String Name; // Instance Variables
    public static void main(String[] args) {

        //creatinng an object of Class_Java class
        Class_Java_01 s1 = new Class_Java_01();
        s1.id = 12;
        s1.Name = "Netra Bahadur khatri";
        System.out.println("Displaying an first attributes of my class_java: ");
        System.out.println(s1.id);
        System.out.println(s1.Name);




        
    }
}
