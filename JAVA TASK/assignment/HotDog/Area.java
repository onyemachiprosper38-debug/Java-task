import java.util.Scanner;
public class Area {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter the side lenght of equilateral triangle: ");
    double side = input.nextDouble();

    double area = 0.433012 * side * side;


    System.out.println("The area of the triangle is: " + area);

  }
}
 
