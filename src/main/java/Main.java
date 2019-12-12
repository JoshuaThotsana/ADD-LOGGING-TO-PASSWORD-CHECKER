import java.util.Scanner;

/*
 * In this project we will create a program that asks the user to input a password.
 * The program will check if the input password meets the conditions specified in the problem statement.
 * We will use code synchronization to protect our code against multi thread.
 */

public class Main {

    // Use the throw Exception key word in order to use the Thread class.
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PasswordChecker passwordChecker = new PasswordChecker();
        System.out.println("Please enter a password: ");
        String password = scanner.nextLine();

    // Instantiate the Thread object
        Thread thread = new Thread(() -> {
            /* Inside the PasswordChecker Class there is a block of code that checks if at least one error was made
             * in the password input. And if this is the case, and exception will be thrown.
             * The catch block below will catch the error and prints a relevant message.
             */
            try {
                passwordChecker.passwordIsValid(password);

            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        });
        // The code below initializes the thread object.
        thread.start();
        // The code below stops the "passwordIsOk" from running while "passwordIsValid" is running.
        thread.join();

        // Once the thread is completed we can run the "passwordIsOk" with the line of code below.

        System.out.println(passwordChecker.passwordIsOk(password));
    }
}
