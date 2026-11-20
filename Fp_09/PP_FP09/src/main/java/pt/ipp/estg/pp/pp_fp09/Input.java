package pt.ipp.estg.pp.pp_fp09;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 *
 * @author luism
 */
public final class Input {

    private static final Scanner SCANNER = new Scanner(System.in);

    private Input() {
    }

    public static String readString(String prompt) {
        System.out.print(prompt);
        return SCANNER.nextLine().trim();
    }

    public static int readInt(String prompt) {
        while (true) {
            try {
                return Integer.parseInt(readString(prompt));
            } catch (NumberFormatException e) {
                System.out.println("Invalid number, try again.");
            }
        }
    }

    public static double readDouble(String prompt) {
        while (true) {
            try {
                return Double.parseDouble(readString(prompt).replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.println("Invalid number, try again.");
            }
        }
    }

    public static boolean readBoolean(String prompt) {
        while (true) {
            String answer = readString(prompt + " (s/n): ").toLowerCase();
            switch (answer) {
                case "s":
                    return true;
                case "n":
                    return false;
                default:
                    System.out.println("Answer s or n.");
            }
        }
    }

    public static LocalDate readDate(String prompt, boolean optional) {
        while (true) {
            String text = readString(prompt + " (yyyy-MM-dd"
                    + (optional ? ", empty for none" : "") + "): ");
            if (optional && text.isEmpty()) {
                return null;
            }
            try {
                return LocalDate.parse(text);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date, try again.");
            }
        }
    }

    public static <T extends Enum<T>> T readEnum(String prompt, T[] values) {
        System.out.println(prompt);
        for (int i = 0; i < values.length; i++) {
            System.out.println("  " + (i + 1) + " - " + values[i]);
        }
        while (true) {
            int choice = readInt("Choice: ");
            if (choice >= 1 && choice <= values.length) {
                return values[choice - 1];
            }
            System.out.println("Invalid choice.");
        }
    }
}
