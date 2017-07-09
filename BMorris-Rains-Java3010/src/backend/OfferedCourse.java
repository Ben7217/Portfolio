/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import interfaces.ICourse;
import java.util.ArrayList;


/**
 *
 * @author BenMorrisRains
 */
public class OfferedCourse implements ICourse {

    private String courseId;
    private String courseName;
    ArrayList classRooms;
    
public OfferedCourse () {
    this.classRooms = new ArrayList();
}

    public OfferedCourse(String courseId) {
        this.courseId = courseId;
    }

    public ArrayList getClassRooms() {
        return classRooms;
    }

    public void setClassRooms(ArrayList classRooms) {
        this.classRooms = classRooms;
    }
   
    
    public OfferedCourse(String courseId, String courseName){
       
        this.courseId = courseId; 
        this.courseName = courseName; 
    }

    public String getCourseId() {
        return courseId;
    }


    @Override
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "OfferedCourse{" + "courseId=" + courseId + ", courseName=" + courseName + ", classRoom" + classRooms + '}';
    }

    @Override
    public String getCourseID() {
        return courseId;
    }

  
  

    

 

}
