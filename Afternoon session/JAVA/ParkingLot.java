//this programm is letting user to know if there is avalaible space to park their car from slot 1-20 so if the space is occupied it will tell the user that slot one is occupied esle slot one is free 
//
import java.util.Arrays;
import java.util.Scanner;

public class ParkingLot{

   public static int[] parking(int [] slot){
   int  car = pending;
   int slotStatus = 0;;
   int car = 0;
   int space = 4;
for(int count = 1; count <= slot.length; count++){

if (slot[count] == slotStatus){
          return slotStatus;
 }
       return  slot; 
}
 
    
    }
public static void main(String[] args){
Scanner myscanner = new Scanner(System.in);
for(int count = 1; count <= 20; count++){ 
System.out.println("Enter slot (1-20)");
int slot = myscanner.nextInt();
if (slot == 1){
System.out.println("slot 1 is occupied");
}
else if (slot == 2){
System.out.println("slot 2 is free ");
break;
 }

System.out.println(Arrays.toString(parking(slot)));
    }
   }
 } 
