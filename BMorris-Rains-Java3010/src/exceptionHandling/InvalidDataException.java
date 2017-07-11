/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionHandling;

/**
 *
 * @author BenMorrisRains
 */
public class InvalidDataException extends Exception {
    
    public InvalidDataException() {
        super();
    }
    
    public InvalidDataException(String errorMessage) {
        super(errorMessage); 
    }
    
}
