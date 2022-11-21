package com.regex.test;

import com.regex.assignments.InvalidUserDetailsException;
import com.regex.assignments.RegExMain;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class ParametricClass {

    private String email;
    private RegExMain obj;

    public ParametricClass(String email) {
        this.email = email;
    }

    @Before
    public void initialize() {
        this.obj = new RegExMain();
    }

    @Parameters
    public static Collection input() {
        return Arrays.asList(new Object[] {"abc@yahoo.com", "abc-100@yahoo.com", "abc111@abc.com",
                "abc.100@yahoo.com", "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com",
                "abc+100@gmail.com"});
    }

    @Test
    public void validateSampleEmailTest() throws InvalidUserDetailsException {
        Assert.assertEquals(true,obj.validateEmail(email));
    }

}