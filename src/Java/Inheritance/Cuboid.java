package Java.Inheritance;

public class Cuboid extends Rectangle {

    // field //
    private double height;

    // constructor //
    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = ((height < 0 ) ? 0 : height);
    }

    // getter //
    public double getHeight() {
        return height;
    }

    // method //
    public double getVolume() {
        return super.getArea() * this.getHeight();
    }
}
