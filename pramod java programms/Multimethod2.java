 import java.util.*;                                          //package of all utility

class Multimethod2 {                                            // class declaration
    
    public int addition(int a,int b){                        //method or function declaration
       int c=a+b;                                            //method defination 
       return c;
    }
    public double substraction(double a,double b){           //method or function declaration
         double c2=a-b;
         return c2;
    }
    public static float multiplication( float a,float b){    //method or function declaration
        float c3=a*b;
        return c3;
    }
    public int division(int a,int b){                        //method or function declaration
        int c4=a/b;
        return c4;
    }
    public static void main(String[] args) {                  //main method
          
        
        Scanner s= new Scanner(System.in);                    // creating object of scanner for input 
        System.out.println("Enter 1st number : ");         // printing to take input
        int a=s.nextInt();                                   //scans the token as input od int a
        System.out.println("Enter 2nd number : ");        // printing to take input 
        int b=s.nextInt();                                  //scans the token as input od int b
        Multimethod m= new Multimethod();                   //Creating object of class
        
        //Addition method calling....
        int c1=m.addition(a,b);   
        System.out.println("Addition is : " +c1);

        //Substraction method calling...
        double c2=m.substraction(a,b);                           
        System.out.println("Substraction : " +c2);

        //Multiplicaion method calling...
        float c3=m.multiplication(a,b);
        System.out.println("Multiplication : " +c3);
        
        //Diviosion method calling...
        int c4=m.division(a,b);
        System.out.println("Division : " +c4);
    
    }

}
    

