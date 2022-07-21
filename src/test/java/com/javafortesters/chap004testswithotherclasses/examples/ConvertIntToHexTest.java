package com.javafortesters.chap004testswithotherclasses.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertIntToHexTest{
    @Test
    public void elevenIsb(){
        Integer eleven=11;
        assertEquals("11 is Hex b", "b", eleven.toHexString(11));
    }
    @Test
    public void tenIsa(){
        Integer ten=10;
        assertEquals("int 10 is Hex a", "a", ten.toHexString(10));
    }
    @Test
    public void threeIsThree(){
        Integer three = 3;
        assertEquals("Int 3 is Hex \"3\"", "3", three.toHexString(3));
    }
}
