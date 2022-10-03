package MyAccessments;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Access2Test {

    private Access2 access2;

    @BeforeEach
    public void setup() {
        access2 = new Access2();
    }

    @Test
    public void test_checkMaximumOfTwoNumbers(){
        int result = access2.checkMaximumOfTwoNumbers(110 ,001);
        Assertions.assertEquals(result , 001);
    }

}