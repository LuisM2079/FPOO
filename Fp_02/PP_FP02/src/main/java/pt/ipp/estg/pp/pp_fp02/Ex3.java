/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pt.ipp.estg.pp.pp_fp02;

/**
 *
 * @author luism
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lista[] = {12, 5, -21, 10, -345, 22, 50, -125, 80, -1};

        long mult = 1;
        int negativos = 0;
        int maior = lista[0];
        int i = 0;

        while (i < 10) {
            int num = lista[i];

            if (num > 0) {
                mult *= num;
            } else if (num < 0) {
                negativos++;
            }
            if (num > maior) {
                maior = num;
            }
            i++;
        }
        
        System.out.println("a) Multiplicação dos positivos: " + mult);
        System.out.println("b) Quantidade de negativos: " + negativos);
        System.out.println("c) Maior número: " + maior);
    }
    
}
