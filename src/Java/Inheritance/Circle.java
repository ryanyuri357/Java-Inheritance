package Java.Inheritance;

public class Circle {

    // field //
    private double radius;

    // constructor //
    public Circle(double radius) {
        this.radius = ((radius < 0 ) ? 0 : radius);
    }

    // radius getter //
    public double getRadius() {
        return radius;
    }

    // area method //
    public double getArea() {
        return (this.radius * this.radius * Math.PI);
    }
}
