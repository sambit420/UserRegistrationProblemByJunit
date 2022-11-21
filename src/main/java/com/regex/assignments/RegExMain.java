package com.regex.assignments;

import java.util.regex.Pattern;

public class RegExMain {

    public String firstName = "Soumya";
    public String lastName = "Ranjan";
    public String emailId = "soumyars675@gmail.com";
    public String phoneNo = "+91 8908641811";
    public String password = "Soumya@123";

    public boolean validateName(String name) {
        return Pattern.matches("[A-Z][a-z]{3,}",name);
    }

    public boolean validateEmail(String email) {
        return Pattern.matches("^[a-z0-9+_.-]+@+[a-z]+.+[a-z]+.+[a-z]$",email);
    }

    public boolean validatePhoneNo(String mobNo) {
        return Pattern.matches("^\\++[91]+\\s+[789]\\d{9}$",mobNo);
    }

    public boolean validatePassword(String password) {
        return Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$",password);
    }
}
