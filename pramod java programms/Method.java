public class Method {

    public static void main(String[] args) {
        int x=4;
        int y=5;
        int z = Minfunction(x,y);
        System.out.println("the minimum value is:"+z);
        
    }

    public static int Minfunction(int a,int b){
        int min;
        if (a>b){
            min=b;

        }else
        min=a;
        return min;

    }
}
