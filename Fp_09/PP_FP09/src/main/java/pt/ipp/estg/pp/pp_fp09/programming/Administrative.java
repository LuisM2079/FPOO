package pt.ipp.estg.pp.pp_fp09.programming;

import java.time.LocalDate;
import pt.ipp.estg.pp.pp_fp09.enums.ContractType;
import pt.ipp.estg.pp.pp_fp09.enums.Qualification;

/**
 *
 * @author luism
 */
public class Administrative extends Person {

    private String initials;
    private ContractType contractType;
    private Qualification qualification;
    private LocalDate beginContract;
    private LocalDate endContract;

    public Administrative(String name, LocalDate birthDate, String address,
            String citizenCard, String vatNumber, double baseSalary,
            String initials, ContractType contractType,
            Qualification qualification, LocalDate beginContract,
            LocalDate endContract) {
        super(name, birthDate, address, citizenCard, vatNumber, baseSalary);
        checkEndContract(contractType, endContract);
        this.initials = initials;
        this.contractType = contractType;
        this.qualification = qualification;
        this.beginContract = beginContract;
        this.endContract = endContract;
    }

    private static void checkEndContract(ContractType type, LocalDate end) {
        if (type == ContractType.PARTIAL && end == null) {
            throw new IllegalArgumentException(
                    "A partial contract must have an end date");
        }
    }

    @Override
    public double calculateSalary() {
        double initial = getBaseSalary() * contractType.getPercentage();
        return initial * (1 + qualification.getBonus());
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        checkEndContract(contractType, endContract);
        this.contractType = contractType;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    public LocalDate getBeginContract() {
        return beginContract;
    }

    public void setBeginContract(LocalDate beginContract) {
        this.beginContract = beginContract;
    }

    public LocalDate getEndContract() {
        return endContract;
    }

    public void setEndContract(LocalDate endContract) {
        checkEndContract(contractType, endContract);
        this.endContract = endContract;
    }

    @Override
    public void print() {
        System.out.println("--- Administrative ---");
        super.print();
        System.out.println("Initials: " + initials);
        System.out.println("Contract type: " + contractType);
        System.out.println("Qualification: " + qualification);
        System.out.println("Begin contract: " + beginContract);
        System.out.println("End contract: "
                + (endContract == null ? "no end date" : endContract));
    }
}
