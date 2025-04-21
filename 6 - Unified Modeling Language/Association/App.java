// Main class
public class App {
    public static void main(String[] args) {

        Student student = new Student("Greg");
        Teacher teacher = new Teacher("Elizer");

        // Association: teacher interacts with student
        teacher.teach(student);
    }
}
