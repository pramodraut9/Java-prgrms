import java.util.regex.*; //package for regex
import java.util.*;   //input package
public class RegEx{
    public static void main(String[] args) {
        String email;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter email:");
        email = s.nextLine();
        Pattern p = Pattern.compile("[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}"); //Creating pattern
        Matcher m = p.matcher(email);                                                 //Matching input pattern
        if(m.matches()){
            System.out.println("Its valid email");
        }
        else{
            System.out.println("Its not valid email");
        }
        
        
    }
}