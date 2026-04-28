import java.util.Scanner;

public class Population {
 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of years: ");
        int years = input.nextInt();
        
        int population = 467954;
  
        int secondInYear = 365 * 24 * 60;
        int births = secondInYear / 10;
        int deaths = secondInYear / 16;
        int imigrants = secondInYear / 50;
      

        int increasePerYear = births + imigrants - deaths;
        int futurePopulation = population + (increasePerYear * years);

        

        
        System.out.println("Population after  " + years + " years " + futurePopulation);    
   }
}
