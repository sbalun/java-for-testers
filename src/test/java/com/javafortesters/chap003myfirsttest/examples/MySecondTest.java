package com.javafortesters.chap003myfirsttest.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MySecondTest {

    @Test
    public void CanAddThreeNumbers(){
        int total=10;
        assertEquals("3 + 3 + 4 = 10", 10, total);
    }
}
