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
public class NoDataException extends Exception {
      
     public NoDataException() {
         super();
     }
    
    
    public NoDataException(String errorMessage) {
        super(errorMessage);
    }
}
