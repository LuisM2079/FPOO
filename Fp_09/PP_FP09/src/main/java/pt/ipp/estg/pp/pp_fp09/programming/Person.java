package pt.ipp.estg.pp.pp_fp09.programming;

import java.time.LocalDate;

/**
 *
 * @author luism
 */
public abstract class Person {

    private String name;
    private LocalDate birthDate;
    private String address;
    private String citizenCard;
    private String vatNumber;
    private double baseSalary;

    public Person(String name, LocalDate birthDate, String address,
            String citizenCard, String vatNumber, double baseSalary) {
        this.name = name;
        this.birthDate = birthDate;
        this.address = address;
        this.citizenCard = citizenCard;
        this.vatNumber = vatNumber;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCitizenCard() {
        return citizenCard;
    }

    public void setCitizenCard(String citizenCard) {
        this.citizenCard = citizenCard;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Birth date: " + birthDate);
        System.out.println("Address: " + address);
        System.out.println("Citizen card: " + citizenCard);
        System.out.println("VAT number: " + vatNumber);
        System.out.println("Base salary: " + baseSalary);
        System.out.println("Final salary: " + calculateSalary());
    }
}
