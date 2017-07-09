/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;




/**
 *
 * @author BenMorrisRains
 */
public class FacultyCourse {
    
    private String courseId;
    private final String courseOffering;

    public FacultyCourse(String courseOffering) {
       this.courseOffering = courseOffering;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return courseOffering;
    }

    public String getCourseID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
   
    

    
}
