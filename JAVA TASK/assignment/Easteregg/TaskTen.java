
import java.util.Scanner;

public class TaskTen {

    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = input.nextDouble();

        double doubled = number * 2;

        System.out.println("the double of " + number + " is " + doubled);
   
   }
}
