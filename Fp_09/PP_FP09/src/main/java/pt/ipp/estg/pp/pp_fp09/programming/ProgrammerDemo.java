package pt.ipp.estg.pp.pp_fp09.programming;

import java.time.LocalDate;
import pt.ipp.estg.pp.pp_fp09.enums.ContractType;
import pt.ipp.estg.pp.pp_fp09.enums.ProgrammerType;
import pt.ipp.estg.pp.pp_fp09.enums.Qualification;

/**
 *
 * @author luism
 */
public class ProgrammerDemo {

    public static void main(String[] args) {
        Administrative admin1 = new Administrative("Ana Silva",
                LocalDate.of(1990, 3, 12), "Rua A, Felgueiras", "12345678",
                "234567890", 1200, "AS", ContractType.INTEGRAL,
                Qualification.MASTER, LocalDate.of(2018, 9, 1), null);

        Administrative admin2 = new Administrative("Rui Costa",
                LocalDate.of(1995, 7, 25), "Rua B, Porto", "23456789",
                "345678901", 1200, "RC", ContractType.PARTIAL,
                Qualification.BACHELOR, LocalDate.of(2024, 1, 1),
                LocalDate.of(2026, 12, 31));

        JavaProgrammer prog1 = new JavaProgrammer("Marta Lopes",
                LocalDate.of(1988, 1, 5), "Rua C, Braga", "34567890",
                "456789012", 1500, "P001", 10, "Project Alpha",
                ProgrammerType.SENIOR);

        JavaProgrammer prog2 = new JavaProgrammer("Tiago Pinto",
                LocalDate.of(2000, 11, 30), "Rua D, Lousada", "45678901",
                "567890123", 1500, "P002", 2, "Project Beta",
                ProgrammerType.JUNIOR);

        ProjectManager manager = new ProjectManager("Carla Matos",
                LocalDate.of(1982, 6, 18), "Rua E, Porto", "56789012",
                "678901234", 2000, "M001", LocalDate.of(2015, 5, 10));
        manager.addProject("Project Alpha");
        manager.addProject("Project Beta");
        manager.addProject("Project Gamma");

        System.out.println("===== Exercise 1 =====");
        admin1.print();
        System.out.println();
        admin2.print();
        System.out.println();
        prog1.print();
        System.out.println();
        prog2.print();
        System.out.println();
        manager.print();
        System.out.println();

        manager.editProject("Project Gamma", "Project Delta");
        manager.removeProject("Project Beta");
        System.out.println("Projects after edit/remove:");
        manager.listProjects();
        System.out.println();

        System.out.println("===== Exercise 2 =====");
        ProgrammingManagement management = new ProgrammingManagement();
        management.addPerson(admin1);
        management.addPerson(admin2);
        management.addPerson(prog1);
        management.addPerson(prog2);
        management.addPerson(manager);
        System.out.println("Added duplicate? " + management.addPerson(prog1));
        System.out.println("People: " + management.getNumberOfPeople());
        System.out.println();

        System.out.println("--- All people ---");
        management.listPeople();

        System.out.println("--- Only project managers ---");
        management.listProjectManagers();

        management.removePerson(admin2);
        System.out.println("After removing " + admin2.getName() + ": "
                + management.getNumberOfPeople() + " people");
    }
}
