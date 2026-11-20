package pt.ipp.estg.pp.pp_fp09.programming;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author luism
 */
public class ProjectManager extends Person {

    private static final int INITIAL_CAPACITY = 5;

    private String code;
    private String[] projects;
    private int numberOfProjects;
    private LocalDate contractDate;

    public ProjectManager(String name, LocalDate birthDate, String address,
            String citizenCard, String vatNumber, double baseSalary,
            String code, LocalDate contractDate) {
        super(name, birthDate, address, citizenCard, vatNumber, baseSalary);
        this.code = code;
        this.contractDate = contractDate;
        this.projects = new String[INITIAL_CAPACITY];
        this.numberOfProjects = 0;
    }

    @Override
    public double calculateSalary() {
        double initial = getBaseSalary() * 1.15;
        int years = Period.between(contractDate, LocalDate.now()).getYears();
        double bonus = 0.015 * years + 0.01 * numberOfProjects;
        return initial * (1 + bonus);
    }

    public boolean addProject(String project) {
        if (findProject(project) != -1) {
            return false;
        }
        if (numberOfProjects == projects.length) {
            growArray();
        }
        projects[numberOfProjects++] = project;
        return true;
    }

    public boolean removeProject(String project) {
        int pos = findProject(project);
        if (pos == -1) {
            return false;
        }
        for (int i = pos; i < numberOfProjects - 1; i++) {
            projects[i] = projects[i + 1];
        }
        projects[--numberOfProjects] = null;
        return true;
    }

    public boolean editProject(String oldName, String newName) {
        int pos = findProject(oldName);
        if (pos == -1 || findProject(newName) != -1) {
            return false;
        }
        projects[pos] = newName;
        return true;
    }

    public void listProjects() {
        if (numberOfProjects == 0) {
            System.out.println("No projects");
            return;
        }
        for (int i = 0; i < numberOfProjects; i++) {
            System.out.println("  - " + projects[i]);
        }
    }

    public int getNumberOfProjects() {
        return numberOfProjects;
    }

    private int findProject(String project) {
        for (int i = 0; i < numberOfProjects; i++) {
            if (projects[i].equals(project)) {
                return i;
            }
        }
        return -1;
    }

    private void growArray() {
        String[] bigger = new String[projects.length * 2];
        for (int i = 0; i < numberOfProjects; i++) {
            bigger[i] = projects[i];
        }
        projects = bigger;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDate getContractDate() {
        return contractDate;
    }

    public void setContractDate(LocalDate contractDate) {
        this.contractDate = contractDate;
    }

    @Override
    public void print() {
        System.out.println("--- Project Manager ---");
        super.print();
        System.out.println("Code: " + code);
        System.out.println("Contract date: " + contractDate);
        System.out.println("Projects (" + numberOfProjects + "):");
        listProjects();
    }
}
