import java.util.Scanner;

public class NagativeNumber {

    public static void main(String[] args) {

         Scanner inputCollector = new Scanner(System.in);

         int number = 0;
         int sum = 0;
         int count = 0;

         System.out.println("Enter a number (-1 to stop): ");
         number = inputCollector.nextInt();

         while (number >= 0) {

              sum = sum + number;
              count = count + 1;


         System.out.println("Enter another number (-1 to stop): ");
         number = inputCollector.nextInt();
       }

        if (count != 0) {
             double average = (double) sum / count;
             System.out.println("the average is: " + average);
         }
          else {
            System.out.println("No numbers were entered.");
         }
   
     }
  }
