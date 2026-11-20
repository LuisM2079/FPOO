package pt.ipp.estg.pp.pp_fp09.shapes;

import java.util.Objects;

/**
 *
 * @author luism
 */
public class Circle extends Shape {

    protected double radius = 1.0;

    public Circle(boolean filled) {
        super(filled);
    }

    public Circle(boolean filled, double radius) {
        super(filled);
        this.radius = radius;
    }

    public Circle(boolean filled, double radius, String color) {
        super(filled, color);
        this.radius = radius;
    }

    public Circle(boolean filled, String color) {
        super(filled, color);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj)
                && Double.compare(radius, ((Circle) obj).radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() + ", radius=" + radius
                + ", area=" + String.format("%.2f", getArea())
                + ", perimeter=" + String.format("%.2f", getPerimeter()) + "]";
    }
}
