import java.util.*;

class X{
    public void add(int a,int b){
        int res=a+b;
        System.out.println("The addition is :" +res);
    }
    public void add(int a,int b,int c){
        int sum=a+b+c;
        System.out.println("The addition is :"+sum);

    }

}
class Y extends X{
    public void show(){
        
    }  
}
public class Overload {
    public static void main(String[] args) {
        X x= new X();
        x.add(10,20);
        x.add(40, 59, 90);
        
    }
}
