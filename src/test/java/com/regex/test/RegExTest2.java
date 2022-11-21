package com.regex.test;

import com.regex.assignments.RegExMain;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RegExTest2 {

    RegExMain obj = new RegExMain();

    @Test
    public void happyTest() {
        System.out.println("Valid first name, last name, email id, phone no and password of user");

        assertTrue(obj.validateName(obj.firstName));
        assertTrue(obj.validateName(obj.lastName));
        assertTrue(obj.validateEmail(obj.emailId));
        assertTrue(obj.validatePhoneNo(obj.phoneNo));
        assertTrue(obj.validatePassword(obj.password));
        System.out.println("Happy");
    }

    @Test
    public void sadTest() {

        assertFalse(obj.validateName(obj.firstName));
        assertFalse(obj.validateName(obj.lastName));
        assertFalse(obj.validateEmail(obj.emailId));
        assertFalse(obj.validatePhoneNo(obj.phoneNo));
        assertFalse(obj.validatePassword(obj.password));
        System.out.println("Invalid first name, last name, email id, phone no and password of user");
        System.out.println("Sad");
    }

}
