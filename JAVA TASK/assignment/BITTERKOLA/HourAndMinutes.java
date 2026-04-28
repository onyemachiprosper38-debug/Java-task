import java.util.Scanner;
public class HourAndMinutes {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter hour : ");
    int hour = input.nextInt();

    System.out.println("Enter minutes: ");
    int minutes = input.nextInt();

    System.out.println("Enter hour ");
    int hourTwo = input.nextInt();

    System.out.println("enter minutes ");
    int minutesTwo = input.nextInt(); 
   
    System.out.println(hour + ":" + minutes);

    System.out.println(hourTwo + ":" + minutesTwo);
    
    int finalHour = hour + hourTwo;

    int finalMinute = minutes + minutesTwo;

    if (finalMinute >= 60) {
   finalMinute = finalMinute - 60;
    finalHour = finalHour + 1; 
  
}
  else if (finalHour <= 12) {
    finalHour = finalHour - 12; 
 } 
}
 }
