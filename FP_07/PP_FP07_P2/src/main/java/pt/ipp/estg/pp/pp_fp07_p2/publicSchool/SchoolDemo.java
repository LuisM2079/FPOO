package pt.ipp.estg.pp.pp_fp07_p2.publicSchool;

import java.time.LocalDate;
import pt.ipp.estg.pp.pp_fp07_p2.enumerations.TipoContrato;

/**
 *
 * @author luism
 */

public class SchoolDemo {
    public static void main(String[] args) {

        UnidadeCurricular pp = new UnidadeCurricular("Paradigmas de Programação", "PP", "Engenharia Informática", 1, 2);
        UnidadeCurricular bd = new UnidadeCurricular("Bases de Dados", "BD", "Engenharia Informática", 1, 2);
        UnidadeCurricular so = new UnidadeCurricular("Sistemas Operativos", "SO", "Engenharia Informática", 2, 1);

        Professor p1 = new Professor("Ana Silva", LocalDate.of(1980, 5, 12),
                "Rua das Flores, 10, Felgueiras", "12345678", "234567890",
                "ASI", TipoContrato.INTEGRAL);
        p1.adicionarUnidadeCurricular(pp);
        p1.adicionarUnidadeCurricular(bd);

        Professor p2 = new Professor("Rui Costa", LocalDate.of(1972, 9, 30),
                "Rua do Souto, 7, Porto", "22334455", "345678912",
                "RCO", TipoContrato.PARCIAL);
        p2.adicionarUnidadeCurricular(so);

        Funcionario f1 = new Funcionario("Carlos Pereira", LocalDate.of(1975, 11, 3),
                "Avenida Central, 25, Porto", "87654321", "123456789",
                "F001", TipoContrato.PARCIAL);
        Funcionario f2 = new Funcionario("Marta Lopes", LocalDate.of(1988, 1, 17),
                "Rua Nova, 4, Matosinhos", "33445566", "456789123",
                "F002", TipoContrato.INTEGRAL);

        Aluno a1 = new Aluno("Luís Matos", LocalDate.of(2005, 2, 20),
                "Travessa do Sol, 3, Felgueiras", "11223344", "345678901", "A2024001");
        a1.adicionarUnidadeCurricular(pp);
        a1.adicionarUnidadeCurricular(bd);
        a1.adicionarUnidadeCurricular(so);

        Aluno a2 = new Aluno("Sofia Ramos", LocalDate.of(2004, 8, 9),
                "Rua do Mar, 12, Porto", "55667788", "567891234", "A2024002");
        a2.adicionarUnidadeCurricular(pp);

        System.out.println("===== Imprimir instâncias =====");
        p1.imprimir();
        System.out.println();
        f1.imprimir();
        System.out.println();
        a1.imprimir();
        System.out.println();

        SchoolManagement escola = new SchoolManagement();
        escola.adicionarPessoa(p1);
        escola.adicionarPessoa(p2);
        escola.adicionarPessoa(f1);
        escola.adicionarPessoa(f2);
        escola.adicionarPessoa(a1);
        escola.adicionarPessoa(a2);
        System.out.println("Pessoa repetida adicionada? " + escola.adicionarPessoa(a1)); // false
        System.out.println("Total de pessoas: " + escola.getNumeroPessoas());

        System.out.println("\n===== Professores =====");
        escola.listarProfessores();
        System.out.println("===== Alunos =====");
        escola.listarAlunos();
        System.out.println("===== Funcionários =====");
        escola.listarFuncionarios();

        System.out.println("Remover Marta Lopes: " + escola.removerPessoa("456789123"));
        System.out.println("Total de pessoas: " + escola.getNumeroPessoas());
    }
}
