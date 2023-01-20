package org.internship;

public class Login {

    private String username;
    private String password;

    public String setUsername(String username) {
        if (username.length() >= 8) {
            this.username = username;
            return "The username was set correctly.";
        }

        return "The username need to have 8 or more characters.";
    }

    public String setPassword(String password) {
        if (password.length() >= 12) {
            this.password = password;
            return "The password was set correctly.";
        }
        return "The password need to have 12 or more characters.";
    }
}
