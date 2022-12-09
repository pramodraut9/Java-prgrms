//Write a function to convert Celsius temperature into Fahrenheit.
import java.util.*;
import java.util.Scanner;
public class Degree {

    public static void main(String[] args) {
        double x;
        
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the Temp :"); 
     x=sc.nextDouble();
     double y=dtof(x);
     System.out.println("for the temp " +x+ " farenheit is : "+y);
    }  
       //°F =°C * 1.8000+ 32.00
     public static double dtof(double a){
       double ans;
       ans= a*1.8000+32.00;
       return ans;
    
     }
    }
    

