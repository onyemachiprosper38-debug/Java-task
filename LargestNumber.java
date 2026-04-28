public class LargestNumber {

    public static int findLargest(int[] array){
        int max = array[0];
        for(int number : array){
            if (number > max){
                max = number;
   }
 }
    return max;

  }

public static void main(String[] args){

    int [] numbers = {22, 76, 98, 9, 4};

    int max = findLargest(numbers);
System.out.println("The largest number is: " + max);


   }
  }
