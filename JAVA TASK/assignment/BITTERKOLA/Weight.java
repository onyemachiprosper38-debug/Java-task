import java.util.Scanner;
public class Weight{

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter weight (in kg) ");
    double weight = input.nextDouble();

   

    System.out.println("Enter Height (in meters) ");
    double height = input.nextDouble();


   double bmi = weight / (height * height);

    System.out.println(bmi);

   if (bmi < 18.5) {
   System.out.println("You are underweight ");

}
else if (bmi >= 18.5 &&  bmi <= 24.9){
   System.out.println("Your weight is normal ");

 }

else if (bmi >= 25 && bmi <= 29.9){
System.out.println("You are overweight ");

}
else if (bmi >= 30){
System.out.println("obese ");
}
  }
}

