import java.util.regex.*;
import java.util.*;

public class Regex2 {

 //^[\+]?[(]?[0-9]{3}[)]?[-\s\.]?[0-9]{3}[-\s\.]?[0-9]{4,6}$   
 public static void main(String[] args) {
    String no;
    Scanner s =new Scanner(System.in);
    System.out.print("Enter the phone number :");
    no=s.next();
    Pattern p= Pattern.compile("^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[789]\\d{9}$");
    Matcher m= p.matcher(no);

    if(m.matches()){
        System.out.println("Its valid phone number");
    }
    else{
        System.out.println("Its not phone number");
    }
        
 }
    
}
