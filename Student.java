package edu.cscc;

/**
 * @author Md Basher
 * Date: 11/10/2019
 * ProjectName: CSCI-2467 Lab 10 – Comparator Class for Sorting...
 */


/**
 * Class Student is a constant class...
 *  This class takes variables...
 */
public final class Student {
    private final String firstName;
    private final String lastName;
    private final String major;
    private final int zipcode;
    private final String studentID;
    private final double gpa;


    /**
     * Constructor Student has 6 parameters...
     * @param firstName - takes firstName as the parameter...
     * @param lastName - takes lastName as the parameter...
     * @param major - takes major as the parameter...
     * @param zipcode - takes zipcode as the parameter...
     * @param studentID - takes studentID as the parameter...
     * @param gpa - takes gpa as the parameter...
     */

    public Student(String firstName, String lastName, String major, int zipcode, String studentID, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.zipcode = zipcode;
        this.studentID = studentID;
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMajor() {
        return major;
    }

    public int getZipcode() {
        return zipcode;
    }

    public String getStudentID() {
        return studentID;
    }

    public double getGpa() {
        return gpa;
    }
}
