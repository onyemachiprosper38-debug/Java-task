import java.util.Scanner;
  public class LargestNumber {
      public static void main(String[] args) {
          Scanner input = new Scanner (System.in);
    
          System.out.println("Enter first number ");
          int firstNumber = input.nextInt();

          int  largestNumber =  firstNumber;

          System.out.println("Enter second number ");
          int secondNumber = input.nextInt();
              if (secondNumber > largestNumber
){
             largestNumber =secondNumber;
           }
          System.out.println("Enter third number ");
          int thirdNumber = input.nextInt();

               if (thirdNumber > largestNumber) {
          largestNumber =   thirdNumber;
       }
         System.out.println("Enter fourth numner ");
         int fourthNumber = input.nextInt();
               if (fourthNumber > largestNumber) {
                largestNumber = largestNumber;
}
        System.out.println("Enter fifth number ");
        int fifthNumber = input.nextInt();
             if (fifthNumber > largestNumber){
             largestNumber = fifthNumber;
}
        System.out.println("The largest number is: " + largestNumber);
  }


}
