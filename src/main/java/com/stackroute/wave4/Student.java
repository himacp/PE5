/**
 * Student class that represents the following information of a
 * student: id, name, and age allthe member variables should be private
 * .a. Implement `getter and setter`
 * .b. Create a `StudentSorter` class that implements `Comparator interface`.
 * c. Write a class `Maintest` create Student class object(minimum 5).
 * d. Add these student object into a List of type Student.
 * e. Sort the list based on their age in decreasing order,
 * for student having sameage, sort based on their name.
 * . For students having same name and age, sort them according to their ID.
 */
package com.stackroute.wave4;

public class Student {
    /*Member Variables*/
    private int id;
    private String name;
    private int age;

    /*Constructor*/
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    /*toString Method*/
    @Override
    public String toString() {
        return String.format("com.stackroute.wave4{id=%d, name=%s, age=%d}", id, name, age);
    }
    /*getter and setter Methods*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
