/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp_fp06.pizza_restaurant;
import pp_fp06.pizza_restaurant.enums.Origem;
/**
 *
 * @author luism
 */
public class Ingrediente {
    private int codigo;
    private String nome;
    private Origem origem;
    private double totalCalorias;

    public Ingrediente(int codigo, String nome, Origem origem, double totalCalorias) {
        this.codigo = codigo;
        this.nome = nome;
        this.origem = origem;
        this.totalCalorias = totalCalorias;
    }

    
    public int getCodigo() { return this.codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public String getNome() { return this.nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Origem getOrigem() { return this.origem; }
    public void setOrigem(Origem origem) { this.origem = origem; }

    public double getTotalCalorias() { return this.totalCalorias; }
    public void setTotalCalorias(double totalCalorias) { this.totalCalorias = totalCalorias; }

    @Override
    public String toString() {
        return "Ingrediente {" +
                "Código=" + this.codigo +
                ", Nome='" + this.nome + '\'' +
                ", Origem=" + this.origem +
                ", Total de Calorias=" + this.totalCalorias +
                '}';
    }
}
