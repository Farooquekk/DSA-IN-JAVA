// DSA --> Lab Task : 03

import java.util.*;
public class Students {
    public static void main(String[] args) {
        // Creating a List to store student roll numbers
        List<String> studentRollNumbers = new LinkedList<>();

        // Adding student roll numbers to the list
        studentRollNumbers.add("22SW040");
        studentRollNumbers.add("22SW080");
        studentRollNumbers.add("22SW120");
        studentRollNumbers.add("22SW160");

        // Displaying the list of student roll numbers
        System.out.println("List of Student Roll Numbers:");
        for (String rollNumber : studentRollNumbers) {
            System.out.println("Roll Number :  " + rollNumber);
        }
    }
}