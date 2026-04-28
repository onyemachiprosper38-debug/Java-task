import java.util.Scanner;

public class CostOfTrip {
 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter distance to drive: ");
        int distancetodrive = input.nextInt();

        System.out.println("Enter fuel efficiency of the car in miles per gallon: ");
        int efficiencyofthecarinmilespergallon = input.nextInt();

        System.out.println("Enter the price per gallon: ");
        int pricepergallon = input.nextInt();
        
        
        double cost = distancetodrive + efficiencyofthecarinmilespergallon + pricepergallon;


        
       System.out.println("The cost of the trip is = " + cost);


        

      
   }
}
