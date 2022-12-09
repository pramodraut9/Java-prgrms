public class Stringclass {
    
    public static void main(String[] args) {
    
        String name="Pramod";
        System.out.print("The name is :");
        System.out.println(name);

        String a1=new String("xyz");      
        System.out.print("The name is :");
        System.out.println(a1);

        //Length of the string
        System.out.println(name.length());
        System.out.println(a1.length());

        //change startng index (Index stars with zero)
        System.out.println(name.substring(4));
        System.out.println(a1.substring(2));
        
        //replace the character
        System.out.println(name.replace('m','n')); 
        System.out.println(a1.replace('y','w'));
        
        //string to boolean return same as name.endsWith("")
        System.out.println(name.startsWith("Pr"));
        System.out.println(a1.startsWith("xw")); 

        //gives that character at that of index
        System.out.println(name.charAt(5));
        System.out.println(a1.charAt(1));

        // return index of that character
        System.out.println(name.indexOf("m"));
        System.out.println(a1.indexOf("y"));

        // trim removes unwanted spaces
        String Str = new String("   Welcome to Myworld.com   ");
        System.out.print("Return Value :" );
        System.out.println(Str.trim() );
        
        //Escpae sequences
        System.out.println("the name is \" amar akabr anthoy");
        System.out.println("the name is \t amar akabr anthoy");
        System.out.println("the name is \b amar akabr anthoy");
        System.out.println("the name is \r amar akabr anthoy");
        System.out.println("the name is \' amar akabr anthoy");
        System.out.println("the name is \\ amar akabr anthoy");
        System.out.println("the name is \r amar akabr anthoy");
        System.out.println("the name is \f amar akabr anthoy");
         
    }

    
}
