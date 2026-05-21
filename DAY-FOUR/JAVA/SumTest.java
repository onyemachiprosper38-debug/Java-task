import org.junit.jupiter.api.test;
import static org.junit.jupiter.api.Assertion.*;



public class SumTest{

    @test
        public void testThatgetSumReturns(){
        int actual = 6;
        int expected = 8 -2;
        assertEquals(actual, expected);
  }

    @test
        public void testThatgetSumIsValid(){
        int actual = 6;
        int expected = 8 -2;
        assertEquals(actual, expected);
  } 
    @test
        public void testThatget_SumReturnTheSumOfTwoNumbersThatIsEqualTo12(){
        int actual = 12;
        int expected = 5 + 7;
        assertEquals(actual, expected);



   }
 }
