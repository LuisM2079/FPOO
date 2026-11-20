package pt.ipp.estg.pp.pp_fp09.shapes;

/**
 *
 * @author luism
 */
public class ShapeManagement {

    private static final int INITIAL_CAPACITY = 10;

    private Shape[] shapes;
    private int numberOfShapes;

    public ShapeManagement() {
        this.shapes = new Shape[INITIAL_CAPACITY];
        this.numberOfShapes = 0;
    }

    public boolean addShape(Shape shape) {
        if (shape == null || indexOf(shape) != -1) {
            return false;
        }
        if (numberOfShapes == shapes.length) {
            growArray();
        }
        shapes[numberOfShapes++] = shape;
        return true;
    }

    public boolean removeShape(Shape shape) {
        int pos = indexOf(shape);
        if (pos == -1) {
            return false;
        }
        for (int i = pos; i < numberOfShapes - 1; i++) {
            shapes[i] = shapes[i + 1];
        }
        shapes[--numberOfShapes] = null;
        return true;
    }

    public Shape findShape(Shape shape) {
        int pos = indexOf(shape);
        return pos == -1 ? null : shapes[pos];
    }

    public Shape[] getShapesByType(Class<? extends Shape> type) {
        int count = 0;
        for (int i = 0; i < numberOfShapes; i++) {
            if (shapes[i].getClass() == type) {
                count++;
            }
        }
        Shape[] result = new Shape[count];
        int pos = 0;
        for (int i = 0; i < numberOfShapes; i++) {
            if (shapes[i].getClass() == type) {
                result[pos++] = shapes[i];
            }
        }
        return result;
    }

    public void listShapes() {
        if (numberOfShapes == 0) {
            System.out.println("No shapes");
            return;
        }
        for (int i = 0; i < numberOfShapes; i++) {
            System.out.println(shapes[i]);
        }
    }

    public int getNumberOfShapes() {
        return numberOfShapes;
    }

    private int indexOf(Shape shape) {
        if (shape == null) {
            return -1;
        }
        for (int i = 0; i < numberOfShapes; i++) {
            if (shapes[i].equals(shape)) {
                return i;
            }
        }
        return -1;
    }

    private void growArray() {
        Shape[] bigger = new Shape[shapes.length * 2];
        for (int i = 0; i < numberOfShapes; i++) {
            bigger[i] = shapes[i];
        }
        shapes = bigger;
    }
}
