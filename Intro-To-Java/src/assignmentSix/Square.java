package assignmentSix;

/**
 *
 * @author BenMorrisRains
 */
public class Square extends Shape {

    double length;

    public Square(String color, double length) {
        super(color);
        this.length = length;
    }

    @Override
    public double area() {
        return Math.pow(length, 2);

    }

    @Override
    public String toString() {
        return "Square with a side length of " + length + " and an area of " + area() + '.';
    }

}
