package com.regex.test;

import com.regex.assignments.RegExMain;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;


public class RegExTest {

    RegExMain obj = new RegExMain();

    List<String> emailList = new ArrayList<>();

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
        String firstName = "Sou";
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
        String emailId = "soumyars675@gmail.com";
        Assert.assertTrue(obj.validateEmail(emailId));
    }

    @Test
    public void validateEmailWithoutDomainShouldFail() {
        System.out.println("Invalid email id of user without domain");
        String emailId = "soumyars675";
        Assert.assertFalse(obj.validateEmail(emailId));
    }

    @Test
    public void validateEmailWithStartingFirstLetterCapitalShouldFail() {
        System.out.println("Invalid email id of user having starting letter is capital");
        String emailId = "Soumyars675@gmail.com";
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

    @Test
    public void validatePasswordTest() {
        System.out.println("Valid password of user");
        String password = "Soumya@123";
        Assert.assertTrue(obj.validatePassword(password));
    }

    @Test
    public void validatePasswordLimitLowerThanEightCharactersShouldFail() {
        System.out.println("Invalid password of user which contains minimum 8 characters");
        String password = "Soumya@";
        Assert.assertFalse(obj.validatePassword(password));
    }

    @Test
    public void validatePasswordTestLimitGreaterThanTwentyCharactersShouldFail() {
        System.out.println("Invalid password of user which contains more than 20 characters");
        String password = "Soumya@1234567890ghfdc";
        Assert.assertFalse(obj.validatePassword(password));
    }

    @Test
    public void validatePasswordWithoutUpperCaseShouldFail() {
        System.out.println("Invalid password of user which doesn't contains any upper case");
        String password = "soumya@123";
        Assert.assertFalse(obj.validatePassword(password));
    }

    @Test
    public void validatePasswordWithoutNumericNumberShouldFail() {
        System.out.println("Invalid password of user which doesn't contains any upper case");
        String password = "Soumyars@";
        Assert.assertFalse(obj.validatePassword(password));
    }

    @Test
    public void validatePasswordWithoutSpecialCharacterShouldFail() {
        System.out.println("Invalid password of user which doesn't contains special character");
        String password = "Soumya123";
        Assert.assertFalse(obj.validatePassword(password));
    }

    @Test
    public void validateSampleEmailTest() {
        System.out.println("Validate some sample email ids");
        emailList.add("abc@yahoo.com");
        emailList.add("abc-100@yahoo.com");
        emailList.add("abc111@abc.com");
        emailList.add("abc.100@yahoo.com");
        emailList.add("abc-100@abc.net");
        emailList.add("abc.100@abc.com.au");
        emailList.add("abc@1.com");
        emailList.add("abc@gmail.com.com");
        emailList.add("abc+100@gmail.com");
        for (int i = 0; i < emailList.size(); i++)
        {
            try
            {
                Assert.assertTrue(obj.validateEmail(emailList.get(i)));
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
                emailList.remove(i);
            }
        }
    }
}