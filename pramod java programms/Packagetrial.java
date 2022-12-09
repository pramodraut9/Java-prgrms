import math.Addition;                 //package importing
import math.Substraction;             //package importing

public class Packagetrial { 

    public static void main(String[] args) {
        int a=20;
        int b=30;
        Addition ad =new Addition();          //object creating...
        Substraction sb= new Substraction();  //object creating...
        int add=ad.calculate(a,b);            //assigning the value for addition method
        int sub=sb.calculate(a,b);            //assigning the value for Substraction method
        System.out.println("Addition is : "+add);
        System.out.println("Substraction is : "+sub);

    }
    
}
