package divineTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setup(){
        calculator = new Calculator();
    }

    @Test
    public void test_addTwoNumbers(){
        int result = calculator.addTwoNumbers(2,4);
        Assertions.assertEquals(result, 8);
    }
}