import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        // Create two professor objects
        Professor EP = new Professor("Elizer Ponio Jr");
        Professor MO = new Professor("Manolito Octaviano");

        // Create a department object
        Department CCIT = new Department("CCIT");

        // Add the professors to a list and add this list to department
        List<Professor> CCIT_STAFF = new ArrayList<Professor>();
        CCIT_STAFF.add(EP);
        CCIT_STAFF.add(MO);

        // Add staff to cse department
        CCIT.setStaff(CCIT_STAFF);

        // Output

        System.out.println("The staff of department " + CCIT.getName() + " is: " + CCIT.getStaff());

    }
}
