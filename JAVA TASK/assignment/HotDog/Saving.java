import java.util.Scanner;

public class Saving {
 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter monthly saving amount: ");
        double saving = input.nextDouble();
        
        
        double rate = 0.003125;

        double total = 0;
        

        total = (total + saving) * (1 + rate);
        System.out.println("Month 1: " + total);

       total = (total + saving) * (1 + rate);
       System.out.println("Month 2: " + total);

       total = (total + saving ) * (1 + rate);
       System.out.println("Month 3: " + total);

       total = (total + saving) * (1 + rate);
       System.out.println("Month 4: " + total);

       total = (total + saving) * (1 + rate);
       System.out.println("Month 5: " + total);

       total = (total + saving) * (1 + rate);
       System.out.println("Month 6: " + total);  
   }
}
