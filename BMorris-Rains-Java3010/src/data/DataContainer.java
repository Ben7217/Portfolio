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
import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

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

    
    public void writeTextFile () { 
        
        PrintWriter writer = null; 
        
                try {
            writer = new PrintWriter("classroom.txt");

            // Loop through the array list of classrooms and print comma delimited to a text file
            for (Classroom classroom : listOfClassrooms) {
                writer.println(classroom.toString());
                writer.println(); 
            } 
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            
        } 
                writer.flush();
    writer.close(); 
    
       try {
            writer = new PrintWriter("students.txt");

          
            for (Student student : listOfStudents) {
                writer.println(student.toString());
                writer.println();
            } 
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } 
       
        writer.flush();
        writer.close();
    
    
        try {
            writer = new PrintWriter("faculty.txt");

          
            for (Faculty faculty : listOfFaculty) {
                writer.println(faculty.toString());
                writer.println();
            } 
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } 
       
        writer.flush();
        writer.close();
    
     try {
            writer = new PrintWriter("courses.txt");

          
            for (OfferedCourse courses : listOfCourses) {
                writer.println(courses.toString());
                writer.println();
            } 
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } 
       
        writer.flush();
        writer.close();
    }
    
     /**
     * Creates a serialized object
     */
    /*public void writeSerializedFile() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream("classroom.ser"));
            oos.writeObject(this.listOfClassrooms);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Create an XML formatted output file
     */
  /*  public void writeXML() {

        // get a document builder factory
        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();

        try {
            // get a document builder from the factory
            DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();

            // create an instance of the document model
            Document doc = docBuilder.newDocument();

            // create the root element <list_of_classrooms> and append to document
            Element root = doc.createElement("list_of_classrooms");
            doc.appendChild(root);

            // Loop through the array list of classrooms and create the classroom elements of the xml file
            for (Classroom classroom : listOfClassrooms) {

                Element classroomElement = doc.createElement("classroom");

                Element roomNumberElement = doc.createElement("room_number");
                Text roomNumberText = doc.createTextNode(classroom.getRoomNumber());
                roomNumberElement.appendChild(roomNumberText);
                classroomElement.appendChild(roomNumberElement);

                Element roomtypeElement = doc.createElement("room_type");
                Text roomtypetText = doc.createTextNode(classroom.getTypeOfRoom().toString());
                roomtypeElement.appendChild(roomtypetText);
                classroomElement.appendChild(roomtypeElement);

                root.appendChild(classroomElement);

            }

            // use default xml formatting in the file
            OutputFormat format = new OutputFormat(doc);
            format.setIndenting(true);

            // open the output stream
            XMLSerializer serializer = new XMLSerializer(
                    new FileOutputStream(new File("classroom.xml")), format);

            // write out the object
            serializer.serialize(doc);

        } catch (IOException | ParserConfigurationException | DOMException pce) {
            System.out.println(pce.getMessage());
        }
    }*/
    
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
