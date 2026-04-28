import java.util.Scanner;

public class TakeC {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = inputCollector.nextInt();


       int square = 0;

    for(int count = 1; count<=number; count++);
        square +=  number * number; 
        
     System.out.println("the square is: " + square); 

 }
}

       
