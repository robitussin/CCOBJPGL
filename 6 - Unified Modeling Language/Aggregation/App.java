// Java program to illustrate
// Concept of Aggregation

import java.util.*;

class App {
    public static void main(String[] args)
    {
        // Creating independent Student objects
        Student s1 = new Student("Elizer", 1);
        Student s2 = new Student("Dwayne", 2);
        Student s3 = new Student("Jared", 3);
        Student s4 = new Student("Adrid", 4);

        // Creating an list of CS Students
        List<Student> cs_students = new ArrayList<>();
        cs_students.add(s1);
        cs_students.add(s2);

        // Creating an initial list of IT Students
        List<Student> it_students = new ArrayList<>();
        it_students.add(s3);
        it_students.add(s4);

        // Creating Department object with a Students list
        // using Aggregation (Department "has" students)
        Department CS = new Department("CS", cs_students);
        Department IT = new Department("IT", it_students);

        // Creating an initial list of Departments
        List<Department> departments = new ArrayList<>();
        departments.add(CS);
        departments.add(IT);

        // Creating an College object with Departments list
        // using Aggregation (Institute "has" Departments)
        College college = new College("CCIT", departments);

        // Display message for better readability
        System.out.print("Total students in college: ");

        // Calling method to get total number of students
        // in the college and printing on console
        System.out.print(college.getTotalStudentsInCollege());
    }
}
