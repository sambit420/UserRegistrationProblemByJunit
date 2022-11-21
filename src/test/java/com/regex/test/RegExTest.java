package com.regex.test;
import com.regex.assignments.RegExMain;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class RegExTest {

    RegExMain obj = new RegExMain();

    @BeforeClass
    public static void welcomeText() {
        System.out.println("Welcome to User Registration Problem");
    }

    @Test
    public void validateFirstNameTest() {
        System.out.println("Valid first name of user");
        String firstName = "Soumya";
        Assert.assertTrue(obj.validateName(firstName));
    }

    @Test
    public void validateFirstNameLowerCaseShouldFail() {
        System.out.println("Invalid first name of user which contains only lowercase");
        String firstName = "soumya";
        Assert.assertFalse(obj.validateName(firstName));
    }

    @Test
    public void validateFirstNameLessThanThreeShouldFail() {
        System.out.println("Invalid first name of user which having only three characters");
        String firstName = "Sam";
        Assert.assertFalse(obj.validateName(firstName));
    }

    @Test
    public void validateLastNameTest() {
        System.out.println("Valid last name of user");
        String lastName = "Ranjan";
        Assert.assertTrue(obj.validateName(lastName));
    }

    @Test
    public void validateLastNameLowerCaseShouldFail() {
        System.out.println("Invalid last name of user which contains only lowercase");
        String lastName = "ranjan";
        Assert.assertFalse(obj.validateName(lastName));
    }

    @Test
    public void validateLastNameLessThanThreeShouldFail() {
        System.out.println("Invalid last name of user which having only three characters");
        String lastName = "Ran";
        Assert.assertFalse(obj.validateName(lastName));
    }

    @Test
    public void validateEmailTest() {
        System.out.println("Valid email id of user");
        String emailId = "sambit2024@gmail.com";
        Assert.assertTrue(obj.validateEmail(emailId));
    }

    @Test
    public void validateEmailWithoutDomainShouldFail() {
        System.out.println("Invalid email id of user without domain");
        String emailId = "sambit420";
        Assert.assertFalse(obj.validateEmail(emailId));
    }

    @Test
    public void validateEmailWithStartingFirstLetterCapitalShouldFail() {
        System.out.println("Invalid email id of user having starting letter is capital");
        String emailId = "Sambit 2024@gmail.com";
        Assert.assertFalse(obj.validateEmail(emailId));
    }

    @Test
    public void validateMobileNoTest() {
        System.out.println("Valid mobile no of user");
        String phoneNo = "+91 8908641811";
        Assert.assertTrue(obj.validatePhoneNo(phoneNo));
    }

    @Test
    public void validateMobileNoWithoutCountryCodeShouldFail() {
        System.out.println("Invalid mobile no of user without country code");
        String phoneNo = "8908641811";
        Assert.assertFalse(obj.validatePhoneNo(phoneNo));
    }

    @Test
    public void validateMobileNoWithoutProperSimCodeShouldFail() {
        System.out.println("Invalid mobile no of user without proper sim code");
        String phoneNo = "+91 6578641811";
        Assert.assertFalse(obj.validatePhoneNo(phoneNo));
    }

    @Test
    public void validateInvalidMobileNoShouldFail() {
        System.out.println("Invalid mobile no of user which is more than 10 numbers");
        String phoneNo = "+91 65786418112";
        Assert.assertFalse(obj.validatePhoneNo(phoneNo));
    }
}