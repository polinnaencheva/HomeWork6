package org.example;

public class Password {

    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasLetter = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        // Проверка на всеки символ
        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) {
                hasLetter = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
        }

        // Връщаме true само ако всички условия са изпълнени
        return hasLetter && hasDigit && hasSpecialChar;
    }

    public static void main(String[] args) {
        String testPassword1 = "Pass123!";
        String testPassword2 = "password";
        String testPassword3 = "12345678";
        String testPassword4 = "P@ssw0rd";

        System.out.println(isValidPassword(testPassword1));
        System.out.println(isValidPassword(testPassword2));
        System.out.println(isValidPassword(testPassword3));
        System.out.println(isValidPassword(testPassword4));
    }
}


