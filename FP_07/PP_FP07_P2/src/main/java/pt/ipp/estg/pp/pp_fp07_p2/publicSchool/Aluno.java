package pt.ipp.estg.pp.pp_fp07_p2.publicSchool;

import java.time.LocalDate;

/**
 *
 * @author luism
 */

public class Aluno extends Pessoa {
    private static final int CAPACIDADE_INICIAL = 5;

    private String codigoAluno;
    private UnidadeCurricular[] unidadesCurriculares;
    private int numeroUnidades;

    public Aluno(String nome, LocalDate dataNascimento, String morada,
                 String numeroCartaoCidadao, String nif, String codigoAluno) {
        super(nome, dataNascimento, morada, numeroCartaoCidadao, nif);
        this.codigoAluno = codigoAluno;
        this.unidadesCurriculares = new UnidadeCurricular[CAPACIDADE_INICIAL];
        this.numeroUnidades = 0;
    }

    public String getCodigoAluno() { return codigoAluno; }
    public void setCodigoAluno(String codigoAluno) { this.codigoAluno = codigoAluno; }
    public int getNumeroUnidades() { return numeroUnidades; }

    private int procurarUnidadeCurricular(String sigla) {
        for (int i = 0; i < numeroUnidades; i++) {
            if (unidadesCurriculares[i].getSigla().equals(sigla)) {
                return i;
            }
        }
        return -1;
    }

    private void aumentarArray() {
        UnidadeCurricular[] maior = new UnidadeCurricular[unidadesCurriculares.length * 2];
        for (int i = 0; i < numeroUnidades; i++) {
            maior[i] = unidadesCurriculares[i];
        }
        unidadesCurriculares = maior;
    }

    public boolean adicionarUnidadeCurricular(UnidadeCurricular uc) {
        if (uc == null || procurarUnidadeCurricular(uc.getSigla()) != -1) {
            return false;
        }
        if (numeroUnidades == unidadesCurriculares.length) {
            aumentarArray();
        }
        unidadesCurriculares[numeroUnidades] = uc;
        numeroUnidades++;
        return true;
    }

    public boolean removerUnidadeCurricular(String sigla) {
        int indice = procurarUnidadeCurricular(sigla);
        if (indice == -1) {
            return false;
        }
        for (int i = indice; i < numeroUnidades - 1; i++) {
            unidadesCurriculares[i] = unidadesCurriculares[i + 1];
        }
        unidadesCurriculares[numeroUnidades - 1] = null;
        numeroUnidades--;
        return true;
    }

    public boolean editarUnidadeCurricular(String siglaAntiga, UnidadeCurricular nova) {
        int indice = procurarUnidadeCurricular(siglaAntiga);
        if (indice == -1 || nova == null) {
            return false;
        }
        if (!siglaAntiga.equals(nova.getSigla()) && procurarUnidadeCurricular(nova.getSigla()) != -1) {
            return false;
        }
        unidadesCurriculares[indice] = nova;
        return true;
    }

    public void listarUnidadesCurriculares() {
        for (int i = 0; i < numeroUnidades; i++) {
            System.out.print("  - ");
            unidadesCurriculares[i].imprimir();
        }
    }

    @Override
    public void imprimir() {
        System.out.println("--- Aluno ---");
        super.imprimir();
        System.out.println("Código de aluno: " + codigoAluno);
        System.out.println("Unidades curriculares que frequenta:");
        listarUnidadesCurriculares();
    }
}
