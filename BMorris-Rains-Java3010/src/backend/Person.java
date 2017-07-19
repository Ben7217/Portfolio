/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;
import interfaces.IPerson;
import java.util.GregorianCalendar;

/**
 *
 * @author BenMorrisRains
 */

public class Person implements IPerson {
//
    String name;
    String address; 
    String socialSecurityNumber;
    String dateOfBirth; 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return  "Name: " + name + ", Address: " + address + ", Social Security Number: " + socialSecurityNumber + ". Date of Birth: " + dateOfBirth;
    }

    

   

    

    
    
  
 
    
}
