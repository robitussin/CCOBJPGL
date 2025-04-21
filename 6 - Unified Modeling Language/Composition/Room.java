// Room class
class Room {

    // Room class has a name
    private String roomName;

    // Constructor to initialize the room name
    public Room(String name) {
        this.roomName = name;
    }

    // Method to describe the room
    public void describeRoom() {
        System.out.println("This is the " + roomName + " room.");
    }
}
