package pt.ipp.estg.pp.pp_fp09.shapes;

/**
 *
 * @author luism
 */
public class ShapeDemo {

    public static void main(String[] args) {
        Circle circle1 = new Circle(true);
        Circle circle2 = new Circle(false, 2.5, "blue");
        Square square1 = new Square(true, "green", 3);
        Square square2 = new Square(false, 4);
        Rectangle rectangle1 = new Rectangle(true, "yellow", 2);
        rectangle1.setHeight(5);
        Rectangle rectangle2 = new Rectangle(false);

        System.out.println("===== Shapes =====");
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(square1);
        System.out.println(square2);
        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println();

        System.out.println("===== ShapeManagement =====");
        ShapeManagement management = new ShapeManagement();
        management.addShape(circle1);
        management.addShape(circle2);
        management.addShape(square1);
        management.addShape(square2);
        management.addShape(rectangle1);
        management.addShape(rectangle2);

        System.out.println("Add equal circle: "
                + management.addShape(new Circle(false, 2.5, "blue")));
        System.out.println("Add equal rectangle: "
                + management.addShape(rectangle2));
        System.out.println("Number of shapes: "
                + management.getNumberOfShapes());
        System.out.println();

        System.out.println("Find blue circle: "
                + management.findShape(new Circle(false, 2.5, "blue")));
        System.out.println("Find red circle r=9: "
                + management.findShape(new Circle(true, 9.0)));
        System.out.println();

        System.out.println("--- Rectangles only ---");
        Shape[] rectangles = management.getShapesByType(Rectangle.class);
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println(rectangles[i]);
        }
        System.out.println("--- Squares only (rectangles excluded) ---");
        Shape[] squares = management.getShapesByType(Square.class);
        for (int i = 0; i < squares.length; i++) {
            System.out.println(squares[i]);
        }
        System.out.println();

        System.out.println("Remove square2: "
                + management.removeShape(square2));
        System.out.println("Remove square2 again: "
                + management.removeShape(square2));
        System.out.println("--- After removal ---");
        management.listShapes();
    }
}
