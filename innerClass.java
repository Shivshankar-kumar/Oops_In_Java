
//Wap for inner class Example
/*We know that we have 3 type of class in Java
 * 1). Inner class
 * 2). Static class
 * 3). Anonymous class
 */

import java.util.Scanner;
class Employee{

    //Inner Class
    class Address{
        String name,city,state;
        int eId;
        String dept;
        //constructor
        public Address(String name, String city, String state, String dept, int eId){
            this.name=name;
            this.city=city;
            this.state=state;
            this.dept=dept;
            this.eId=eId;
        }
        public void emp_Info(){
            System.out.println("--------------------------------------------------");
            System.out.println("Name: "+name+"\n"+"City: "+city+"\n"+"State: "+state+"\n"+"eId: "+eId+"\n"+"Dept: "+dept);
        }
    }
}
public class innerClass{
public static void main(String[] args) {

    String name,city,state,dept;
    int eId;
   Scanner input=new Scanner(System.in);
   System.out.println("Enter the Name of Employee: ");
   name=input.nextLine();
   System.out.println("Enter the City of Employee: ");
   city=input.nextLine();
   System.out.println("Enter the State of Employee: ");
   state=input.nextLine();
   System.out.println("Enter the Dept. of Employee: ");
   dept=input.nextLine();
   System.out.println("Enter the Id of Employee: ");
   eId=input.nextInt(); 
input.close();

//object of Outer Class
Employee emp=new Employee();

//object of innerclass
Employee.Address address=emp.new Address(name, city, state, dept, eId);

//now, call to innerclass method through its reference
address.emp_Info();
}
}