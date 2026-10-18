/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pt.ipp.estg.pp.pp_fp04;

/**
 *
 * @author luism
 */
public class MatrizTransposta {
public static void main(String[] args) {

        // Exercício 1

        // Inicialização da matriz original (exemplo 2x2)
        int[][] A = {
        {1, 2},
        {3, 4}
        };

        int N = A.length;

        // Matriz transposta
        int[][] B = new int[N][N];

        // Cálculo da transposta: B[i][j] = A[j][i]
        for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
        B[i][j] = A[j][i];
        }
        }

        // Impressão da matriz original
        System.out.println("Matriz original A:");
        for (int[] linha : A) {
        for (int elemento : linha) {
        System.out.print(elemento + " ");
        }
        System.out.println();
        }

        // Impressão da matriz transposta
        System.out.println("Matriz transposta B:");
        for (int[] linha : B) {
        for (int elemento : linha) {
        System.out.print(elemento + " ");
        }
        System.out.println();
        }
    }
}