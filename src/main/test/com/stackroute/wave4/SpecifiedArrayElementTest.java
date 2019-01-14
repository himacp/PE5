package com.stackroute.wave4;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SpecifiedArrayElementTest {
    SpecifiedArrayElement arrayobject = new SpecifiedArrayElement();

    @org.junit.Before
    public void setUp() throws Exception {

        SpecifiedArrayElement arrayobject = new SpecifiedArrayElement();

    }

    @org.junit.After
    public void tearDown() throws Exception {
        arrayobject = null;
    }

    @org.junit.Test
    public void upspecificiedSuccess() {
        List<String> expected = new ArrayList<>() {
            {
                add("kiwi");
                add("grape");
                add("mango");
                add("berry");
            }
        };
        List<String> input = new ArrayList<String>();
        input.add("apple");
        input.add("grape");
        input.add("melon");
        input.add("berry");
        List<String> actual = arrayobject.upspecificElement(input, "apple");
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void upspecificiedFailure() {
        List<String> expected = new ArrayList<>() {
            {
                add("kiwi");
                add("grape");
                add("mango");
                add("berry");
            }
        };
        List<String> input = new ArrayList<String>();
        input.add("apple");
        input.add("grape");
        input.add("melon");
        input.add("berry");
        List<String> actual = arrayobject.upspecificElement(input, "banana");
        assertNotEquals(expected, actual);
    }

    @Test
    public void upspecificiedNeutral() {
           List<String> input = new ArrayList<String>();
            input.add("Apple");
            input.add("Grape");
            input.add("Melon");
            input.add("Berry");
            List<String> actualString = arrayobject.upspecificElement(input, "");
            assertNotNull(actualString);


        }
    }