public class Testarray {
    
    public static void main(String[] args) {

        double[] d1 = {4.6, 7.9, 10.4, 16.5};

        // Print all the array elements
      for (int i = 0; i < d1.length; i++) 
      {
        System.out.println(d1[i] + " ");
     }
    
     // Summing all elements
     double total = 0;
     for (int i = 0; i < d1.length; i++) 
     {
        total += d1[i];
     }
     System.out.println("Total is " + total);
     
     // Finding the largest element
     double max =d1[0];
     for (int i = 1; i < d1.length; i++)
      {
        if (d1[i] > max) max = d1[i];
     }
     System.out.println("Max is " + max); 
        
    }

    
}
