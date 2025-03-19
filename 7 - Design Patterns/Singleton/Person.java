class Person {

    // Private static variable of the same class that is the only instance of the
    // class.
    private static Person person;

    // Private constructor to restrict instantiation of the class from other
    // classes.
    private Person() {
    }

    // Public static method that returns the instance of the class, this is the
    // global access point for the outer world to get the instance of the singleton
    // class.
    public static Person getInstance() {

        if (null == person) {

            person = new Person();
        }

        return person;
    }
}
