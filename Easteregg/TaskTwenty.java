
import java.util.Scanner;
public class TaskTwenty{

    public static void main(String[] args) {
   
       Scanner input = new Scanner(System.in);

       System.out.println("Enter lenght");
       double base = input.nextDouble();

       System.out.println("Enter width");
       double hight = input.nextDouble();

       double area = lenght * width;
       System.out.println("Area  = " + area);
   }
}
