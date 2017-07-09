package assignmentSix;

/**
 *
 * @author BenMorrisRains
 */
public class Rectangle extends Shape {

    double width;
    double length;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;

    }

    @Override
    public String toString() {
        return "Rectangle with length of " + length + " and a width of " + width + " and an area of "
                + area() + '.';
    }

}
