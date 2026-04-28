import java.util.Scanner;
 

public class BackToSender{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the amount of delivery you did for the day: ");
    int delivery = scanner.nextInt();
    
    if(delivery < 50){

deliveryLessThanFifty(delivery);
    }

    else if(delivery <= 59){
deliveryLessThanEqualToFiftyNine(delivery);
    }

    else if(delivery <= 69){
deliveryLessThanEqualToSixtyNine(delivery);

   }
   else if (delivery >= 70){
deliveryGreaterThanEqualToSeventy(delivery);

  }

}

public static void deliveryLessThanFifty(int delivery ){
 

int wage =  delivery * 160 + 5000;

System.out.println("the wage for today is: " + wage);
 
}

public static void deliveryLessThanEqualToFiftyNine(int delivery){
 

int wage = delivery * 200 + 5000;

System.out.println("the wage for today is: " + wage);
 }
  


public static void deliveryLessThanEqualToSixtyNine(int delivery){
  

int wage = delivery * 250 + 5000;

System.out.println("the wage for today is: " + wage);
 }
  

public static void deliveryGreaterThanEqualToSeventy(int delivery){
 

int wage = delivery * 500 + 5000;

System.out.println("the wage for today is: " + wage);
 }

  }
 


