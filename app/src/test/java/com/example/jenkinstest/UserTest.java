package com.example.jenkinstest;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

/**
 * Created by user on 27/5/15.
 */
@Config(emulateSdk = 18, reportSdk = 18)
@RunWith(RobolectricTestRunner.class)
public class UserTest {

    @Test
    public void UserNameTest() {
        User u = new User();

        u.setName("foo");

        Assert.assertEquals("foo", u.getName());
    }
}
