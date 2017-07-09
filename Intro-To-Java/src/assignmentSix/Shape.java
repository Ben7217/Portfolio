/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentSix;

/**
 *
 * @author BenMorrisRains
 */
public class Shape {

    String shapeColor;

    public Shape(String color) {

        shapeColor = color;
    }

    public String getColor() {
        return shapeColor;
    }

    public double area() {
        return 0.0;

    }

    @Override
    public String toString() {
        return "genaric shape";
    }

}
