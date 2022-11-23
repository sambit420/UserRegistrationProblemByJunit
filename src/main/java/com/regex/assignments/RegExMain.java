package com.regex.assignments;

import java.util.regex.Pattern;

@FunctionalInterface
interface Validation
{
    boolean validate(String object) throws InvalidUserDetailsException;
}

public class RegExMain {
    public String firstName = "Soumya";
    public String lastName = "Ranjan";
    public String emailId = "soumyars675@gmail.com";
    public String phoneNo = "+91 8908641811";
    public String password = "Soumya@123";

    public boolean validateName(String name) throws InvalidUserDetailsException {
//        String regEx = "[A-Z][a-z]{3,}";
//        return Validation ( value -> Pattern.matches(regEx,name));
        String regex = "[A-Z][a-z]{3,}";
        Validation Name = (obj) -> (Pattern.compile(regex).matcher(name).matches());
        return Name.validate(name);
    }

    public boolean validateEmail(String email) throws InvalidUserDetailsException {
//        return Pattern.matches("^[a-z0-9+_.-]+@+[a-z]+.+[a-z]+.+[a-z]$",email);
        String regex = "^[a-z0-9+_.-]+@+[a-z]+.+[a-z]+.+[a-z]$";
        Validation Email = (obj) -> (Pattern.compile(regex).matcher(email).matches());
        return Email.validate(email);
    }

    public boolean validatePhoneNo(String mobNo) throws InvalidUserDetailsException {
//        return Pattern.matches("^\\++[91]+\\s+[789]\\d{9}$",mobNo);
        String regex = "^\\++[91]+\\s+[789]\\d{9}$";
        Validation Mob = (obj) -> (Pattern.compile(regex).matcher(mobNo).matches());
        return Mob.validate(mobNo);
    }

    public boolean validatePassword(String password) throws InvalidUserDetailsException {
//        return Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$",password);
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";
        Validation Password = (obj) -> (Pattern.compile(regex).matcher(password).matches());
        return Password.validate(password);
    }
}
