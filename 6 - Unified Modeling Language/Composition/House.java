// House class (composed of Rooms)
class House {

    // House has its own rooms as part of its composition
    private Room livingRoom;
    private Room bedRoom;
    private Room kitchen;

    // Constructor to initialize the house with its rooms
    public House() {
        // House creates its own rooms
        this.livingRoom = new Room("Living");
        this.bedRoom = new Room("Bedroom");
        this.kitchen = new Room("Kitchen");
    }

    // Method to describe the house and its rooms
    public void describeHouse() {
        System.out.println("House description:");
        livingRoom.describeRoom();
        bedRoom.describeRoom();
        kitchen.describeRoom();
    }
}