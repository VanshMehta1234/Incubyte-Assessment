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

}
