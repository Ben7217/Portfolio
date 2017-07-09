package interfaces;

import backend.Classroom;

/*
 * Interface to define classroom types - since Classroom is the only class
 * that implements this interface it can probably be eliminated but we'll 
 * leave it in for completeness.
 */

public interface IClassroom {
    
    String getRoomNumber();
    void setRoomNumber(String roomnumber);
    
    Classroom.RoomType getTypeOfRoom();
    void setTypeOfRoom(Classroom.RoomType roomtype);
}
