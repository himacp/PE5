package com.stackroute.wave4;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class KeyValueTest {

    KeyValue keyValue;
    @Before
    public void setUp()
    {
        keyValue =new KeyValue();
    }

    @After
    public void tearDown()
    {
        keyValue =null;
    }

    @Test
    public void keyValueSuccess()
    {
        Map<String,String> map= new TreeMap<>();
        map.put("val1","java");
        map.put("val2","c++");

        Map<String,String> actualMap= keyValue.changeTwoKeyValue(map);
        Map<String, String> expectedMap=new TreeMap<>();
        expectedMap.put("val1"," ");
        expectedMap.put("val2","java");

        assertEquals(expectedMap,actualMap);

    }

    @Test
    public void keyValueFailure()
    {
        Map<String,String> map= new TreeMap<>();
        map.put("val1","java");
        map.put("val2","c++");

        Map<String,String> actualMap= keyValue.changeTwoKeyValue(map);
        Map<String, String> expectedMap=new TreeMap<>();
        expectedMap.put("val1","c++");
        expectedMap.put("val2","java");

        assertNotEquals(expectedMap,actualMap);
    }

    @Test
    public void keyValueNeutral()
    {
        Map<String,String> map= new TreeMap<>();
        Map<String,String> actualMap= keyValue.changeTwoKeyValue(map);
        assertNull(actualMap);
    }
}