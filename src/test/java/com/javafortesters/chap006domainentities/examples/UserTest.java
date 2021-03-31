package com.javafortesters.chap006domainentities.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void userHasDefaultNameAndPassword(){

        User user = new User();
        User auser = new User("jesus", "thelamb");

        assertEquals("default user name expected", "username", user.getUserName());
        assertEquals("default password expected", "password", user.getUserPassword());
    }
    @Test
    public void canConstructWithUsernameAndPassword(){

        User user = new User("admin","pA55Ww0rD");

        assertEquals("given user name expected", "admin", user.getUserName());
        assertEquals("given password expected", "pA55Ww0rD", user.getUserPassword());
    }
    @Test
    public void canSetPassword(){

        User user = new User("admin", "1234abcd");
        user.setPassword("new-@password");

        assertEquals("Set password", "new-@password", user.getUserPassword());
    }
}
