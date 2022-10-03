package divineTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
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

    @Test
    public void test_subtractThreeNumbers(){
        int result = calculator.subtractThreeNumbers(9,7,6);
        Assertions.assertEquals(result, -4);
    }

    @Test
    public void test_divideTwoNumbers(){
        int result = calculator.divideTwoNumbers(10 , 5);
        Assertions.assertEquals(result, 2);
    }

    @Test
    @DisplayName("Multiply")
    public void test_multiplyThreeNumbers(){
        int result = calculator.multiplyThreeNumbers(5, 6, 7);
        Assertions.assertEquals(result, 210);
    }


}

