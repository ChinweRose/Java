package MyAccessments;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    private Addition addition;

    @BeforeEach
    public void setup(){
        addition = new Addition();
    }

    @Test
    public void test_addFourNumbers(){
        int result = addition.addFourNumbers( 10, 20, 30, 40);
        Assertions.assertEquals(result, 100);

    }

}