package com.javafortesters.chap004testswithotherclasses.examples;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ConfirmMAXandMINIntegerSizes{

        @Test
        public void verifyValueOfMIN_VALUE(){
            int minimumInt = -2147483648;
             assertEquals("The min value is ",minimumInt, Integer.MIN_VALUE);
    }

    @Test
    public void verifyValueOfMAX_VALUE(){
        int maximumInt = 2147483647;
        assertEquals("The min value is ",maximumInt, Integer.MAX_VALUE);
    }
}
