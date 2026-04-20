import java.util.Scanner;

public class LowerCase {

    public static void main(String[] args) {

         Scanner inputCollector = new Scanner(System.in);
        
         System.out.println("Enter a letter: ");
         char letter = inputCollector.next().charAt(0);

         letter = Character.toLowerCase(letter);

         if (letter >= 'a' && letter <= 'z') {

              if (letter == 'a' || letter == 'b' || letter == 'c') {
                  System.out.println("2");
                }
                 else if (letter == 'd' || letter == 'e' || letter == 'f') {
                  System.out.println("3");
                }
                 else if (letter == 'g' || letter == 'h' || letter == 'i') {
                  System.out.println("4");
                }
                 else if (letter == 'j' || letter == 'k' || letter == 'l') {
                  System.out.println("5");
                }
                 else if (letter == 'm' || letter == 'n' || letter == 'o') {
                  System.out.println("6");
                }
                 else if (letter == 'p' || letter == 'q' || letter == 'r' || letter == 's') {
                  System.out.println("7");
                }
                 else if (letter == 't' || letter == 'u' || letter == 'v') {
                  System.out.println("8");
                }
                 else if (letter == 'w' || letter == 'x' || letter == 'y' || letter == 'z') {
                  System.out.println("9");
                }
         }
    }
 }
