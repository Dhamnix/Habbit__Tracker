package UtilityPackage;

import java.util.regex.*;
public class Utils {
    public static boolean isPasswordValid(String password) {
        int countnumber = 0;
        int countletter = 0;
        String number = "0123456789";
        String letters = "QWERTYUIOPASDFGHJKLZXCVBNM";
        for (char c : password.toCharArray()) {
            if (number.indexOf(c) == 1) {
                countnumber++;
            }
            for (char a : password.toCharArray()) {
                if (letters.indexOf(a) == 1) {
                    countletter++;
                }
            }
        }
     if (countnumber * countletter != 0 ) return true ;
     else return  false ;
}
    public static boolean isEmailValid(String email){
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}