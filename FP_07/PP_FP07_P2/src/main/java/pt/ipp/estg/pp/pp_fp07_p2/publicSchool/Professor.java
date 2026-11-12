package pt.ipp.estg.pp.pp_fp07_p2.publicSchool;

import java.time.LocalDate;
import pt.ipp.estg.pp.pp_fp07_p2.enumerations.TipoContrato;

/**
 *
 * @author luism
 */

public class Professor extends Pessoa {
    private static final int CAPACIDADE_INICIAL = 5;

    private String sigla;
    private TipoContrato tipoContrato;
    private UnidadeCurricular[] unidadesCurriculares;
    private int numeroUnidades;

    public Professor(String nome, LocalDate dataNascimento, String morada,
                     String numeroCartaoCidadao, String nif,
                     String sigla, TipoContrato tipoContrato) {
        super(nome, dataNascimento, morada, numeroCartaoCidadao, nif);
        this.sigla = sigla;
        this.tipoContrato = tipoContrato;
        this.unidadesCurriculares = new UnidadeCurricular[CAPACIDADE_INICIAL];
        this.numeroUnidades = 0;
    }

    public String getSigla() { return sigla; }
    public void setSigla(String sigla) { this.sigla = sigla; }
    public TipoContrato getTipoContrato() { return tipoContrato; }
    public void setTipoContrato(TipoContrato tipoContrato) { this.tipoContrato = tipoContrato; }
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
        System.out.println("--- Professor ---");
        super.imprimir();
        System.out.println("Sigla: " + sigla);
        System.out.println("Tipo de contrato: " + tipoContrato);
        System.out.println("Unidades curriculares que leciona:");
        listarUnidadesCurriculares();
    }
}
