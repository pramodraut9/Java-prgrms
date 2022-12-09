import java.util.Scanner;
public class Square {

    public int num;
     public static void main(String []args){

         
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no:");
        int num=sc.nextInt();

        int sqr=num*num;
        System.out.println("the Square of given no is :"+sqr);
        
    }
    
}
