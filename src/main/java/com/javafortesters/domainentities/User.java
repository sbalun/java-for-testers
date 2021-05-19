package com.javafortesters.domainentities;

public class User{

    // Because these are not declared in a method they are called field variables
    // private - they are only accessible to methods in the User class and not from
    //     any classes that import User.

    private String username;
    private String password;

    // Constructor
    // We knows it's a constructor because it
    //    1. has no return type
    //    2. it's named the same as the class
    // complete with Uppercase letter, User
    public User(){
        this("username","password");
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // An accessor method or getter method because it allows us to 'get' the value of a field
    // Remember username is private.  These getter methods allow of classes to get these values
    // The getter methods take no parameters
    public String getUserName() {
        return username;
    }

    public String getUserPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
