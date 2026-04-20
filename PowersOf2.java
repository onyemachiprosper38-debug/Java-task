import java.util.Scanner;

public class PowersOf2 {

    public static void main(String[] args) {

         Scanner inputCollector = new Scanner(System.in);
        
         System.out.println("Enter a number (n): ");
         int n = inputCollector.nextInt();
          
          int result = 1;
          int count = 0;

         for(count = 1; count <= n; count++){
            result = result * 2;
    
         System.out.println("2^" + count + "=" + result);
    }

  }
 }
