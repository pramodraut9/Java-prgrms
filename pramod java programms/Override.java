import java.util.*;

class A{
    public void show(){
         
        System.out.println("This is parent method");
    }
}
class B extends A{
    public void show(){
        super.show();
        System.out.println("This is child method");

    }
}

public class Override {
    public static void main(String[] args) {
        B b = new B();
        b.show();
        //A a = new A();
        //a.show();

    }
    
}
