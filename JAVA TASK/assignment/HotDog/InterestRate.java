import java.util.Scanner;

public class InterestRate {
 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Balance: ");
        int balance = input.nextInt();

        System.out.println("Enter annual interest rate: ");
        int annualinterestrate = input.nextInt();
        
        
        double interest = balance * (annualinterestrate / 1200);


        
       System.out.println("The interest is = " + interest);


        

      
   }
}
