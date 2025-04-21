// Student class
class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void attendClass() {
        System.out.println(name + " is attending class.");
    }
}
