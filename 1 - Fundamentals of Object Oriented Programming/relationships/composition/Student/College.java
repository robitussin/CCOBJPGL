import java.util.ArrayList;
import java.util.List;

class University {
    private String name;
    ArrayList<Student> studentList;

    // Constructor
    // Assign university name
    public University(String name) {
        this.name = name;
    }

    // Method to set Students list
    public void setStudentList() {

        // Create three Student objects
        Student student1 = new Student("Ben");
        Student student2 = new Student("Christian");
        Student student3 = new Student("Jay");

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        this.studentList = students;
    }

    public String getName() {
        return this.name;
    }

    // Method to get students list
    public List<String> getStudentList() {
        List<Student> students = this.studentList;
        List<String> names = new ArrayList<String>();
        for (Student student : students) {
            names.add(student.getName());
        }
        return names;
    }
}