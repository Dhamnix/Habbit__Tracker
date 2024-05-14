package UtilityPackage;

import java.util.regex.*;
public class Utils {
    public static boolean isPasswordValid(String password) {
        int countNumber = 0;
        int countLetter = 0;
        String number = "0123456789";
        String letters = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";

        for (char c : password.toCharArray()) {
            if (number.indexOf(c) != -1) {
                countNumber++;
            } else if (letters.indexOf(c) != -1) {
                countLetter++;
            }
        }
        return countNumber > 0 && countLetter > 0;
    }

    public static boolean isEmailValid(String email){
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(isPasswordValid("Password1"));
    }
}