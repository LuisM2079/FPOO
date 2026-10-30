/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pp_fp06.pizza_restaurant;
import pp_fp06.pizza_restaurant.enums.*;
/**
 *
 * @author luism
 */
public class PizzaDemo {
 
   
    public static void main(String[] args) {
        Ingrediente queijo = new Ingrediente(1, "Queijo Mozzarella", Origem.ANIMAL, 250);
        Ingrediente tomate = new Ingrediente(2, "Molho de Tomate", Origem.VEGETAL, 80);
        Ingrediente manjericao = new Ingrediente(3, "Manjericão Fresco", Origem.VEGETAL, 15);
        Ingrediente fiambre = new Ingrediente(4, "Fiambre", Origem.ANIMAL, 300);
        Ingrediente cogumelos = new Ingrediente(5, "Cogumelos", Origem.VEGETAL, 50);
        Ingrediente azeitonas = new Ingrediente(6, "Azeitonas Pretas", Origem.VEGETAL, 60);
 
        Pizza margherita = new Pizza(101, "Margherita", "Clássica pizza italiana com queijo e manjericão", 8.50, Tamanho.MEDIA);
        margherita.adicionarIngrediente(queijo);
        margherita.adicionarIngrediente(tomate);
        margherita.adicionarIngrediente(manjericao);
 
        Pizza capricciosa = new Pizza(102, "Capricciosa", "Pizza tradicional com fiambre e cogumelos", 9.80, Tamanho.FAMILIAR);
        capricciosa.adicionarIngrediente(queijo);
        capricciosa.adicionarIngrediente(fiambre);
        capricciosa.adicionarIngrediente(cogumelos);
        capricciosa.adicionarIngrediente(azeitonas);
 
        Ementa ementa = new Ementa(1, "Ementa da Semana", "Pizzas", true);
        ementa.adicionarPizza(margherita);
        ementa.adicionarPizza(capricciosa);
 
        System.out.println(ementa.getDescricaoDetalhada());
 
        
        System.out.println("Procurar ingrediente 4 na Capricciosa: " + capricciosa.encontrarIngrediente(4));
        System.out.println("Remover ingrediente 4: " + capricciosa.removerIngrediente(4));
        System.out.println("Calorias da Capricciosa depois de remover: " + capricciosa.getTotalCalorias());
        System.out.println();
        System.out.println(capricciosa.getDescricaoDetalhada());
    }
}