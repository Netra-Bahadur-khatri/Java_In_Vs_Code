package OOPS;

class Course{

    //Creating an Instance variables.
    String nameOfCourse;
    int courseId;

    String FName;
    String LName;
    int age;

    //By Methods:
    void returnFullName(int agePerson, String FNamePerson, String LNamePerson ){
        age = agePerson;
        FName = FNamePerson;
        LName = LNamePerson;
    }

    void DisplayInformationOfPerson(){
        System.out.println("Age" +"\t" + "FirstName"+"\t" + "LastName");
        System.out.println(age + "\t" + FName + "\t" + LName);
    }
    
}

class Student{

    //Creating an instance variables
    int Id;
    String nameOfStudent;
    String Address;

    Student(int idStudent, String stdName, String stdAddress){
        Id = idStudent;
        nameOfStudent = stdName;
        Address = stdAddress;
    }

    void StudentInformation(){
        System.out.println("ID of Student: " + "\t" + "Name Of Student: " + "\t" +"Address of student: ");
        System.out.println(Id + "\t" + nameOfStudent + "\t" + Address);
    }

}

public class Class_Object_03 {
    public static void main(String[] args) {

        // 3 ways to initialize an objects in java:

        /*
        1. By reference variables:
        Initializing through an reference:
        Ans:Initializing an objects means storing an data in the objects.
        */

        Course c1 = new Course();//Creating an objects of Class Course.
        Course c2 = new Course();
        c1.nameOfCourse = "Starting Out With Java";
        c1.courseId = 1234;
        c2.nameOfCourse = "Python With Django";
        c2.courseId = 4567;
        System.out.println("\n");
        System.out.println("Name of Course "+" \t" +"       CourseID");
        System.out.println(c1.nameOfCourse + "  \t" + c1.courseId);
        System.out.println(c2.nameOfCourse + "  \t\t" + c2.courseId);
        System.out.println("\n");

        /*
        2. By Methods:
        Ans:we have to invoke the methods in main function after creating.
        */
        Course c3 = new Course();
        Course c4 = new Course();
        c3.returnFullName(21, "Netra Bahadur ", "Khatri");
        c4.returnFullName(22, "Yagya Bahadur ", "Khatri");
        c3.DisplayInformationOfPerson();
        System.out.println("\n");
        c4.DisplayInformationOfPerson();

        /*
        3. By Constructor:
        Ans:
        */
        System.out.println("\n");
        Student s1 = new Student(12, "\tNetra Bahadur khatri", " Nepalgunj, Banke");
        Student s2 = new Student(13, "\tYagya Bahadur khatri", " Babarmahal, Kathamandu");
        s1.StudentInformation();
        System.out.println("\n");
        s2.StudentInformation();
    }
}
