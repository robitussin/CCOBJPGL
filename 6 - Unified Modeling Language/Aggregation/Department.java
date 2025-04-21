import java.util.List;

// Class 2
// Department class 
// Department class contains list of Students
class Department {

    // Attributes of Department class
    private String departmentName;
    private List<Student> students;

    // Constructor of Department class
    public Department(String deptName, List<Student> students)
    {
        this.departmentName = deptName;
        this.students = students;
    }

    public List<Student> getStudents() {
      return students; 
    }

    public void addStudent(Student student)
    {
        students.add(student);
    }
}
