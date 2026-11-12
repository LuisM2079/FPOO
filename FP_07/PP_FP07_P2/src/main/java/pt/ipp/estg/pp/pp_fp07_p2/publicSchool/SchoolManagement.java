package pt.ipp.estg.pp.pp_fp07_p2.publicSchool;

/**
 *
 * @author luism
 */

public class SchoolManagement {
    
    private static final int CAPACIDADE_INICIAL = 10;

    private Pessoa[] pessoas;
    private int numeroPessoas; 

    public SchoolManagement() {
        this.pessoas = new Pessoa[CAPACIDADE_INICIAL];
        this.numeroPessoas = 0;
    }

    public int getNumeroPessoas() { return numeroPessoas; }

    private void aumentarArray() {
        Pessoa[] maior = new Pessoa[pessoas.length * 2];
        for (int i = 0; i < numeroPessoas; i++) {
            maior[i] = pessoas[i];
        }
        pessoas = maior;
    }

    private int procurarPessoa(String nif) {
        for (int i = 0; i < numeroPessoas; i++) {
            if (pessoas[i].getNif().equals(nif)) {
                return i;
            }
        }
        return -1;
    }

    public boolean adicionarPessoa(Pessoa pessoa) {
        if (pessoa == null || procurarPessoa(pessoa.getNif()) != -1) {
            return false;
        }
        if (numeroPessoas == pessoas.length) {
            aumentarArray();
        }
        pessoas[numeroPessoas] = pessoa;
        numeroPessoas++;
        return true;
    }

    public boolean removerPessoa(String nif) {
        int indice = procurarPessoa(nif);
        if (indice == -1) {
            return false;
        }
        for (int i = indice; i < numeroPessoas - 1; i++) {
            pessoas[i] = pessoas[i + 1];
        }
        pessoas[numeroPessoas - 1] = null;
        numeroPessoas--;
        return true;
    }

    public void listarPessoas() {
        for (int i = 0; i < numeroPessoas; i++) {
            pessoas[i].imprimir();
            System.out.println();
        }
    }

    public void listarProfessores() {
        for (int i = 0; i < numeroPessoas; i++) {
            if (pessoas[i] instanceof Professor) {
                pessoas[i].imprimir();
                System.out.println();
            }
        }
    }

    public void listarAlunos() {
        for (int i = 0; i < numeroPessoas; i++) {
            if (pessoas[i] instanceof Aluno) {
                pessoas[i].imprimir();
                System.out.println();
            }
        }
    }

    public void listarFuncionarios() {
        for (int i = 0; i < numeroPessoas; i++) {
            if (pessoas[i] instanceof Funcionario) {
                pessoas[i].imprimir();
                System.out.println();
            }
        }
    }
}
