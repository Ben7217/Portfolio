/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import javax.swing.JTextField;

/**
 *
 * @author BenMorrisRains
 */
public class Student extends Person {
    
    private double currentGPA; 
    String dateOfGraduation; 
    ArrayList enrolledCourses;
    
    public Student (){
        this.enrolledCourses = new ArrayList();
    }

    public double getCurrentGPA() {
        return currentGPA;
    }

    public void setCurrentGPA(double currentGPA) {
        this.currentGPA = currentGPA;
    }

    public String getDateOfGraduation() {
        return dateOfGraduation;
    }

    public void setDateOfGraduation(String dateOfGraduation) {
        this.dateOfGraduation = dateOfGraduation;
    }

    public ArrayList getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(ArrayList enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString() + "dateOfGraduation=" + dateOfGraduation  + "enrolledCourses=" + enrolledCourses + '}'+ "currentGPA=" + currentGPA;
    }

   




    
    }


  
