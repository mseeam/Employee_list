/**
* The "Employee_main.java" file has a class which contains main method. 
* The "Employee.java" file has Employee class which contains all necessary methods
* To compile and run the program, have "Employee.java" && "Employee_main.java" in same directory.
* Compile and run "Employee_main.java"
* @author Mohammad Seeam
*/

/* Below is Employee_main class which inherits/extends Employee class
The Employee_main class contains main method */

public class Employee_main extends Employee{

    //Constructor
    public Employee_main(){}

    //Main method starts 
    public static void main(String[] args){
        
        //making first object called box
        Employee box = new Employee("Susan Meyers", 47899, "Accounting", "Vice Pres");

        //making second object called box1
        Employee box1 = new Employee("Mark Jones", 39119, "IT", "Programmer");

        //making third object called box2
        Employee box2 = new Employee("Joy Rodgers", 81774, "Manufacturing", "Engineer");

        //Below is to printing output
        System.out.println("  Name          ID Number      Department      Position    ");
        System.out.println("_______________________________________________________");
        System.out.print(" " + box.getName() + "    " + box.getIdnumber() + "          " + box.getDepartment());
        System.out.println("      " + box.getPosition());
        System.out.print(" " + box1.getName() + "      " + box1.getIdnumber() + "          " + box1.getDepartment());
        System.out.println("              " + box1.getPosition());
        System.out.print(" " + box2.getName() + "     " + box2.getIdnumber() + "          " + box2.getDepartment());
        System.out.println("   " + box2.getPosition());
    }   
}