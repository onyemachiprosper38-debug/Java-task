import java.util.Scanner;
public class Ping {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter area in square meters: ");
    double squaremeters = input.nextDouble();
    
    double ping = squaremeters * 0.3025;

    
    System.out.println(squaremeters + " square meters is equal to " + ping + " ping.");

  }
}
 
