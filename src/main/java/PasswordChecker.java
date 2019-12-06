import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PasswordChecker {

    private static final Logger logger = LogManager.getLogger(PasswordChecker.class.getName());

    boolean existence = true, longer = true, lowerCase = true, upperCase = true, digit = true, character = true;

    int count = 6;

    Validations validations = new Validations();

    void passwordIsValid(String password)  {

        if (!validations.existence(password)) {
            logger.error("1. Password should exist.");
            existence = false;
            count --;
        }
        if (!validations.longer(password)) {
            logger.error("2. Password should be longer than than 8 characters.");
            longer = false;
            count --;
        }
        if (!validations.lowerCase(password)) {
            logger.error("3. Password should have at least one lowercase letter.");
            lowerCase = false;
            count --;
        }
        if (!validations.upperCase(password)) {
            logger.error("4. Password should have at least one uppercase letter.");
            upperCase = false;
            count --;
        }
        if (!validations.digit(password)) {
            logger.error("5. Password should have at least have one digit.");
            digit = false;
            count --;
        }
        if (!validations.character(password)) {
            logger.error("6. Password should have at least one special character.");
            character = false;
            count --;
        }
        if (existence && longer && lowerCase && upperCase && digit && character) {
            logger.info("Password meets all the minimum requirements.");
        }
        if (!validations.longer(password)) {
            logger.error("Password is never okay if both condition 1 and 2 are not met.");
        }
    }

    boolean passwordIsOk() {

        boolean results = true;
        if (count < 3) {
            results = false;
            logger.debug("Password is not OK.");
        } else {
            logger.debug("Password is OK.");
        }
        return results;
    }
}
