package pt.ipp.estg.pp.pp_fp09.shapes;

import java.util.Objects;

/**
 *
 * @author luism
 */
public class Rectangle extends Square {

    protected double height = 1.0;

    public Rectangle(boolean filled) {
        super(filled);
    }

    public Rectangle(boolean filled, String color) {
        super(filled, color);
    }

    public Rectangle(boolean filled, double width) {
        super(filled, width);
    }

    public Rectangle(boolean filled, String color, double width) {
        super(filled, color, width);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj)
                && Double.compare(height, ((Rectangle) obj).height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height);
    }

    @Override
    public String toString() {
        return "Rectangle[color=" + color + ", filled=" + filled
                + ", width=" + width + ", height=" + height
                + ", area=" + String.format("%.2f", getArea())
                + ", perimeter=" + String.format("%.2f", getPerimeter()) + "]";
    }
}
