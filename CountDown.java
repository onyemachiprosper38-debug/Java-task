import java.util.Scanner;

public class CountDown {

    public static void main(String[] args) {

         Scanner inputCollector = new Scanner(System.in);
        
         System.out.println("Enter a number to start countdown: ");
         int number = inputCollector.nextInt();
          
         
         while (number >= 1){
            System.out.println(number);
            number--;
       }
         System.out.println("Blast off!");
    }

  }
 
