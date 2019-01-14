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
public class StringAppearanceTest {

    StringAppearance stringAppearance;

    @Before
    public void setUp()
    {
        stringAppearance =new StringAppearance();
    }

    @After
    public void tearDown()
    {
        stringAppearance =null;
    }

    @Test
    public void stringAppearanceSuccess()
    {
        String[] testArray={"a","b","c","d","a","c","c"};
        Map<String,Boolean> expectedMap=new HashMap<String, Boolean>();
        expectedMap.put("a",true);
        expectedMap.put("b",false);
        expectedMap.put("c",true);
        expectedMap.put("d",false);
        Map<String,Boolean> actualMap= stringAppearance.stringAppears(testArray);
        assertEquals(expectedMap,actualMap);

    }

    @Test
    public void stringAppearanceFailure()
    {
        String[] testArray={"a","b","c","d","a","c","c"};
        Map<String,Boolean> expectedMap=new HashMap<String, Boolean>();
        expectedMap.put("a",true);
        expectedMap.put("b",true);
        expectedMap.put("c",true);
        expectedMap.put("d",false);
        Map<String,Boolean> actualMap= stringAppearance.stringAppears(testArray);
        assertNotEquals(expectedMap,actualMap);

    }

    @Test
    public void stringAppearanceNeutral()
    {
        String[] testArray=null;
        Map<String,Boolean> actualMap= stringAppearance.stringAppears(testArray);
        assertNull(actualMap);
    }

}