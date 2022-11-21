package com.regex.test;

import com.regex.assignments.InvalidUserDetailsException;
import com.regex.assignments.RegExMain;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CustomException {

    @Test
    @Order (1)
    public void validateFirstNameTest() {
        try
        {
            boolean result = RegExMain.validateName("Soumya123");
            if (result != true)
            {
                throw new InvalidUserDetailsException("Invalid First Name");
            }
        }
        catch (InvalidUserDetailsException exception)
        {
            System.out.println(exception.getMessage());
        }
    }

    @Test
    @Order (2)
    public void validateLastNameTest() {
        try
        {
            boolean result = RegExMain.validateName("Ranjan123");
            if (result != true)
            {
                throw new InvalidUserDetailsException("Invalid Last Name");
            }
        }
        catch (InvalidUserDetailsException exception)
        {
            System.out.println(exception.getMessage());
        }
    }

    @Test
    @Order (3)
    public void validateEmailTest() {
        try
        {
            boolean result = RegExMain.validateEmail("soumyars675");
            if (result != true)
            {
                throw new InvalidUserDetailsException("Invalid Email id");
            }
        }
        catch (InvalidUserDetailsException exception)
        {
            System.out.println(exception.getMessage());
        }
    }

    @Test
    @Order (4)
    public void validateMobileNoTest() {
        try
        {
            boolean result = RegExMain.validatePhoneNo("+91 89086418112");
            if (result != true)
            {
                throw new InvalidUserDetailsException("Invalid Phone no");
            }
        }
        catch (InvalidUserDetailsException exception)
        {
            System.out.println(exception.getMessage());
        }
    }

    @Test
    @Order (5)
    public void validatePasswordTest() {
        try
        {
            boolean result = RegExMain.validatePassword("soumya");
            if (result != true)
            {
                throw new InvalidUserDetailsException("Invalid Password");
            }
        }
        catch (InvalidUserDetailsException exception)
        {
            System.out.println(exception.getMessage());
        }
    }
}