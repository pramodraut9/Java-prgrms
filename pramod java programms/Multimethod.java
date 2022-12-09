import java.util.*;                                          //package of all utility

public class Multimethod {                                   // class declaration
    
    public int addition(int a,int b){                        //method or function declaration
       // int c=a+b;                                         //method defination 
       // return c;
       return a+b;

    }
    public double substraction(double a,double b){           //method or function declaration
        return a-b;
    }
    public static float multiplication( float a,float b){    //method or function declaration
        return a*b;
    }
    public int division(int a,int b){                        //method or function declaration
        return a/b;
    }
    public static void main(String[] args) {                  //main method
         
        Scanner s= new Scanner(System.in);                    // creating object of scanner for input 
        System.out.println("Enter 1st number : ");         // printing to take input
        int a=s.nextInt();                                   //scans the token as input od int a
        System.out.println("Enter 2nd number : ");        // printing to take input 
        int b=s.nextInt();                                  //scans the token as input od int b
        Multimethod m= new Multimethod();                   //Creating object of class
        //Addition method calling....
        m.addition(a, b);
        int add=a+b; //logic
        System.out.println("Addition is : " +add);
        //Substraction method calling...
        m.substraction(a,b);                           
        double sub=a-b; // logic
        System.out.println("Substraction : " +sub);
        //Multiplicaion method calling...
        m.multiplication(a,b);
        float mul=a*b;
        System.out.println("Multiplication : " +mul);
        //Diviosin method calling..
        m.division(a,b);
        int div=a/b;
        System.out.println("Division : " +div);
      

    
    
    }

}
