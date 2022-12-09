import java.util.regex.*;
import java.util.*;

public class Regex3 {
    public static void main(String[] args) {
        String name="hh6hg";
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the name :");
        Pattern p= Pattern.compile("^[a-zA-Z]*$");
        Matcher m=p.matcher(name);
        
        //1st way
        //boolean b =m.matches(name);
        //Sysytem.out.println(b);
        
        //2nd way
        //boolean b2= Pattern.compile("").matcher("").matches();
        //Sysytem.out.println(b2);
          
        //3rd way
        //boolean b3=Pattern.matches("");
        //Sysytem.out.println(b3);
         
        //4rth way
        if(m.matches()){
            System.out.println("Matched");
        }else{
            System.out.println("Not Matched");

        }

    }
    
}
