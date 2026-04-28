import java.util.Scanner;

public class Energy {
 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount of water in kilogram: ");
        double mass = input.nextDouble();
        
        System.out.println("Enter enter initial temperature: ");
        double initialTemp = input.nextDouble();
   
        System.out.println("Enter final temperature: ");
        double finalTemp = input.nextDouble();

        double Q = mass * (finalTemp - initialTemp) * 4184;


        
        System.out.println("The energy needed is " + Q + " joules ");    
   }
}
