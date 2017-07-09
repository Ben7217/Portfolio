/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentSeven;

/**
 *
 * @author BenMorrisRains
 */
public class BadArrayException extends Exception {
    
    public BadArrayException () {
        super();
}
    public BadArrayException(String errorMessage) {
        super(errorMessage);
    }
    
    
    
}
