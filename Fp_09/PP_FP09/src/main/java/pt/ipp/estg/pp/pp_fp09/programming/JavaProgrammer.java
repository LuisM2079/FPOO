package pt.ipp.estg.pp.pp_fp09.programming;

import java.time.LocalDate;
import pt.ipp.estg.pp.pp_fp09.enums.ProgrammerType;

/**
 *
 * @author luism
 */
public class JavaProgrammer extends Person {

    private String code;
    private int programmingYears;
    private String projectName;
    private ProgrammerType programmerType;

    public JavaProgrammer(String name, LocalDate birthDate, String address,
            String citizenCard, String vatNumber, double baseSalary,
            String code, int programmingYears, String projectName,
            ProgrammerType programmerType) {
        super(name, birthDate, address, citizenCard, vatNumber, baseSalary);
        this.code = code;
        this.programmingYears = programmingYears;
        this.projectName = projectName;
        this.programmerType = programmerType;
    }

    @Override
    public double calculateSalary() {
        double initial = getBaseSalary() * 1.05;
        double bonus = programmerType.getBonus() + 0.005 * programmingYears;
        return initial * (1 + bonus);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getProgrammingYears() {
        return programmingYears;
    }

    public void setProgrammingYears(int programmingYears) {
        this.programmingYears = programmingYears;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public ProgrammerType getProgrammerType() {
        return programmerType;
    }

    public void setProgrammerType(ProgrammerType programmerType) {
        this.programmerType = programmerType;
    }

    @Override
    public void print() {
        System.out.println("--- Java Programmer ---");
        super.print();
        System.out.println("Code: " + code);
        System.out.println("Programming years: " + programmingYears);
        System.out.println("Project: " + projectName);
        System.out.println("Programmer type: " + programmerType);
    }
}
