import java.util.*;
import java.util.Scanner;
public class Example {
        public static void main(String[] args) {
           double d;
           Scanner sc=new Scanner(System.in);
           System.out.print("Enter the points :");
           d=sc.nextDouble();
           methodRankPoints(d);
           
        }
     
        public static void methodRankPoints(double points) {
           if (points >= 202.5) {
              System.out.println("Rank:A1");
           }else if (points >= 122.4) {
              System.out.println("Rank:A2");
           }else {
              System.out.println("Rank:A3");
           }
        }
     }
    

