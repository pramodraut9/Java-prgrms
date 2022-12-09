import java.util.Scanner; 

 class Person {                                  //Parentclass 

    public String person;    //parent class variables that bydefault public.
    public String aadharno;

public void get(){          //writing methods to getting input.
    Scanner s = new Scanner(System.in); //Scanner object
    System.out.println("Enter the name :");
    person =s.nextLine();
    System.out.println("Enter the Aadhar no :");
    aadharno=s.nextLine();
}  
public void show(){            //writing methods to showing that input we have taken.

    System.out.println("The name of the person is :" +person);
    System.out.println("The Addhar no is :"+aadharno);
}  
    
}
 class Student extends Person{                 //child class

    public int rollno;    //child class variables 
    public double percentage;
    

 public void get(){
    
    super.get();                            //this super keyword represent that function is from parent class
    Scanner s1 = new Scanner(System.in);
    System.out.println("Enter the roll no :");
    rollno =s1.nextInt();
    System.out.println("Enter the Percentage :");
    percentage=s1.nextDouble();

    
 }
public void show(){

    super.show();          //this super keyword represent that function is from parent class
    //this.show();            //this super keyword represent that function is from parent class   
    System.out.println("The roll no of the Student is :" +rollno);
    System.out.println("The Percentage is :"+percentage);

    
}
 }

public class Superkey {
    public static void main(String[] args) {

        Student s= new Student();
        s.get();
        s.show();
    }
    
}
