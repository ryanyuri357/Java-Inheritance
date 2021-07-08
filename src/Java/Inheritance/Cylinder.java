package Java.Inheritance;

public class Cylinder extends Circle{

    // field //
    private double height;

    // constructor //
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = ((height < 0 )? 0 : height);
    }

    // height getter //
    public double getHeight() {
        return height;
    }

    // volume method //
    public double getVolume() {
        return super.getArea() * this.getHeight();
    }
}
