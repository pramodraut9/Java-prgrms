import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex {
    public static void main(String[] args) throws InputMismatchException {
        try{
            Scanner s = new Scanner(System.in);
            System.out.print("Enter no : ");
            int a = s.nextInt();
            System.out.println("Your number :" + a);
        }
        catch(InputMismatchException ex){
            //System.out.println("Enter valid number.");
            throw ex;
        }
        catch(Exception ex){
                           
        }
    }
}
