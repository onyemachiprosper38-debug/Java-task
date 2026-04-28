
import java.util.Scanner;
public class TaskNineteen{

    public static void main(String[] args) {
   
       Scanner input = new Scanner(System.in);

       System.out.println("enter number");

       int num = input.nextInt();
       int remainder = num % 2;
       System.out.println("Remainder when divided by 2 is: " + remainder);
   }
}
