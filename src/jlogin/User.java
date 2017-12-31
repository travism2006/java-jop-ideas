package jlogin;


import java.io.IOException;

import java.util.Hashtable;


public class User 
{

    private String username;

    private String password;

    private static int total;

    public User() {
        total++;

    }

    public User(String username, String password) {
        this.username = username;

        this.password = password;


    }

    public String getUsername() {
        return username;
    }

    public boolean setUsername(String username) {
        this.username = username;
        //return true;
        for (int i = 0; i < username.length(); i++) {
            if (!Character.isLetterOrDigit(username.charAt(i))) {
                return false;
            }
        }
        this.username = username;
        return true;
    }




    public String getPassword() {
        return password;
    }

    public boolean setPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return false;
            }
        }
        this.password = password;
        return true;
    }



    public static int getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Username : " + this.getUsername();

    }

}
