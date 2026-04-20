import java.util.Scanner;

public class RVeversed {

    public static void main(String[] args) {

         Scanner inputCollector = new Scanner(System.in);
        
         System.out.println("Enter a positive number: ");
         int number = inputCollector.nextInt();
         
         int reversed = 0;
         
         while (number > 0){
             int digit = number % 10;
             reversed = reversed * 10 + digit;
            
            number = number / 10;
       }
         System.out.println("Reversed number: " + reversed);
    }

  }
 
