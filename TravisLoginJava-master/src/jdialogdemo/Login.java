package jdialogdemo;

public class Login {
 
    public static boolean authenticate(String username, String password) {
        // hardcoded username and password
        if (username.equals("Ana") && password.equals("secretPassword")) {
            return true;
        }
        return false;
    }
}
