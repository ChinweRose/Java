package divineTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VerifyMeTest {

    private VerifyMe verifyMe;

    @BeforeEach
    public void setup(){
        verifyMe = new VerifyMe();
    }

    @Test
    public void test_canAddTwoNumbers() {
        verifyMe.setAge(12);
        int ageResult = verifyMe.getAge();
        Assertions.assertTrue(ageResult < 18);
    }
}