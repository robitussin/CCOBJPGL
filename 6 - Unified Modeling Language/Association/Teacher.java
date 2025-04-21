// Teacher class
class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    // Simple association: Teacher uses Student
    public void teach(Student student) {
        System.out.println(name + " is teaching " + student.getName());
        student.attendClass();
    }
}