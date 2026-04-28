import java.util.Scanner;
public class Subtotal {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter subtotal : ");
    double subtotal = input.nextDouble();

    System.out.println("Enter gratuity rate (in %): ");
    double rate = input.nextDouble();

    double gratuity = subtotal * (rate / 100);
    
    double total = subtotal + gratuity;
   

    
    System.out.println("Gratuity $: " + gratuity);
    System.out.println("Total $: " + total);

  }
}
 
