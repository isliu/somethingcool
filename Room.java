public class Room {
    private String name;
    private Room toWest;
    private Room toEast;

    public Room(String name, Room toWest, Room toEast) {
        this.name = name;
        this.toWest = toWest;
        this.toEast = toEast;
    }
}
