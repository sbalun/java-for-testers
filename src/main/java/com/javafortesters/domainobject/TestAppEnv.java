package com.javafortesters.domainobject;

public class TestAppEnv {

    // By convention constants are written in UPPERCASE with multiple words delimited by _
    // public - can be accessed by any code that imports the TestAppEnv class
    // static - TestAppEnv does not need to be instantiated with new before usage
    // final - the variable can not be changed once a value has been assigned
    public static final String PORT = "67";
    public static final String DOMAIN = "192.123.0.3";

    public static String getUrl() {

        return "http://" + DOMAIN + PORT;
    }
}
