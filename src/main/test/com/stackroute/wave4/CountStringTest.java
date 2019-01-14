package com.stackroute.wave4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class CountStringTest {

    CountString countString;
    @Before
    public void setUp()
    {
        countString=new CountString();
    }

    @After
    public void tearDown()
    {
        countString=null;
    }

    @Test
    public void testCountStringSuccess()
    {
        Map<String,Integer> ExpectedMap=new HashMap<String, Integer>();
        ExpectedMap.put("one",5);
        ExpectedMap.put("two",2);
        ExpectedMap.put("three",2);
        Map<String,Integer> actualMap=countString.countNumOfString( "one one -one___two,,three,one @three*one?two");

        assertEquals(ExpectedMap,actualMap);
    }

    @Test
    public void testCountStringFailure()
    {
        Map<String,Integer> ExpectedMap=new HashMap<String, Integer>();
        ExpectedMap.put("one",5);
        ExpectedMap.put("two",3);
        ExpectedMap.put("three",2);
        Map<String,Integer> actualMap=countString.countNumOfString( "one one -one___two,,three,one @three*one?two");

        assertNotEquals(ExpectedMap,actualMap);
    }


    @Test
    public void testCountStringNeutral()
    {
        Map<String,Integer> actualMap=countString.countNumOfString( null);
        assertNull(actualMap);
    }
}