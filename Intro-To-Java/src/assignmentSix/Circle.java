package assignmentSix;

/**
 *
 * @author BenMorrisRains
 */
public class Circle extends Shape {

    private final double iRadius;

    public Circle(String color, double radius) {

        super(color);
        iRadius = radius;

    }

    @Override
    public double area() {
        return iRadius * iRadius * Math.PI;

    }

    @Override
    public String toString() {

        return "Circle with a radius of " + iRadius + " and an area of "
                + area() + '.';
    }

}
