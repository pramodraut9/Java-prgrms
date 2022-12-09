import java.util.*;
import java.text.*;

public class Datedemo {

    public static void main(String[] args) {
             Date date= new Date();
             System.out.println(date);
             System.out.println(date.toString());
             System.out.println(date.getTime());

        SimpleDateFormat ft=
        new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Current Date :"+ft.format(date));

    }
    
}
