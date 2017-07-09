/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;

/**
 *
 * @author BenMorrisRains
 */
public class StudentCourse {
    
    private String courseId; 
    ArrayList<Double> courseGrades;
  

    public StudentCourse(String courseId) {
        this.courseGrades = new ArrayList<>(); 
        this.courseId = courseId; 
   
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public ArrayList<Double> getCourseGrades() {
        return courseGrades;
    }

    public void setCourseGrades(ArrayList<Double> courseGrades) {
        this.courseGrades = courseGrades;
    }

    @Override
    public String toString() {
        return  courseId ;
    }


    public String getCourseID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}