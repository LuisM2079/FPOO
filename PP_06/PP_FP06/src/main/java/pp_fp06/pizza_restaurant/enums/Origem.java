/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp_fp06.pizza_restaurant.enums;

/**
 *
 * @author luism
 */
public enum Origem {
    ANIMAL("Animal"),
    VEGETAL("Vegetal"),
    MINERAL("Mineral");

    private final String descricao;

    Origem(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public String toString() {
        return this.descricao;
    }
}
