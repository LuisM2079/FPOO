/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt.ipp.estg.pp.pp_fp04;

/**
 *
 * @author luism
 */
public class Ex3 {
    
    public static void main(String[] args) {
        int[][] matriz = {
            {5, 2, 8},
            {3, 5, 1},
            {9, 5, 2},
            {4, 7, 2}
        };

        int maisRepetido = matriz[0][0];
        int maxVezes = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                int atual = matriz[i][j];
                int vezes = 0;

                for (int a = 0; a < 4; a++) {
                    for (int b = 0; b < 3; b++) {
                        if (matriz[a][b] == atual) {
                            vezes = vezes + 1;
                        }
                    }
                }

                if (vezes > maxVezes) {
                    maxVezes = vezes;
                    maisRepetido = atual;
                }
            }
        }

        System.out.println("Numero mais repetido: " + maisRepetido + " (" + maxVezes + " vezes)");

        for (int i = 0; i < 4; i++) {
            int maior = matriz[i][0];
            int menor = matriz[i][0];

            for (int j = 1; j < 3; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }

            System.out.println("Linha " + i + ": maior = " + maior + ", menor = " + menor);
        }
    }
    
}
