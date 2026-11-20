package pt.ipp.estg.pp.pp_fp09.shapes;

import pt.ipp.estg.pp.pp_fp09.Input;

/**
 *
 * @author luism
 */
public class ShapeMenu {

    public static void run() {
        ShapeManagement management = new ShapeManagement();
        int option;
        do {
            System.out.println();
            System.out.println("===== Shape Management =====");
            System.out.println("1 - Add shape");
            System.out.println("2 - Remove shape");
            System.out.println("3 - Find shape");
            System.out.println("4 - List all shapes");
            System.out.println("5 - List shapes of a type");
            System.out.println("0 - Back");
            option = Input.readInt("Option: ");
            switch (option) {
                case 1:
                    Shape toAdd = readShape();
                    if (toAdd != null) {
                        System.out.println(management.addShape(toAdd)
                                ? "Shape added."
                                : "That shape already exists.");
                    }
                    break;
                case 2:
                    Shape toRemove = readShape();
                    if (toRemove != null) {
                        System.out.println(management.removeShape(toRemove)
                                ? "Shape removed." : "Shape not found.");
                    }
                    break;
                case 3:
                    Shape toFind = readShape();
                    if (toFind != null) {
                        Shape found = management.findShape(toFind);
                        System.out.println(found == null
                                ? "Shape not found." : found);
                    }
                    break;
                case 4:
                    management.listShapes();
                    break;
                case 5:
                    listByType(management);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (option != 0);
    }

    private static Shape readShape() {
        System.out.println("1 - Circle");
        System.out.println("2 - Square");
        System.out.println("3 - Rectangle");
        int type = Input.readInt("Type: ");
        if (type < 1 || type > 3) {
            System.out.println("Invalid type.");
            return null;
        }
        boolean filled = Input.readBoolean("Filled?");
        String color = Input.readString("Color (empty for red): ");
        if (color.isEmpty()) {
            color = "red";
        }
        switch (type) {
            case 1: {
                double radius = Input.readDouble("Radius: ");
                return new Circle(filled, radius, color);
            }
            case 2: {
                double width = Input.readDouble("Width: ");
                return new Square(filled, color, width);
            }
            default: {
                double width = Input.readDouble("Width: ");
                double height = Input.readDouble("Height: ");
                Rectangle rectangle = new Rectangle(filled, color, width);
                rectangle.setHeight(height);
                return rectangle;
            }
        }
    }

    private static void listByType(ShapeManagement management) {
        System.out.println("1 - Circle");
        System.out.println("2 - Square");
        System.out.println("3 - Rectangle");
        int type = Input.readInt("Type: ");
        Class<? extends Shape> shapeClass;
        switch (type) {
            case 1:
                shapeClass = Circle.class;
                break;
            case 2:
                shapeClass = Square.class;
                break;
            case 3:
                shapeClass = Rectangle.class;
                break;
            default:
                System.out.println("Invalid type.");
                return;
        }
        Shape[] result = management.getShapesByType(shapeClass);
        if (result.length == 0) {
            System.out.println("No shapes of that type.");
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
