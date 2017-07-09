/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.GregorianCalendar;

/**
 *
 * @author BenMorrisRains
 */
public interface IPerson {

    public String getName();

    public String getAddress();

    public String getSocialSecurityNumber();

    public String getDateOfBirth();

    public void setName(String name);

    public void setAddress(String address);

    public void setSocialSecurityNumber(String ssn);

    public void setDateOfBirth(String dateOfBirth);

    @Override
    public String toString();
}
