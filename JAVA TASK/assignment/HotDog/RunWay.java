import java.util.Scanner;

public class RunWay {
 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter take-off speed (v): ");
        double v = input.nextDouble();
        
        System.out.println("Enter acceleration (a): ");
        double a = input.nextDouble();

        double length = (v * v) / (2 * a);
        

        
        System.out.println("The minimum runway length is:  " + length);    
   }
}
