package org.internship;

import lombok.Getter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login {

    private static String username = "adrian_macovei";

    @Getter
    private String password;


    public static String getUsername(){
        return Login.username;
    }
    public String setUsername(String username) {
        if (username.length() >= 8) {
            this.username = username;
            return "The username was set correctly.";
        }

        return "The username need to have 8 or more characters.";
    }

    public String setPassword(String password) {
        if(!containsEightCharacters(password)){
            return "New password need to have at least 8 characters";
        } else if(!containsAnUpperCaseLetter(password)) {
            return "New password need to have at least one uppercase letter";
        } else if(!containsAtLeastOneNumber(password)) {
            return "New password need to have at least one numerical character";
        } else if (!containsSpecialCharacter(password)) {
            return "New password need to contain a special character";
        } else if (containsUserName(password)) {
            return "New password need to not contain username";
        }
        this.password = password;
        return "Password is valid and was set to your account.";
    }

    private boolean containsEightCharacters(String text) {

        return text.length() >= 8;
    }

    private boolean containsAnUpperCaseLetter(String text) {
        for(int i = 0; i < text.length(); i++) {
            if(Character.isUpperCase(text.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private boolean containsSpecialCharacter(String text) {
        Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
        Matcher match = special.matcher(text);
        return match.find();
    }

    private boolean containsUserName(String text) {

        return text.contains(username.toLowerCase());
    }

    private boolean containsAtLeastOneNumber(String text) {
        Pattern special = Pattern.compile ("[1234567890]");
        Matcher match = special.matcher(text);
        return match.find();
    }

}
