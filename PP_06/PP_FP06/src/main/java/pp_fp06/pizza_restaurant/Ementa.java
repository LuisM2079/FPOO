/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp_fp06.pizza_restaurant;

/**
 *
 * @author luism
 */
public class Ementa {
    private int codigo;
    private String nome;
    private String descricao;
    private Pizza[] pizzas;
    private boolean ativo;
    private int numPizzas;
    private static final int MAX_PIZZAS = 10;
 
    
    public Ementa(int codigo, String nome, String descricao, boolean ativo) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.ativo = ativo;
        this.pizzas = new Pizza[MAX_PIZZAS];
        this.numPizzas = 0;
    }
 
    
    public boolean adicionarPizza(Pizza pizza) {
        if (pizza == null) {
            return false;
        }
        if (this.numPizzas < MAX_PIZZAS) {
            this.pizzas[this.numPizzas++] = pizza;
            return true;
        }
        System.out.println("Ementa cheia - não é possível adicionar mais pizzas!");
        return false;
    }
 
    
    public String getDescricaoDetalhada() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== ").append(this.nome.toUpperCase()).append(" ===\n")
          .append("Código: ").append(this.codigo).append("\n")
          .append("Descrição: ").append(this.descricao).append("\n")
          .append("Estado: ").append(this.ativo ? "Ativa" : "Inativa").append("\n");
        for (int i = 0; i < this.numPizzas; i++) {
            sb.append("\n").append(this.pizzas[i].getDescricaoDetalhada()).append("\n");
        }
        return sb.toString();
    }
 
    public int getNumPizzas() { return this.numPizzas; }
 
    public int getCodigo() { return this.codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }
 
    public String getNome() { return this.nome; }
    public void setNome(String nome) { this.nome = nome; }
 
    public String getDescricao() { return this.descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
 
    public boolean isAtivo() { return this.ativo; }
    public void setAtivo(boolean ativo) { this.ativo = ativo; }
 
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ementa {")
          .append("Código=").append(this.codigo)
          .append(", Nome='").append(this.nome).append('\'')
          .append(", Descrição='").append(this.descricao).append('\'')
          .append(", Ativo=").append(this.ativo)
          .append(", Pizzas=[");
        for (int i = 0; i < this.numPizzas; i++) {
            sb.append(this.pizzas[i].getNome());
            if (i < this.numPizzas - 1) sb.append(", ");
        }
        sb.append("]}");
        return sb.toString();
    }
}
