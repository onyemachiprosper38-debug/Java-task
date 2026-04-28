import java.util.Scanner;
public class Weight {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter weight (in kg) ");
    double weight = input.nextDouble();

   

    System.out.println("Enter Height (in meters) ");
    double height = input.nextDouble();
   
    double bmi = weight / (height * height);

   if (bmi < 18.5) {
   System.out.println("Youa re underweight");

}
else if ( == 18.5 && 24.9){
   System.out.println("Your weight is normal");

 }

else if (bmi == 25 && 29.9){
System.out.println("You are overweight");

}


  }
}
 
