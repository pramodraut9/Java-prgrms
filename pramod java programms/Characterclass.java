public class Characterclass {


    public static void main(String[] args) {

       
        System.out.println("the sky is limitless");

        //The method determines whether the specified char value is a letter.
        System.out.println(Character.isLetter('c'));
        System.out.println(Character.isLetter('5'));
        
        //The method determines whether the specified char value is a Digit.
        System.out.println(Character.isDigit('c'));
        System.out.println(Character.isDigit('5'));

        //This method determines whether the specified char value is uppercase.
        System.out.println(Character.isUpperCase('c'));
        System.out.println(Character.isUpperCase('C'));
        System.out.println(Character.isUpperCase('\n'));
        System.out.println(Character.isUpperCase('\t'));
       
        //This method determines whether the specified char value is Lowercase.
        System.out.println(Character.isLowerCase('c'));
        System.out.println(Character.isLowerCase('C'));
        System.out.println(Character.isLowerCase('\n'));
        System.out.println(Character.isLowerCase('\t'));

        //This method returns a String object representing the specified character value, that is, a one-character string.
        System.out.println(Character.toString('c'));
        System.out.println(Character.toString('C'));
    }
    
}
