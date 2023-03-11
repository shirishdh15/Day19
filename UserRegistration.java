package Day19;
import java.util.Scanner;
public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName;
        String lastName;
        String email;
        String mobileNumber;
        String password;
        do {
            System.out.print("Please enter your first name: ");
            firstName = scanner.nextLine();
        }while (!firstName.matches("^[A-Z][a-zA-Z]{2,}$"));

        System.out.println("Hello, " + firstName + "!");
        do{
            System.out.println("enter valid last name");
            lastName = scanner.nextLine();
        }while(!lastName.matches("^[A-Z][a-z A-Z]{2,}$"));

        System.out.println("Hello, " + lastName + "!");
        do{
            System.out.println("enter valid email");
            email = scanner.nextLine();
        }while(!email.matches("^[a-zA-Z0=9._]+@[a-zA-Z0=9._]+\\.[a-zA-Z]{2,}$"));
        do {
            System.out.print("Please enter your mobile number: ");
            mobileNumber = scanner.nextLine();
        } while (!mobileNumber.matches("^\\d{2} \\d{10}$"));

        System.out.println("Thank you, your mobile number is valid.");

        do {
            System.out.print("Please enter your password: ");
            password = scanner.nextLine();
        } while (!validatePassword(password));

        System.out.println("Thank you, your password is valid.");
    }
    private static boolean validatePassword(String password) {
        if (password.length() < 8) {
            System.out.println("Password must be at least 8 characters long.");
            return false;
        }
        if (!password.matches(".*[A-Z].*")) {
            System.out.println("Password must contain at least 1 uppercase letter.");
            return false;
        }
        if (!password.matches(".*\\d.*")) {
            System.out.println("Password must contain at least 1 numeric digit.");
            return false;
        }
        if (!password.matches(".*[!@#$%^&*()].*")) {
            System.out.println("Password must contain exactly 1 special character.");
            return false;
        }
        return true;
    }
}