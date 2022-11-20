package com.regex.assignments;

import java.util.regex.Pattern;

public class RegExMain {


    public boolean validateName(String firstName) {
        return Pattern.matches("[A-Z][a-z]{3,}",firstName);
    }

    public boolean validEmail(String email) {
        return Pattern.matches("^[a-z0-9+_.-]+@+[a-z]+.+[a-z]+.+[a-z]$",email);
    }
}