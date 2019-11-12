package edu.cscc;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Md Basher
 * Date: 11/10/2019
 * ProjectName: CSCI-2467 Lab 10 – Comparator Class for Sorting...
 */

/**
 * Source Notes:
 * The Main method prints the list of Students sorted by last name.
 * It uses the Arrays.sort() method and an anonymous Comparator object to sort the array by the student’s last name.
 * Using the Arrays.sort() method and anonymous Comparator objects print out the array of students using the following three sorting criteria:
 * 1.	Sorted in order of major (A-Z)
 * 2.	Sorted by zip code (increasing)
 * 3.	Sorted by Grade Point Average (GPA) (decreasing)
 * Note: when sorting by GPA, you will need to be clever to correctly sort GPA’s such as 3.1, 3.2, 3.4 in the correct order.
 */

public class Main {

    public static void main(String[] args) {
        Student[] students = TestData.createStudents();
        Arrays.sort(students,new Comparator<Student>() { // Sort out students by the last names...
            public int compare(Student s1,Student s2) {
                String lastname1 = s1.getLastName();
                String lastname2 = s2.getLastName();
                return lastname1.compareTo(lastname2);
            }
        });
        printStudentList("Students Sorted By LastName",students);



        /**
         * Arrays.sort() - method used to sort out students by major...
         * Sort students by major...
         */

        Arrays.sort(students,new Comparator<Student>() {
            public int compare(Student s1,Student s2) {
                String major1 = s1.getMajor();
                String major2 = s2.getMajor();
                return major1.compareTo(major2);
            }
        });
        printStudentList("Students Sorted By Major",students);


        /**
         * Arrays.sort() - method used to sort out students  by zip codes...
         */
        Arrays.sort(students,new Comparator<Student>() {
            public int compare(Student s1,Student s2) {
                int zipCode1 = s1.getZipcode();
                int zipCode2 = s2.getZipcode();
                return zipCode1 - zipCode2; //.compareTo(zipCode2); - this portion is used for string comparison only...
            }
        });
        printStudentList("Students Sorted By Zip Code",students);


        /**
         * Arrays.sort() - method used to sort out students by GPA...
         */

        Arrays.sort(students,new Comparator<Student>() {
            public int compare(Student s1,Student s2) {
                double gpa1 = s1.getGpa(); // todo - may need some improvements here...
                double gpa2 = s2.getGpa(); // todo - may need some improvements here...
                if (gpa2 < gpa1) return -1; // todo - may need some improvements here...
                if (gpa2> gpa1) return 1; // todo - may need some improvements here...
                else return 0;
                //double gpa1 = s1.getGpa();
                //double gpa2   = s2.getGpa();
                //return  (int)( gpa2 - gpa1); //.compareTo(zipCode2); - this portion is used for string comparison only...
            }
        });

        printStudentList("Students Sorted By GPA",students);
    }

    /**
     * printStudentList() - method
     * @param title - takes title as the parameter...
     * @param list - takes list as the parameter...
     */
    public static void printStudentList(String title,Student[] list) {
        final String format = "%-12s %-12s %-18s %-12s %-12s\n";
        System.out.println(title);
        System.out.printf(format,"First Name","Last Name","Major","Zip Code","GPA");
        for (Student s : list) {
            System.out.printf(format,s.getFirstName(),s.getLastName(),s.getMajor(),s.getZipcode(),s.getGpa());
        }
        System.out.println("==============================================================\n");
    }
}
