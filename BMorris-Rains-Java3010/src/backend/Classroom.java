package backend;

/**
 * Use this class to create Classrooms. Each classroom should contain a
 * room number and room type.
 *
 * Room types can be any of the following from the enumerated list below:
 * 1) Lab 
 * 2) Classroom 
 * 3) Lecture Hall
 *
 */
public class Classroom implements IClassroom {

    private String roomNumber;
    private RoomType typeOfRoom;

    // Enumerated list of room types restricts the type of room allowed
    public enum RoomType {
        LAB, CLASSROOM, LECTURE_HALL
    }

    // Default no-arg constructor, assume some default values
    public Classroom() {
        roomNumber = "000";
        typeOfRoom = RoomType.CLASSROOM;
    }

    // Overloaded constructor
    public Classroom(String number, RoomType typeOfRoom) {
        this.roomNumber = number;
        this.typeOfRoom = typeOfRoom;
    }

    public String getRoomNumber() {
        return this.roomNumber;
    }

    public RoomType getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setRoomNumber(String room) {
        this.roomNumber = room;
    }

    public void setTypeOfRoom(RoomType typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    @Override
    public String toString() {
        return "Classroom{" + "roomNumber=" + roomNumber + ", typeOfRoom=" + typeOfRoom + '}';
    }   

}
