/*
 *  This Class contains lists which will hold objects created in the UI
 *  Anytime you want to store lists of objects created in the UI, add it to
 *  this class.
 */
package data;

import backend.Classroom;
import backend.Student;
import backend.Faculty;
import backend.OfferedCourse;
import java.util.ArrayList;

public class DataContainer {

    private ArrayList<Classroom> listOfClassrooms = new ArrayList<Classroom>();
    private ArrayList<Student> listOfStudents = new ArrayList<Student>();
    private ArrayList<Faculty> listOfFaculty = new ArrayList<Faculty>();
    private ArrayList<OfferedCourse> listOfCourses = new 
        ArrayList<OfferedCourse>();

    /**
     * no-arg constructor
     */
    public DataContainer() {
    }

    public ArrayList<Classroom> getListOfClassrooms() {
        return listOfClassrooms;
    }

    public void setListOfClassrooms(ArrayList<Classroom> listOfClassrooms) {
        this.listOfClassrooms = listOfClassrooms;
    }

    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(ArrayList<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    public ArrayList<Faculty> getListOfFaculty() {
        return listOfFaculty;
    }

    public void setListOfFaculty(ArrayList<Faculty> listOfFaculty) {
        this.listOfFaculty = listOfFaculty;
    }

    public ArrayList<OfferedCourse> getListOfCourses() {
        return listOfCourses;
    }

    public void setListOfCourses(ArrayList<OfferedCourse> listOfCourses) {
        this.listOfCourses = listOfCourses;
    }

    
}
