import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMenstruationApp {

    @Test
    public void testnextPeriodDay() {
        int result = MenstruationApp.nextPeriodDay(5, 6, 10);
        assertEquals(15, result);
    }

    @Test
    public void testmonth() {
        int result = MenstruationApp.nextPeriod(25, 6, 10);
        assertEquals(5, result); 
    }

    @Test
    public void testCycleLength() {
        int result = MenstruationApp.nextPeriod(10, 6, 20);
        assertEquals(30, result); 
    }

}
