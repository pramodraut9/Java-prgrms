public class Fibbonacci {

    public static void main(String[] args) {

        int no1=0;
        int no2=1;
        int n03;
        int i;
        int count=10;
        System.out.println(" "+no1);
        System.out.println(" "+no2);

        for(i=2;i<count;++i){
            int no3=no1+no2;
            System.out.println(" "+no3);
            no1=no2;
            no2=no3;
        }

        
    }
    
}
