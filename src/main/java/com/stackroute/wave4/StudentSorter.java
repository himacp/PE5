/**
 * Student class that represents the following information of a
 * student: id, name, and age allthe member variables should be private
 * .a. Implement `getter and setter`
 * .b. Create a `StudentSorter` class that implements `Comparator interface`.
 * c. Write a class `Maintest` create Student class object(minimum 5).
 * d. Add these student object into a List of type Student.
 * e. Sort the list based on their age in decreasing order,
 * for student having sameage, sort based on their name.
 * For students having same name and age, sort them according to their ID.
 */
package com.stackroute.wave4;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {
    /*
    This method will sort descedingly Student variables, first according to age
    if age is equal then according to name, if name is equal then according to
    Id.
     */
    public int compare( Student student1,Student student2)
    {
        int ageCompare = student1.getAge()-student2.getAge();
        int nameCompare = student1.getName().compareTo(student2.getName());
        int idCompare=student1.getId()-student2.getId();
        // comparing age
        if( ageCompare != 0 )
        {
            return ageCompare;
        }
        // comparing Name
        else if( nameCompare != 0 )
        {
            return nameCompare;
        }
        // compare Id
        else
            return idCompare;
    }
}

