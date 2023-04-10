import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Test
    public void canAdd() {
        assertEquals(15, calculator.Add(10, 5));
    }

    @Test
    public void canSubtract() {
        assertEquals(17, calculator.Subtract(20, 3));
    }

    @Test
    public void canMultiply() {
        assertEquals(14, calculator.Multiply(7, 2));
    }

    @Test
    public void canDivide() {
        assertEquals(6.5, calculator.Divide(13, 2), 0.1);
    }

}

//int a 10 int b 5