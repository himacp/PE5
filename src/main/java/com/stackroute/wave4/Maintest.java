/**
 * Student class that represents the following information of a
 * student: id, name, and age allthe member variables should be private
 * .a. Implement `getter and setter`
 * .b. Create a `StudentSorter` class that implements `Comparator interface`.
 * c. Write a class `Maintest` create Student class object(minimum 5).
 * d. Add these student object into a List of type Student.
 * e. Sort the list based on their age in decreasing order,
 * for student having sameage, sort based on their name.
 */

package com.stackroute.wave4;
import java.util.Collections;
import java.util.List;

public class Maintest {
    /*
    This method will get the list of student and then send the list to sort
    and it converts the list in descending order
     */
    public List<Student> sortStudentList(List<Student> studentList)
    {
        if(studentList == null )
        {
            return null;
        }
        Collections.sort(studentList,new StudentSorter().reversed()); // sending for sorting
        return studentList;
    }

}
