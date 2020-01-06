import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(10.00, calculator.add(5.00, 5.00), 0.01);
    }
}
