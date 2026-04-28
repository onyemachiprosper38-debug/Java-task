import java.util.Scanner;

public class Take {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = inputCollector.nextInt();


       for (;number <= 10 ;){

        int digit = number % 10;


        number += digit;

        number = 10;

     System.out.println("the square is: " + number); 
}
 }
}
