import java.util.Scanner;

public class GetDetails {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String firstName = getInput(input, "Enter First Name: ");
        String middleName = getInput(input, "Enter Middle Name: ");
        String lastName = getInput(input, "Enter Last Name: ");
        String address = getInput(input, "Enter Address: ");
        String sex = getInput(input, "Enter Sex: ");
        int age = getAge(input,);
        String email = getInput(input, "Enter Email: ");
        String phoneNumber = getInput(input, "Enter Phone Number: ");

        displayDetails(firstName, middleName, lastName, address, sex, age, email, phoneNumber);
    }

    // Method to get String input
    static String getInput(Scanner input, String prompt) {
        System.out.print(prompt);
        return input.next();
    }

    // Method to get age (int)
    static int getAge(Scanner input) {
        System.out.print("Enter Age: ");
        return input.nextInt();
    }

    // Method to display everything
    static void displayDetails(String fn, String mn, String ln, String addr, String sex, int age, String email, String phone) {
        System.out.println("\n--- USER DETAILS ---");
        System.out.println("Name: " + fn + " " + mn + " " + ln);
        System.out.println("Address: " + addr);
        System.out.println("Sex: " + sex);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }
}
