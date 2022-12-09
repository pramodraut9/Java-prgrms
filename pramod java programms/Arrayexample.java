import java.util.Scanner;


public class Arrayexample {

    public static void main(String[] args) {
        int[]a = new int[5];   //Array object 
        int i=0;
        int total=0;               
         Scanner s = new Scanner(System.in);

         for(i=0;i<a.length;i++){
         System.out.println("Enter the numbers "+ i +":");
         a[i]=s.nextInt();
         }
        for(i=0; i< a.length;i++){
            total +=a[i];
        }
        System.out.println("Toatl is :"+total);

    }
    
}
