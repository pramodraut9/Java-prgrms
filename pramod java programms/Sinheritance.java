//SingleInheritance... 
import java.util.Scanner; 

 class Person {                                  //Parentclass 

    public String person;    //parent class variables that bydefault public.
    public String aadharno;

public void getperson(){          //writing methods to getting input.
    Scanner s = new Scanner(System.in); //Scanner object
    System.out.println("Enter the name :");
    person =s.nextLine();
    System.out.println("Enter the Aadhar no :");
    aadharno=s.nextLine();
}  
public void showperson(){            //writing methods to showing that input we have taken.

    System.out.println("The name of the person is :" +person);
    System.out.println("The Addhar no is :"+aadharno);
}  
    
}
 class Student extends Person{                 //child class

    public int rollno;                         //child class variables 
    public double percentage;
    

 public void getstudent(){

    Scanner s1 = new Scanner(System.in);
    System.out.println("Enter the roll no :");
    rollno =s1.nextInt();
    System.out.println("Enter the Percentage :");
    percentage=s1.nextDouble();

    getperson();
 }
public void showstudent(){

    
    System.out.println("The roll no of the Student is :" +rollno);
    System.out.println("The Percentage is :"+percentage);

    showperson();
}
 }
public class Sinheritance{             //In the one programme their is only one public class 
    public static void main(String[] args) {

        Student s = new Student();
        s.getstudent();
        s.showstudent();
        
        
    }
} 
