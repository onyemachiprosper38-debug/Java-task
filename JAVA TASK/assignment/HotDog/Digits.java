import java.util.Scanner;
public class Digits {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a number (0-1000): ");
    int number = input.nextInt();

    int sum = 0;

    sum = sum + (number % 10);
    number = number / 10;

    sum = sum + (number % 10);
    number = number / 10;

    sum = sum + (number % 10);


    System.out.println("sum of digit = " + sum);

  }
}
 
