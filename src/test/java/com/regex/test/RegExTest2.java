package com.regex.test;

import com.regex.assignments.InvalidUserDetailsException;
import com.regex.assignments.RegExMain;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegExTest2 {

    RegExMain obj = new RegExMain();

    @Test
    public void test() throws InvalidUserDetailsException {
        if (obj.validateName(obj.firstName) == obj.validateName(obj.lastName) == obj.validateEmail(obj.emailId)
                == obj.validatePhoneNo(obj.phoneNo) == obj.validatePassword(obj.password) == true)
        {
            happyTest(true);
        }
        else
        {
            sadTest(false);
        }
    }

    public void happyTest(boolean flag) {
        System.out.println("Valid first name, last name, email id, phone no and password of user");
        assertEquals(flag,true);
        System.out.println("Happy");
    }

    public void sadTest(boolean flag) {
        System.out.println("Invalid first name, last name, email id, phone no and password of user");
        assertEquals(flag,false);
        System.out.println("Sad");
    }

}
