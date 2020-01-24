import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckerTest {

    PasswordChecker passwordChecker = new PasswordChecker();

    @Test
    void passwordIsValid() throws Exception {
        String password = "dffdP****gngfg06788";
        passwordChecker.passwordIsValid(password);
        assertEquals(passwordChecker.errors,"");
    }

    @Test
    void passwordIsOk() throws Exception {
        String password = "sdfsddffdP****gngfg06788f";
        passwordChecker.passwordIsValid(password);
        assertTrue(passwordChecker.passwordIsOk(password));
    }
}