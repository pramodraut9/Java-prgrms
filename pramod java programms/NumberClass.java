public class NumberClass {
  
    public static void main(String[] args) {
        int a = 500;
        //Converting from int to string
        String b = Integer.toString(a);
        System.out.println(b);
        
        //Converting string to int
        String x = "599";
        int y = Integer.parseInt(x);
        System.out.println(y);

        //Java - xxxValue() Method
        Integer d = 6;
        // Returns byte primitive data type
      System.out.println( d.byteValue() );

      // Returns double primitive data type
      System.out.println(d.doubleValue());

      // Returns long primitive data type
      System.out.println(d.longValue());

      //Java - compareTo() Method  
      Integer z = 5;
      //Integer value is greater than the argument (5>3) so, output is 1
      System.out.println(z.compareTo(3));
      //Integer value is equal to the argument so, output is 0
      System.out.println(z.compareTo(5));
      //Integer value is less than the argument (5<8) so, output is −1
      System.out.println(z.compareTo(8)); 
      
      //Java - valueOf() Method
      Integer p =Integer.valueOf(9);
      Double c = Double.valueOf(5);
      Float e = Float.valueOf("80");               
     Integer f = Integer.parseInt("444");

      System.out.println(p); 
      System.out.println(c);
      System.out.println(e);
      System.out.println(f);
       
      //Java - parseInt() Method

      int l =Integer.parseInt("9");
      double k = Double.parseDouble("4");
      int o = Integer.parseInt("888",16);

      System.out.println(l);
      System.out.println(k);
      System.out.println(o);

      //Java - abs() Method
      //The method gives the absolute value of the argument. 
     
      Integer g = -8;
      double n = -100;
      float h = -90;

      System.out.println(Math.abs(g));
      System.out.println(Math.abs(n));     
      System.out.println(Math.abs(h)); 

      //Java - ceil() Method
      // this method gives absolute value near tothe argument.

      double s = -100.675;
      float v = -90.125f;  
      
      System.out.println(Math.ceil(s));
      System.out.println(Math.ceil(v)); 

      System.out.println(Math.floor(s));
      System.out.println(Math.floor(v));

      //Java - rint() Method
      // this method will gives you integer that is closet to value argument.      
      
      double j = 100.675;
      double w = 100.505;
      double t = 100.200;
      System.out.println(Math.rint(j));
      System.out.println(Math.rint(w)); 
      System.out.println(Math.rint(t)); 
      

      //max() min() this term will gives you max value and min value from their argument.
      System.out.println(Math.max(12.123, 12.456));      
      System.out.println(Math.min(23.12, 23.0)); 

      //This method will gives you exponential and logarythmic value power to second arument

      double x1 = 11.635;
      double y1 = 2.76;

      System.out.printf("The value of e is %.4f%n", Math.E);
      System.out.printf("exp(%.3f) is %.3f%n", x1, Math.exp(x1)); 
      System.out.printf("log(%.3f) is %.3f%n", x1, Math.log(x1)); 
      System.out.printf("pow(%.3f, %.3f) is %.3f%n", x1, y1, Math.pow(x1, y1));

      //sin() cos() tan()
      double degrees = 45.0;
      double radians = Math.toRadians(degrees);

      System.out.format("The value of pi is %.4f%n", Math.PI);
      System.out.format("The sine of %.1f degrees is %.4f%n", degrees, Math.sin(radians));
      System.out.format("The cosine of %.1f degrees is %.4f%n", degrees, Math.cos(radians));
      System.out.format("The tangent of %.1f degrees is %.4f%n", degrees, Math.tan(radians));  
      
      //The method converts the argument value to degrees.
      double x2 = 45.0;
      double y2 = 30.0;

      System.out.println( Math.toDegrees(x2) );
      System.out.println( Math.toDegrees(y2) );
      
       //The method converts the argument value to radians.
      double x3 = 45.0;
      double y3= 30.0;

      System.out.println( Math.toRadians(x3) );
      System.out.println( Math.toRadians(y3) );
      
      System.out.println( Math.random() );

       }
      
    
}
