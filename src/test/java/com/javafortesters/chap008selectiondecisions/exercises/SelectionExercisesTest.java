package com.javafortesters.chap008selectiondecisions.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SelectionExercisesTest {

    @Test
    public void doYouUnderstandScotty(){
        boolean understands = false;
        int hoursSpentStudying = 10;
        assertEquals("Study more buddy", true, (hoursSpentStudying > 1) ? understands = true : understands);
    }
    @Test
    public void catOrCats(){
        int numberOfCats = 1;
        assertEquals("1 == cat", "cat", (numberOfCats == 1) ? "cat" : "cats");

        numberOfCats = 0;
        assertEquals("0 == cats", "cats", (numberOfCats == 1) ? "cat" : "cats");

        numberOfCats = 2;
        assertEquals("2 == cats-zzzz", "cats-zzzz", (numberOfCats == 1) ? "cat" : "cats");
    }

}
