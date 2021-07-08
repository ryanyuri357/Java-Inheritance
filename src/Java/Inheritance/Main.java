/*

    Examples of Inheritance.
    3 Separate examples

 */


package Java.Inheritance;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius() = " + circle.getRadius());
        System.out.println("circle.getArea() = " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius() = " + cylinder.getRadius());
        System.out.println("cylinder.height() = " + cylinder.getHeight());
        System.out.println("cylinder.getArea() = " + cylinder.getArea());
        System.out.println("cylinder.getVolume() = " + cylinder.getVolume());



    }
}
