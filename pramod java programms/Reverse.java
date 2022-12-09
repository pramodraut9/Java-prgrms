public class Reverse  {



    public static void main(String[] args) {
        int num=987654;
        int rev=0;
        int remainder=0;

        while(num!=0)
        {
            remainder=num%10;
            rev=rev*10+remainder;
            num=num/10;
        }
        System.out.println("the reverse number of the given number is :"+rev);

    }
    
}
