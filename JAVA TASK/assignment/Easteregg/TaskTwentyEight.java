
import java.util.Scanner;
public class TaskTwentyEight{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int number = input.nextInt();

        int result = number / 3;
    
        System.out.println("Number divided by 3 =" + result);
   }
}
