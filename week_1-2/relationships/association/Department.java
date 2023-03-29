import java.util.List;
import java.util.ArrayList;

//Department Class
class Department {
    private String name;
    List<Professor> staff;

    // Constructor
    // Assign department name
    Department(String name) {
        this.name = name;
    }

    // Method to retrieve department name
    public String getName() {
        return this.name;
    }

    // Method to assign list of department staff
    public void setStaff(List<Professor> staff) {
        this.staff = staff;
    }

    // Method to return the list of staff names
    public List<String> getStaff() {

        List<String> professor_names = new ArrayList<String>();
        for (Professor prof : this.staff) {
            professor_names.add(prof.getName()); // add name of each professor to names list
        }
        return professor_names; // return names list
    }
}