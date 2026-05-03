import java.util.Scanner;

import java.util.Scanner;

public class MenstruationApp { 

    public static int nextPeriod(int day, int month, int cycleLength) {
    int nextPeriodDay = day + cycleLength;
    int ovulationDay = nextPeriodDay - 14;

   if (nextPeriodDay > 30) {
    nextPeriodDay -= 30;
    month += 1;
}

if (ovulationDay > 30) {
    ovulationDay -= 30;
}

return nextPeriodDay;

  }

    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);

        System.out.println("Enter the first day of your last period (day): ");
        int day = myscanner.nextInt();
        
        System.out.println("Enter month (1-12): ");
        int month = myscanner.nextInt();

        System.out.println("Enter cyclelength: ");
        int cycleLength = myscanner.nextInt();
    
 System.out.println("\n====Results===");
int nextPeriodDay = day + cycleLength;
    int ovulationDay = nextPeriodDay - 14;

        if (nextPeriodDay > 30) {
            nextPeriodDay -= 30;
            month += 1;

   }

       else if (ovulationDay > 30) {
            ovulationDay-= 30;
  }
System.out.println("Extimated next period date: Day " + nextPeriodDay + " month " + month);

 System.out.println("Extimated ovulation day: Day " + ovulationDay);
   }


  }

        




   

 
//result = nextPeriod(day, month, cycleLength);
//System.out.println("Next period day: " + result);
//


  

