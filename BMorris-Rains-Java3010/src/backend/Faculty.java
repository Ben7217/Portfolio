/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;
import backend.Person;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author BenMorrisRains
 */
public class Faculty extends Person {

    private GregorianCalendar dateOfHire;
    private GregorianCalendar dateOfTermination;
    private String status; //FULLTIME, PARTIME
    private double salary;
    ArrayList listOfCourses;
    /*FacultyCourse(This will contain a list of courses the
    Faculty teaches)*/    


    public Faculty (){
        this.listOfCourses = new ArrayList();
        
    }
    public GregorianCalendar getDateOfHire() {
        return dateOfHire;
    }

    public void setDateOfHire(GregorianCalendar dateOfHire) {
        this.dateOfHire = dateOfHire;
    }

    public GregorianCalendar getDateOfTermination() {
        return dateOfTermination;
    }

    public void setDateOfTermination(GregorianCalendar dateOfTermination) {
        this.dateOfTermination = dateOfTermination;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ArrayList getListOfCourses() {
        return listOfCourses;
    }


    public void setListOfCourses(ArrayList listOfCourses) {
        this.listOfCourses = listOfCourses;
    }

    @Override
    public String toString() {
        return "Faculty{" + "dateOfHire=" + dateOfHire.getTime() + ", dateOfTermination=" + dateOfTermination.getTime() + ", status=" + status + ", salary=" + salary + ", listOfCourses=" + listOfCourses + '}';
    }

  
 
    
    


}
