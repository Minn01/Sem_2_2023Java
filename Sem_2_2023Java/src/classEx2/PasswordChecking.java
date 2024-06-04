/*
 * Name : Min Thant
 * ID: 6612012
 * Sec. : 544
 */

package classEx2;

import java.util.Scanner;

public class PasswordChecking {
    public static void main(String[] args) {
        // Test password validation method with different passwords
        System.out.println(isPasswordValid("Abcd123@")); // Example password
        System.out.println();
        System.out.println(isPasswordValid("3451451435"));
        System.out.println();
        System.out.println(isPasswordValid("MSD122341"));
        // Add more test cases as needed
    }

    public static boolean isPasswordValid(String password) {
        // Check if password has at least 8 characters
        boolean atLeastEightChar = password.length() >= 8;
        // Check if password contains an uppercase letter
        boolean hasUppercase = containsUppercase(password);
        // Check if password contains a digit
        boolean hasDigit = containsDigit(password);
        // Check if password contains a symbol from {_,@,#,$,/,&}
        boolean hasSymbol = containsSymbol(password);

        if (!atLeastEightChar) {
            System.out.println("Password must have at least 8 characters.");
        }

        if (!hasUppercase) {
            System.out.println("Password must contain at least one uppercase letter.");
        }

        if (!hasDigit) {
            System.out.println("Password must contain at least one digit.");
        }

        if (!hasSymbol) {
            System.out.println("Password must contain at least one symbol from {_,@,#,$,/,&}.");
        }

        return atLeastEightChar && hasUppercase && hasDigit && hasSymbol;
    }

    public static boolean containsUppercase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsDigit(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsSymbol(String password) {
        String symbols = "_@#$/&";
        for (char c : password.toCharArray()) {
            if (symbols.indexOf(c) != -1) {
                return true;
            }
        }
        return false;
    }
}