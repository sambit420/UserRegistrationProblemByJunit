package com.regex.assignments;

import java.util.regex.Pattern;

public class RegExMain {

    public String firstName = "Soumya";
    public String lastName = "Ranjan";
    public String emailId = "soumyars675@gmail.com";
    public String phoneNo = "+91 8908641811";
    public String password = "Soumya@123";

    public static boolean validateName(String name) throws InvalidUserDetailsException {
        return Pattern.matches("[A-Z][a-z]{3,}",name);
    }

    public static boolean validateEmail(String email) throws InvalidUserDetailsException {
        return Pattern.matches("^[a-z0-9+_.-]+@+[a-z]+.+[a-z]+.+[a-z]$",email);
    }

    public static boolean validatePhoneNo(String mobNo) throws InvalidUserDetailsException {
        return Pattern.matches("^\\++[91]+\\s+[789]\\d{9}$",mobNo);
    }

    public static boolean validatePassword(String password) throws InvalidUserDetailsException {
        return Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$",password);
    }
}
