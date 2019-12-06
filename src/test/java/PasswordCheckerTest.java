import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckerTest {

    PasswordChecker passwordChecker = new PasswordChecker();

    @Test
    void passwordIsValid() {
        String password = "dffdP****gngfg06788";
        passwordChecker.passwordIsValid(password);
        assertEquals(6,passwordChecker.count,"Are all the conditions met?");
    }

    @Test
    void passwordIsOk() {
        String password = "sdfsddffdP****gngfg06788f";
        passwordChecker.passwordIsValid(password);
        assertTrue(passwordChecker.passwordIsOk());
    }
}