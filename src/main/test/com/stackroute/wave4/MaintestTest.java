package com.stackroute.wave4;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class MaintestTest {
    Maintest maintest;

    @Before
    public void setUp()
    {
        maintest=new Maintest();
    }

    @After
    public void tearDown()
    {
        maintest=null;
    }

    @Test
    public void testStudentSuccess()
    {
        List<Student> studentList=new ArrayList<>();
        Student studentObj1 = new Student(111,"Harry", 27);
        Student studentObj2 = new Student(112,"Soms", 23);
        Student studentObj3 = new Student(123,"Stephan", 37);
        Student studentObj4 = new Student(101,"Jon", 22);
        Student studentObj5 = new Student(134,"Elena", 29);
        Student studentObj6 = new Student(102,"Jon", 22);
        studentList.add(studentObj1);
        studentList.add(studentObj2);
        studentList.add(studentObj3);
        studentList.add(studentObj4);
        studentList.add(studentObj5);
        studentList.add(studentObj6);
        List<Student> actualList=maintest.sortStudentList(studentList);
        List<Student> expectedList=new ArrayList<>();
        expectedList.add(new Student(123,"Stephan",37));
        expectedList.add(new Student(134,"Elena",29));
        expectedList.add(new Student(111,"Harry",27));
        expectedList.add(new Student(112,"Soms",23));
        expectedList.add(new Student(102,"Jon",22));
        expectedList.add(new Student(101,"Jon",22));

        assertEquals(expectedList.toString().trim(),studentList.toString().trim());
    }

    @Test
    public void testStudentFailure()
    {
        List<Student> studentList=new ArrayList<>();
        Student studentObj1 = new Student(111,"Harry", 27);
        Student studentObj2 = new Student(112,"Soms", 23);
        Student studentObj3 = new Student(123,"Stephan", 37);
        Student studentObj4 = new Student(101,"Jon", 22);
        Student studentObj5 = new Student(134,"Elena", 29);
        Student studentObj6 = new Student(102,"Jon", 22);
        studentList.add(studentObj1);
        studentList.add(studentObj2);
        studentList.add(studentObj3);
        studentList.add(studentObj4);
        studentList.add(studentObj5);
        studentList.add(studentObj6);
        List<Student> actualList=maintest.sortStudentList(studentList);
        List<Student> expectedList=new ArrayList<>();
        expectedList.add(new Student(134,"Elena",29));
        expectedList.add(new Student(123,"Stephan",37));
        expectedList.add(new Student(111,"Harry",27));
        expectedList.add(new Student(112,"Soms",23));
        expectedList.add(new Student(102,"Jon",22));
        expectedList.add(new Student(101,"Jon",22));
        assertNotEquals(expectedList.toString().trim(),studentList.toString().trim());
    }

    @Test
    public void testStudentNeutral()
    {
        List<Student> studentList=null;
        assertNull(maintest.sortStudentList(studentList));
        studentList = new ArrayList<>();
        assertNotNull(maintest.sortStudentList(studentList));
    }

}