import java.util.Scanner;

public class Year {
 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of minutes");

        long minutes = input.nextInt();

        long minutesperDay 60 = 24;
        long minutesPerYear = minutesPerDay * 365;
        
        long years = minutes / minutesPerYear;
        long remainingMinutes = minutes % minutesPerYear;
        long days = remainingMinutes / minutesPerDay;

        System.out.printf(minutes + " minutes is approximately " + years + "years and" + days +("days."));
     
   }
}
