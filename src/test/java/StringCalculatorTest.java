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

    @Test
    public void testNewLinesBetweenNumbers() {
        assertEquals(6, calculator.add("1\n2,3"));
    }

    @Test
    public void testCustomDelimiter() {
        assertEquals(3, calculator.add("//;\n1;2"));
        assertEquals(10, calculator.add("//|\n1|2|3|4"));
        assertEquals(6, calculator.add("//;\n1;2\n3"));
        assertEquals(10, calculator.add("//|\n1|2|3|4\n"));
        assertEquals(15, calculator.add("//;\n4\n;5\n;3\n;1\n;2\n"));
        assertEquals(15, calculator.add("//;;\n4\n;;5\n;;3\n;;1\n;;2\n"));
    }

    @Test
    public void testNegativeNumbers() {
        calculator.add("1,-2,-4,3");
        calculator.add("1,-4,3");
        calculator.add("-4,-5");
    }
}
