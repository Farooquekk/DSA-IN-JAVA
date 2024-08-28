// DSA --> Lab Task : 03
//  Collection FrameWork

import java.util.HashMap;
import java.util.Map;

enum Section {
    SECTION_1,
    SECTION_2,
    SECTION_3
}

class Student<R,S extends Enum<S>> {
    private Map<R, S> studentMap;



    public Student() {
        studentMap = new HashMap<>();
    }

    public void addStudent(R rollNumber, S section) {
        studentMap.put(rollNumber, section);
    }

    public void displayStudents() {
        System.out.println("List of Students:");
        for (Map.Entry<R, S> entry : studentMap.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + ", Section: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Student< String,Section> studentData = new Student<>();

        // Adding student roll numbers and sections
        studentData.addStudent("22SW040", Section.SECTION_1);
        studentData.addStudent("22SW080", Section.SECTION_3);
        studentData.addStudent("22SW120", Section.SECTION_2);
        studentData.addStudent("22SW160", Section.SECTION_1);

        // Displaying the list of students
        studentData.displayStudents();
    }
}
