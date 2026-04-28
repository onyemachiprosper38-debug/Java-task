import org.junit.jupiter.api.Test;
 
import static org.junit.jupiter.api.Assertions.assertEquals;
 




public class BackToSenderTest {

@Test

     public  void testRiderWage (){

        BackToSender riderWage = new BackToSender();

        int actual = riderWage.deliveryLessThanFifty(50);
           int  expected = 13000;

         assertEquals(actual, expected);


}


@Test

public void testRiderWageLessThanEqualToFiftyNine (){

        BackToSender riderWage = new BackToSender();

           int actual = riderWage.deliveryLessThanEqualToFiftyNine(59);
          int expected = 16800;

            assertEquals(actual, expected);

}

@Test

public void testRiderWageLessThanEqualToSixtyNine(){

        BackToSender riderWage = new BackToSender();

        int actual = riderWage.deliveryLessThanEqualToFiftyNine(69);
        int expected = 18800;

         assertEquals(actual, expected);
  
}

@Test

public void stRiderWageGreaterThanEqualToSeventy(){

BackToSender riderWage = new BackToSender();

       int actual = riderWage.deliveryLessThanEqualToFiftyNine(80);
       int expected = 21000;

       assertEquals(actual, expected);


  }

 }
