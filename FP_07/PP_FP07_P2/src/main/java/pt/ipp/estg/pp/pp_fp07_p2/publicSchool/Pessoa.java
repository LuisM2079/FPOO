package pt.ipp.estg.pp.pp_fp07_p2.publicSchool;

import java.time.LocalDate;

/**
 *
 * @author luism
 */

public abstract class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private String morada;
    private String numeroCartaoCidadao;
    private String nif;

    public Pessoa(String nome, LocalDate dataNascimento, String morada,
                  String numeroCartaoCidadao, String nif) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.morada = morada;
        this.numeroCartaoCidadao = numeroCartaoCidadao;
        this.nif = nif;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public LocalDate getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(LocalDate dataNascimento) { this.dataNascimento = dataNascimento; }
    public String getMorada() { return morada; }
    public void setMorada(String morada) { this.morada = morada; }
    public String getNumeroCartaoCidadao() { return numeroCartaoCidadao; }
    public void setNumeroCartaoCidadao(String numeroCartaoCidadao) { this.numeroCartaoCidadao = numeroCartaoCidadao; }
    public String getNif() { return nif; }
    public void setNif(String nif) { this.nif = nif; }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Morada: " + morada);
        System.out.println("Cartão de cidadão: " + numeroCartaoCidadao);
        System.out.println("NIF: " + nif);
    }
}
