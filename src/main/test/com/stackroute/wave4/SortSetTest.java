package com.stackroute.wave4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class SortSetTest {

    SortSet sortSet;

    @Before
    public void setUp()
    {
        sortSet =new SortSet();
    }

    @After
    public void tearDown()
    {
        sortSet =null;
    }

    @Test
    public void testSortingSetSuccess()
    {
        HashSet set= new HashSet();
        set.add("Harry");
        set.add("Olive");
        set.add("Alice");
        set.add("Bluto");
        set.add("Eugene");
        List<String> actualValue = sortSet.setSorting(set);
        List<String> expectedValue=new ArrayList<>();
        expectedValue.add("Alice");
        expectedValue.add("Bluto");
        expectedValue.add("Eugene");
        expectedValue.add("Harry");
        expectedValue.add("Olive");

        assertEquals(expectedValue,actualValue);

    }

    @Test
    public void testSortingSetFailure()
    {
        HashSet set= new HashSet();
        set.add("Harry");
        set.add("Olive");
        set.add("Alice");
        set.add("Bluto");
        set.add("Eugene");
        List<String> actualValue = sortSet.setSorting(set);
        List<String> expectedValue=new ArrayList<>();
        expectedValue.add("Bluto");
        expectedValue.add("Alice");
        expectedValue.add("Eugene");
        expectedValue.add("Harry");
        expectedValue.add("Olive");

        assertNotEquals(expectedValue,actualValue);

    }

    @Test
    public void testSortingSetNeutral()
    {
        HashSet set= new HashSet();
        set=null;
        List<String> actualValue = sortSet.setSorting(set);
        assertNull(actualValue);
    }


}