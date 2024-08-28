// DSA --> Lab Task : 02



import java.util.LinkedList;
public class StudentLinkedListExample {


// Inner Class Student
    private static class Student {
        private int id;
        private String name;
        private String department;

        public Student(int id, String name, String department) {
            this.id = id;
            this.name = name;
            this.department = department;
        }


        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        @Override
        public String toString() {
            return "Student {" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", department='" + department + '\'' +
                    '}';
        }
    } // end of inner class

    // Helper method to display the  student's list
     public void displayStudentList(LinkedList<Student> list) {
        for (Student student : list) {
            System.out.println(student); }

    }


        public static void main(String[] args) {
        StudentLinkedListExample s1 = new StudentLinkedListExample();

        // Creating a LinkedList to store student details

        LinkedList<Student> studentList = new LinkedList<>();
        // Adding new students to the LinkedList
        studentList.add(new Student(40, "Farooque", "SW"));
        studentList.add(new Student(21, "Saad", "CVL"));
        studentList.add(new Student(501, "Ahmed", "Physics"));
        studentList.add(new Student(101, "Hassan", "EL"));
        // Displaying the list of students
        System.out.println("Initial Student List:");
        s1.displayStudentList(studentList);


        // Adding a new student at the beginning of the LinkedList
        studentList.addFirst(new Student(1000, "Ali", "SW"));
        System.out.println("After adding ");
        s1.displayStudentList(studentList);

        // Adding a new student at a specific position in the LinkedList
        studentList.add(2, new Student(105, "Sarah ", "Biology"));
        System.out.println(" After adding ");
        s1.displayStudentList(studentList);
            System.out.println();

        // Removing a student from the end of the LinkedList
        Student removedStudent = studentList.removeLast();
        System.out.println(" Removed student from the end is : " + removedStudent.getName());
        s1.displayStudentList(studentList);
            System.out.println();

        // Finding a student by ID and updating their details
        for (Student student : studentList) {
            if (student.getId() == 40) student.setDepartment("Geology");
        }

        // After Updating department, Student With ID 40
        System.out.println(" Updated department for student with ID 40 : ");
        s1.displayStudentList(studentList);
            System.out.println();

        // Checking if a student with ID 101 exists in the Linked list
        boolean hasStudent101 = studentList.stream().anyMatch(student -> student.getId() == 101);
        System.out.println("\nDoes student with ID 101 exist? " + (hasStudent101 ? "Yes" : "No"));

            // Checking if a student with ID 40 exists in the Linked list
            boolean hasStudent40 = studentList.stream().anyMatch(student -> student.getId() == 40);
            System.out.println("\nDoes student with ID 40 exist? " + (hasStudent40 ? "Yes" : "No"));

        // Iterating over the LinkedList and displaying all student details
        System.out.println("\nAll Student Details:");
        s1.displayStudentList(studentList);
    }


}