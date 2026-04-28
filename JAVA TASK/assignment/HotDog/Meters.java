import java.util.Scanner;
public class Meters {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter distance in meters: ");
    double meters = input.nextDouble();
    
    double feet = meters * 3.2786;


    System.out.println(meters + " meters is equal to " + feet + "feet.");

  }
}
 
