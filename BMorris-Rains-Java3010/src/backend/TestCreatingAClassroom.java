/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author betsyruns
 */
public class TestCreatingAClassroom {
    
    public static void main(String[] args) {
        Classroom classroom = new Classroom("PA100", Classroom.RoomType.LECTURE_HALL);
        System.out.println(classroom.toString());
    }
}
