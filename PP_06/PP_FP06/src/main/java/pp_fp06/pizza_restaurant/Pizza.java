/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp_fp06.pizza_restaurant;
import pp_fp06.pizza_restaurant.enums.Tamanho;
/**
 *
 * @author luism
 */
public class Pizza {
    private int codigo;
    private String nome;
    private String descricao;
    private double preco;
    private Tamanho tamanho;
    private Ingrediente[] ingredientes;
    private int numIngredientes;
 
    private static final int MAX_INGREDIENTES = 5;
 
    
    public Pizza(int codigo, String nome, String descricao, double preco, Tamanho tamanho) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        this.ingredientes = new Ingrediente[MAX_INGREDIENTES];
        this.numIngredientes = 0;
    }
 
    
    private int procurarPosicao(int codigo) {
        for (int i = 0; i < this.numIngredientes; i++) {
            if (this.ingredientes[i].getCodigo() == codigo) {
                return i;
            }
        }
        return -1;
    }
 
    
    public boolean adicionarIngrediente(Ingrediente ingrediente) {
        if (ingrediente == null) {
            return false;
        }
        if (this.numIngredientes >= MAX_INGREDIENTES) {
            System.out.println("Não é possível adicionar mais ingredientes (máx: " + MAX_INGREDIENTES + ")");
            return false;
        }
        if (this.encontrarIngrediente(ingrediente.getCodigo()) != null) {
            System.out.println("O ingrediente já existe nesta pizza.");
            return false;
        }
        this.ingredientes[this.numIngredientes++] = ingrediente;
        return true;
    }
 
    
    public Ingrediente encontrarIngrediente(int codigo) {
        int pos = this.procurarPosicao(codigo);
        return pos == -1 ? null : this.ingredientes[pos];
    }
 
    
    public boolean removerIngrediente(int codigo) {
        int pos = this.procurarPosicao(codigo);
        if (pos == -1) {
            return false;
        }
        for (int i = pos; i < this.numIngredientes - 1; i++) {
            this.ingredientes[i] = this.ingredientes[i + 1];
        }
        this.ingredientes[--this.numIngredientes] = null;
        return true;
    }
 
    
    public double getTotalCalorias() {
        double total = 0;
        for (int i = 0; i < this.numIngredientes; i++) {
            total += this.ingredientes[i].getTotalCalorias();
        }
        return total;
    }
 
    
    public String getDescricaoDetalhada() {
        String texto = this.nome.toUpperCase() + "\n"
                + "   Código: " + this.codigo + "\n"
                + "   Descrição: " + this.descricao + "\n"
                + "   Tamanho: " + this.tamanho.getDescricao() + "\n"
                + "   Preço: " + String.format("%.2f €", this.preco) + "\n"
                + "   Ingredientes:\n";
        for (int i = 0; i < this.numIngredientes; i++) {
            Ingrediente ing = this.ingredientes[i];
            texto += "      - " + ing.getNome()
                    + " (" + ing.getOrigem()
                    + ", " + ing.getTotalCalorias() + " kcal)\n";
        }
        texto += "   Total de calorias: " + this.getTotalCalorias() + " kcal";
        return texto;
    }
 
    public int getNumIngredientes() { return this.numIngredientes; }
 
    public int getCodigo() { return this.codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }
 
    public String getNome() { return this.nome; }
    public void setNome(String nome) { this.nome = nome; }
 
    public String getDescricao() { return this.descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
 
    public double getPreco() { return this.preco; }
    public void setPreco(double preco) { this.preco = preco; }
 
    public Tamanho getTamanho() { return this.tamanho; }
    public void setTamanho(Tamanho tamanho) { this.tamanho = tamanho; }
 
    @Override
    public String toString() {
        String texto = "Pizza {"
                + "Código=" + this.codigo
                + ", Nome='" + this.nome + '\''
                + ", Preço=" + this.preco
                + ", Tamanho=" + this.tamanho
                + ", Ingredientes=[";
        for (int i = 0; i < this.numIngredientes; i++) {
            texto += this.ingredientes[i].getNome();
            if (i < this.numIngredientes - 1) {
                texto += ", ";
            }
        }
        texto += "]}";
        return texto;
    }
}