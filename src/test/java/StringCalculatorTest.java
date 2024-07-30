import static org.junit.Assert.assertEquals;

import org.example.StringCalculator;
import org.junit.Test;

public class StringCalculatorTest {

    StringCalculator calculator = new StringCalculator();
    @Test
    public void testEmptyString() {

        assertEquals(0, calculator.add(""));
    }

    @Test
    public void testSingleNumber() {
        assertEquals(1, calculator.add("1"));
    }

    @Test
    public void testTwoNumbers() {
        assertEquals(3, calculator.add("1,2"));
    }

    @Test
    public void testMultipleNumbers() {
        assertEquals(10, calculator.add("1,2,3,4"));
        assertEquals(5,calculator.add("3,1,1"));
    }

}
