import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int numberOfRows = inputCollector.nextInt();

//        for(int i = 1; i <= numberOfRows; i++) {
//            for(int j = 1; j <= numberOfRows - i; j++) {
//                System.out.print(" ");
//            }
//         for(int k = 1; k <= i; k++){
//               System.out.print("*");
//            }
//
//            System.out.println();
//        }

        for(int i = numberOfRows; i >=1; i--){
            for(int j = i; j >=1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
