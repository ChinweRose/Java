package divineTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrintNameTest {

    private PrintName printName;

    @BeforeEach
    public void setup(){
        printName = new PrintName();
    }

    @Test
    public void test_printInvalidUsername(){
        String usernameResult = printName.printUsername("");
        Assertions.assertEquals(usernameResult, "");
    }

    @Test
    public void test_printUsername(){
        String usernameResult = printName.printUsername("Chinwendu");
        Assertions.assertEquals(usernameResult, "Chinwendu");
    }
}