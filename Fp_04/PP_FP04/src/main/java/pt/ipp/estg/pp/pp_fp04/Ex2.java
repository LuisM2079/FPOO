/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt.ipp.estg.pp.pp_fp04;

/**
 *
 * @author luism
 */
public class Ex2 {
    
    public static void main(String[] args) {
        int[] vetor = {2, 6, 7, 10, 13, 28, 15, 496, 17, 20};

        System.out.println("Numeros primos:");
        for (int k = 0; k < vetor.length; k++) {
            int valor = vetor[k];
            boolean primo = true;

            if (valor < 2) {
                primo = false;
            }

            for (int i = 2; i < valor; i++) {
                if (valor % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println(valor);
            }
        }

        System.out.println("Numeros perfeitos:");
        for (int k = 0; k < vetor.length; k++) {
            int valor = vetor[k];
            int soma = 0;

            for (int i = 1; i < valor; i++) {
                if (valor % i == 0) {
                    soma = soma + i;
                }
            }

            if (soma == valor) {
                System.out.println(valor);
            }
        }
    }
    
}
