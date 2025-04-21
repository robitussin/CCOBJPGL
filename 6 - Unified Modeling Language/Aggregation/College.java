
import java.util.List;

// Class 3
// College class
// College class contains the list of Departments
class College {

    // Attributes of College
    private String collegeName;
    private List<Department> departments;

    // Constructor of College class
    public College(String collegeName, List<Department> departments)
    {
        // This keyword refers to current instance itself
        this.collegeName = collegeName;
        this.departments = departments;
    }

    public void addDepartment(Department department)
    {
        departments.add(department);
    }

    // Method of College class
    // Counting total students in the College
    public int getTotalStudentsInCollege()
    {
        int noOfStudents = 0;
        List<Student> students = null;

        for (Department dept : departments) {
            students = dept.getStudents();

            for (Student s : students) {
                noOfStudents++;
            }
        }
        return noOfStudents;
    }
}