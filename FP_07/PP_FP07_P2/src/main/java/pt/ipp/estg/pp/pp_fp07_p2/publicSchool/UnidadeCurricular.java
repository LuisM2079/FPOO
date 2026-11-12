package pt.ipp.estg.pp.pp_fp07_p2.publicSchool;

/**
 *
 * @author luism
 */

public class UnidadeCurricular {
    private String nome;
    private String sigla;
    private String nomeCurso;
    private int anoLetivo;  
    private int semestre;   

    public UnidadeCurricular(String nome, String sigla, String nomeCurso, int anoLetivo, int semestre) {
        this.nome = nome;
        this.sigla = sigla;
        this.nomeCurso = nomeCurso;
        this.anoLetivo = anoLetivo;
        this.semestre = semestre;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getSigla() { return sigla; }
    public void setSigla(String sigla) { this.sigla = sigla; }
    public String getNomeCurso() { return nomeCurso; }
    public void setNomeCurso(String nomeCurso) { this.nomeCurso = nomeCurso; }
    public int getAnoLetivo() { return anoLetivo; }
    public void setAnoLetivo(int anoLetivo) { this.anoLetivo = anoLetivo; }
    public int getSemestre() { return semestre; }
    public void setSemestre(int semestre) { this.semestre = semestre; }

    // Imprime os valores da unidade curricular
    public void imprimir() {
        System.out.println(sigla + " - " + nome + " (" + nomeCurso + ", "
                + anoLetivo + "º ano, " + semestre + "º semestre)");
    }
}
