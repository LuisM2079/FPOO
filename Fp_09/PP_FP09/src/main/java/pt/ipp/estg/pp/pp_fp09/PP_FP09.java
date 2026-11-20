package pt.ipp.estg.pp.pp_fp09;

import pt.ipp.estg.pp.pp_fp09.programming.ProgrammingMenu;
import pt.ipp.estg.pp.pp_fp09.shapes.ShapeMenu;

/**
 *
 * @author luism
 */
public class PP_FP09 {

    public static void main(String[] args) {
        int option;
        do {
            System.out.println();
            System.out.println("===== FP09 =====");
            System.out.println("1 - Programming management");
            System.out.println("2 - Shapes");
            System.out.println("0 - Exit");
            option = Input.readInt("Option: ");
            switch (option) {
                case 1:
                    ProgrammingMenu.run();
                    break;
                case 2:
                    ShapeMenu.run();
                    break;
                case 0:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (option != 0);
    }
}
