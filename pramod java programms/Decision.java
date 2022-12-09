//class for input  
import java.util.Scanner;

public class Decision {

    public static void main(String[] args) {

        //object
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any number : ");
        int i = sc.nextInt();
        
        if(i>=0){
            System.out.println("The given no is positive");
        }else{
            System.out.println("The given no is non positive");
        }
    }
    
}
