package pt.ipp.estg.pp.pp_fp09.shapes;

import java.util.Objects;

/**
 *
 * @author luism
 */
public class Square extends Shape {

    protected double width = 1.0;

    public Square(boolean filled) {
        super(filled);
    }

    public Square(boolean filled, String color) {
        super(filled, color);
    }

    public Square(boolean filled, String color, double width) {
        super(filled, color);
        this.width = width;
    }

    public Square(boolean filled, double width) {
        super(filled);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * width;
    }

    @Override
    public double getPerimeter() {
        return 4 * width;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj)
                && Double.compare(width, ((Square) obj).width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), width);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + ", width=" + width
                + ", area=" + String.format("%.2f", getArea())
                + ", perimeter=" + String.format("%.2f", getPerimeter()) + "]";
    }
}
