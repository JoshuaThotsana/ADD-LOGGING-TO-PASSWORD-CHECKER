import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationsTest {
    Validations validations = new Validations();

    @Test
    void existence() {
        String password = "ffgf";

        assertTrue(validations.existence(password));
    }

    @Test
    void longer() {
        String password = "ffsghjghjhjhg";
        assertTrue(validations.longer(password));
    }

    @Test
    void lowerCase() {
        String password = "DFDFsdf";
        assertTrue(validations.lowerCase(password));
    }

    @Test
    void upperCase() {
        String password = "dfsfdPf";
        assertTrue(validations.upperCase(password));
    }

    @Test
    void digit() {
        String password = "sdfd0f";
        assertTrue(validations.digit(password));
    }

    @Test
    void character() {
        String password = "sdfdfs#";
        assertTrue(validations.character(password));
    }
}