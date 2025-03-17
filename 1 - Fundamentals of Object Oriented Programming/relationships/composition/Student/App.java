public class App {
    public static void main(String[] args) {

        // Create a university object
        University NU = new University("National University");

        // set Student List in University class

        NU.setStudentList();

        // Outputting the Has-a association between University and Student
        System.out.println("The students studying in " + NU.getName() + " are " + NU.getStudentList());
    }
}
