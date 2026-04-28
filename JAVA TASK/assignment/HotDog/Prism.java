import java.util.Scanner;
public class Prism {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter side length of the triangle: ");
    double side = input.nextDouble();
    
    System.out.println("Enter the length of the prism: ");
    double length = input.nextDouble();

    double area = 0.433 * side * side;

    double volume = area * length;


    System.out.println("The volume of the triangular prism is: " + volume);

  }
}
 
