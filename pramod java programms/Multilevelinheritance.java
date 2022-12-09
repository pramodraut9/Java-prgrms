//multilevelinheritance...
class A{
    public int a;
   
}
class B extends A{
    public int b;
}
class C extends B{
    public int c;
}

public class Multilevelinheritance {
    public static void main(String[] args) {
        
        C c1= new C();  //Object of C class.
        B b1= new B();  //Object of B class.
        A a1= new A();  //Object of A class.
        a1.a=10;
        b1.b=20;
        c1.c=30; 
        
        int res=a1.a+b1.b+c1.c; // the varibles are accesible with object name only
        System.out.println("The result is :"+res);
        
    }   
}
