import java.util.Scanner;
public class SumNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number (N): " );
        
        int n = input.nextInt();

      int count = 1;
      int sum = 0;

      while  (count <= n){
          
          sum += count;

       System.out.println("Step" + count + ": Current sum is " + sum);

    count++;
}

  System.out.println("\nfinal total sum is: " + sum);
  
 }
}
