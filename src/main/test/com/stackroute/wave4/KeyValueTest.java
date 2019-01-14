package com.stackroute.wave4;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.HashMap;
import java.util.LinkedHashMap;

import static org.junit.Assert.*;
@RunWith(JUnit4.class)

public class KeyValueTest {
    KeyValue testObject;

    @Before
    public void setUp() throws Exception {
        testObject = new KeyValue();
    }

    @After
    public void tearDown() throws Exception {
        testObject = null;
    }

    @Test
    public void testValueSuccess() {

        LinkedHashMap<String, String> hm = new LinkedHashMap<>();

        hm.put("val1","java");
        hm.put("val2","c++");

        HashMap<String, String> res = new HashMap<>();

        res.put("val1"," ");
        res.put("val2","java");

        assertEquals("Error",res, testObject.changevalues(hm)); }

    @Test
    public void testValueFailure(){

        LinkedHashMap<String, String> hm = new LinkedHashMap<>();

        hm.put("val1", "Hima");
        hm.put("val2", "Chandrashekar");

        HashMap<String, String> res = new HashMap<>();

        res.put("val1", " ");
        res.put("val2", "Kshem");

        assertNotEquals("Error", res, testObject.changevalues(hm));
    }

    @Test
    public void ModifyFailure() {

        LinkedHashMap<String, String> hm = new LinkedHashMap<>();

        hm.put("val1", "Akshay");
        hm.put("val2", "Badiger");

        assertNotNull("Error",testObject.changevalues(hm));

    }

}