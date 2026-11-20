package pt.ipp.estg.pp.pp_fp09.shapes;

import java.util.Objects;

/**
 *
 * @author luism
 */
public abstract class Shape {

    protected String color = "red";
    protected boolean filled;

    public Shape(boolean filled, String color) {
        this.filled = filled;
        this.color = color;
    }

    public Shape(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Shape other = (Shape) obj;
        return filled == other.filled && Objects.equals(color, other.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClass(), color, filled);
    }

    @Override
    public String toString() {
        return "color=" + color + ", filled=" + filled;
    }
}
