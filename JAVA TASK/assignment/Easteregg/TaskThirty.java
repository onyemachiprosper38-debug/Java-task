
import java.util.Scanner;
public class TaskThirty{

    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);
       
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();
 
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;

        System.out.println("sum = " + sum);
        System.out.println("product = " + product); 
   }
}
