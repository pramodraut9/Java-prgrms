import java.util.Scanner;

public class Fun {

    public static void main(String[] args) {
        int x;
        int y;
        int z;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the three numbers :");
         x=sc.nextInt();
         y=sc.nextInt();
         z=sc.nextInt();
         int d=Avg(x,y,z);
         System.out.println("The Average is :"+d);
        
    }
    public static int Avg(int a, int b,int c){
      int ans;
      int sum;
      sum= a+b+c;
      ans=sum/3;
      return ans;
    }  
}
