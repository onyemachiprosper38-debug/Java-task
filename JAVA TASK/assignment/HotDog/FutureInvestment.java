import java.util.Scanner;

public class FutureInvestment {
 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter investment amount: ");
        int investmentamount = input.nextInt();

        System.out.println("Enter annual interest rate: ");
        int annualinterestrate = input.nextInt();

        System.out.println("Enter number of years: ");
        int numberofyears = input.nextInt();
        
        
        double futureinvestment = investmentamount * (1 + annualinterestrate)*(numberofyears*12);


        
       System.out.println("The future investment is = " + futureinvestment);


        

      
   }
}
