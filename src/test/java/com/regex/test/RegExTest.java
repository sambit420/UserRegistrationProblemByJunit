package com.regex.test;
import com.regex.assignments.RegExMain;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class RegExTest {

    @BeforeClass
    public static void welcomeText() {
        System.out.println("Welcome to User Registration Problem");
    }

    @Test
    public void validateFirstNameTest() {
        RegExMain obj = new RegExMain();
        System.out.println("Valid first name of user");
        String firstName = "Sambit";
        Assert.assertTrue(obj.validateName(firstName));
    }

    @Test
    public void validateFirstNameLowerCaseShouldFail() {
        RegExMain obj = new RegExMain();
        System.out.println("Invalid first name of user which contains only lowercase");
        String firstName = "sambit";
        Assert.assertFalse(obj.validateName(firstName));
    }

    @Test
    public void validateFirstNameLessThanThree() {
        RegExMain obj = new RegExMain();
        System.out.println("Invalid first name of user which having only three characters");
        String firstName = "Sam";
        Assert.assertFalse(obj.validateName(firstName));
    }

    @Test
    public void validateLastNameTest() {
        RegExMain obj = new RegExMain();
        System.out.println("Valid last name of user");
        String firstName = "Kumar";
        Assert.assertTrue(obj.validateName(firstName));
    }

    @Test
    public void validateLastNameLowerCaseShouldFail() {
        RegExMain obj = new RegExMain();
        System.out.println("Invalid last name of user which contains only lowercase");
        String firstName = "kumar";
        Assert.assertFalse(obj.validateName(firstName));
    }

    @Test
    public void validateLastNameLessThanThree() {
        RegExMain obj = new RegExMain();
        System.out.println("Invalid last name of user which having only three characters");
        String firstName = "Kum";
        Assert.assertFalse(obj.validateName(firstName));
    }
}