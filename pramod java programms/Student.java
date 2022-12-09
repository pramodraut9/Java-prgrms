public class Student {
    String name;
    int rollno;
    double percentage;

    void showdata(){
        System.out.println("Pramod");
        System.out.println(2);
        System.out.println(78.60);
    }
    void showdata1(){
        System.out.println("Prajwal");
        System.out.println(1);
        System.out.println(72.80);
    }



      public static void main(String[] args) {
        Student s =new Student();
        s.name="pramod";
        s.rollno= 2;
        s.percentage=78.60;

        s.showdata();
        
        Student s1 =new Student();
        
        s1.showdata1();


               
      }
    
}
