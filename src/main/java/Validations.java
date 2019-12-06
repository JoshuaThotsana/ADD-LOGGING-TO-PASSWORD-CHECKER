
public class Validations {

    boolean existence(String password) {
        boolean results = true;
        if (password.length() < 1) {
            results = false;
        }
        return results;
    }

    boolean longer (String password) {
        boolean results = true;
        if (password.length() < 8) {
            results = false;
        }
        return results;
    }

    boolean lowerCase (String password) {
        boolean results = false;
        for (int i =0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                results = true;
                break;
            }
        }
        return results;
    }

    boolean upperCase (String password) {
        boolean results = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                results = true;
                break;
            }
        }
        return results;
    }

    boolean digit (String password) {
        boolean results =  false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                results = true;
                break;
            }
        }
        return results;
    }

    boolean character (String password) {
        boolean results = false;
        char ch;
        for (int i = 0; i < password.length(); i++) {
            ch = password.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                results = true;
                break;
            }
        }
        return results;
    }

}
