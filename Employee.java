/**
* The "Employee_main.java" file has a class which contains main method. 
* The "Employee.java" file has Employee class which contains all necessary methods
* To compile and run the program, have "Employee.java" && "Employee_main.java" in same directory.
* Compile and run "Employee_main.java"
* @author Mohammad Seeam
*/

/* The Employee class contains necessary method */

public class Employee{

    //To store the name
    private String name;

    //To store ID Number
    private int idNumber;

    //To store department
    private String department;

    //To store position
    private String position;
    
    /* A constructor that accepts the following values as arguments and assigns them to
    the appropriate fields: employee’s name, employee’s ID number, department, and
    position. */

    public Employee(String name_args, int id_args, String dp_args, String ps_args){
        name = name_args;
        idNumber = id_args;
        department = dp_args;
        position = ps_args;
    }
        
    /* A constructor that accepts the following values as arguments and assigns them to
    the appropriate fields: employee’s name and ID number. The department and
    position fields should be assigned an empty string ("") */

    public Employee(String name_args, int dp_args){
        name = name_args;
        idNumber = dp_args;
        department = "";
        position = "";    
    }  

    /* A no-arg constructor that assigns empty strings ("") to the name, department, and
    position fields, and 0 to the idNumber field */

    public Employee(){
        name = "";
        idNumber = 0;
        department = "";
        position = "";    
    }  

    /* The getName method  returns name */
    public String getName(){
        return name;
    }
    
    /* The getIdnumber method  returns idNumber */
    public int getIdnumber(){
        return idNumber;
    }
    
    /* The getDepartment method  returns department */
    public String getDepartment(){
        return department;
    }
        
    /* The getPosition method  returns position */
    public String getPosition(){
        return position;
    }
                
}
