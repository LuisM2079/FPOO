package pt.ipp.estg.pp.pp_fp09.programming;

import java.time.LocalDate;
import pt.ipp.estg.pp.pp_fp09.Input;
import pt.ipp.estg.pp.pp_fp09.enums.ContractType;
import pt.ipp.estg.pp.pp_fp09.enums.ProgrammerType;
import pt.ipp.estg.pp.pp_fp09.enums.Qualification;

/**
 *
 * @author luism
 */
public class ProgrammingMenu {

    public static void run() {
        ProgrammingManagement management = new ProgrammingManagement();
        int option;
        do {
            System.out.println();
            System.out.println("===== Programming Management =====");
            System.out.println("1 - Add administrative");
            System.out.println("2 - Add Java programmer");
            System.out.println("3 - Add project manager");
            System.out.println("4 - Remove collaborator");
            System.out.println("5 - List all collaborators");
            System.out.println("6 - List project managers");
            System.out.println("7 - Manage projects of a manager");
            System.out.println("0 - Back");
            option = Input.readInt("Option: ");
            switch (option) {
                case 1:
                    addAdministrative(management);
                    break;
                case 2:
                    addProgrammer(management);
                    break;
                case 3:
                    addManager(management);
                    break;
                case 4:
                    removePerson(management);
                    break;
                case 5:
                    management.listPeople();
                    break;
                case 6:
                    management.listProjectManagers();
                    break;
                case 7:
                    manageProjects(management);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (option != 0);
    }

    private static void addAdministrative(ProgrammingManagement management) {
        String name = Input.readString("Name: ");
        LocalDate birthDate = Input.readDate("Birth date", false);
        String address = Input.readString("Address: ");
        String citizenCard = Input.readString("Citizen card: ");
        String vatNumber = Input.readString("VAT number: ");
        double baseSalary = Input.readDouble("Base salary: ");
        String initials = Input.readString("Initials: ");
        ContractType type = Input.readEnum("Contract type:",
                ContractType.values());
        Qualification qualification = Input.readEnum("Qualification:",
                Qualification.values());
        LocalDate begin = Input.readDate("Begin contract", false);
        LocalDate end;
        if (type == ContractType.PARTIAL) {
            end = Input.readDate("End contract", false);
        } else {
            end = Input.readDate("End contract", true);
        }
        Administrative admin = new Administrative(name, birthDate, address,
                citizenCard, vatNumber, baseSalary, initials, type,
                qualification, begin, end);
        report(management.addPerson(admin));
    }

    private static void addProgrammer(ProgrammingManagement management) {
        String name = Input.readString("Name: ");
        LocalDate birthDate = Input.readDate("Birth date", false);
        String address = Input.readString("Address: ");
        String citizenCard = Input.readString("Citizen card: ");
        String vatNumber = Input.readString("VAT number: ");
        double baseSalary = Input.readDouble("Base salary: ");
        String code = Input.readString("Employee code: ");
        int years = Input.readInt("Years of Java programming: ");
        String project = Input.readString("Project name: ");
        ProgrammerType type = Input.readEnum("Programmer type:",
                ProgrammerType.values());
        JavaProgrammer programmer = new JavaProgrammer(name, birthDate,
                address, citizenCard, vatNumber, baseSalary, code, years,
                project, type);
        report(management.addPerson(programmer));
    }

    private static void addManager(ProgrammingManagement management) {
        String name = Input.readString("Name: ");
        LocalDate birthDate = Input.readDate("Birth date", false);
        String address = Input.readString("Address: ");
        String citizenCard = Input.readString("Citizen card: ");
        String vatNumber = Input.readString("VAT number: ");
        double baseSalary = Input.readDouble("Base salary: ");
        String code = Input.readString("Employee code: ");
        LocalDate contractDate = Input.readDate("Contract date", false);
        ProjectManager manager = new ProjectManager(name, birthDate, address,
                citizenCard, vatNumber, baseSalary, code, contractDate);
        report(management.addPerson(manager));
    }

    private static void removePerson(ProgrammingManagement management) {
        String citizenCard = Input.readString("Citizen card to remove: ");
        Person person = management.findPerson(citizenCard);
        if (person == null) {
            System.out.println("Collaborator not found.");
        } else {
            management.removePerson(person);
            System.out.println(person.getName() + " removed.");
        }
    }

    private static void manageProjects(ProgrammingManagement management) {
        String citizenCard = Input.readString("Manager's citizen card: ");
        Person person = management.findPerson(citizenCard);
        if (!(person instanceof ProjectManager)) {
            System.out.println("Project manager not found.");
            return;
        }
        ProjectManager manager = (ProjectManager) person;
        int option;
        do {
            System.out.println();
            System.out.println("--- Projects of " + manager.getName() + " ---");
            System.out.println("1 - Add project");
            System.out.println("2 - Remove project");
            System.out.println("3 - Edit project");
            System.out.println("4 - List projects");
            System.out.println("0 - Back");
            option = Input.readInt("Option: ");
            switch (option) {
                case 1:
                    report(manager.addProject(
                            Input.readString("Project name: ")));
                    break;
                case 2:
                    report(manager.removeProject(
                            Input.readString("Project name: ")));
                    break;
                case 3:
                    String oldName = Input.readString("Current name: ");
                    String newName = Input.readString("New name: ");
                    report(manager.editProject(oldName, newName));
                    break;
                case 4:
                    manager.listProjects();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (option != 0);
    }

    private static void report(boolean success) {
        System.out.println(success ? "Done." : "Operation failed "
                + "(duplicate or not found).");
    }
}
