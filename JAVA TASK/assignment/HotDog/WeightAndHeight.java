import java.util.Scanner;

public class WeightAndHeight {
 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pound: ");
        double weight = input.nextDouble();

        System.out.println("Enter height in inches: ");
        double height = input.nextDouble();
        
        
        double pound = 0.45359237;


        double inch = 0.0254;

        double BMI = pound * inch;

       System.out.println("The BMI is = " + BMI);


        

      
   }
}
