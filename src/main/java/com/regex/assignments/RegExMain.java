package com.regex.assignments;

import java.util.regex.Pattern;

public class RegExMain {
    public boolean validateFirstName(String firstName) {
        return Pattern.matches("[A-Z][a-z]{3,}",firstName);
    }
}

