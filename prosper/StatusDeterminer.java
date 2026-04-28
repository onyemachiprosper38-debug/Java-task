import java.util.Scanner;

public class StatusDeterminer{

    public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);


System.out.println("Enter your name: ");
String Name = inputCollector.nextLine();

System.out.println("Enter your age: ");

int Age = inputCollector.nextInt();

 if (Age > 18){
System.out.println(Name + " you are an adult ");
 }
 else if (Age < 18){
System.out.println(Name + " you are a child ");
 }
else {
System.out.println(Name + "congrats you are 18 years old");

  }

 }
}
