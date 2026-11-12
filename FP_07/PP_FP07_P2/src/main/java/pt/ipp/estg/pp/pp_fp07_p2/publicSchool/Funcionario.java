package pt.ipp.estg.pp.pp_fp07_p2.publicSchool;

import java.time.LocalDate;
import pt.ipp.estg.pp.pp_fp07_p2.enumerations.TipoContrato;

/**
 *
 * @author luism
 */

public class Funcionario extends Pessoa {
    private String codigoFuncionario;
    private TipoContrato tipoContrato;

    public Funcionario(String nome, LocalDate dataNascimento, String morada,
                       String numeroCartaoCidadao, String nif,
                       String codigoFuncionario, TipoContrato tipoContrato) {
        super(nome, dataNascimento, morada, numeroCartaoCidadao, nif);
        this.codigoFuncionario = codigoFuncionario;
        this.tipoContrato = tipoContrato;
    }

    public String getCodigoFuncionario() { return codigoFuncionario; }
    public void setCodigoFuncionario(String codigoFuncionario) { this.codigoFuncionario = codigoFuncionario; }
    public TipoContrato getTipoContrato() { return tipoContrato; }
    public void setTipoContrato(TipoContrato tipoContrato) { this.tipoContrato = tipoContrato; }

    @Override
    public void imprimir() {
        System.out.println("--- Funcionário ---");
        super.imprimir();
        System.out.println("Código de funcionário: " + codigoFuncionario);
        System.out.println("Tipo de contrato: " + tipoContrato);
    }
}
