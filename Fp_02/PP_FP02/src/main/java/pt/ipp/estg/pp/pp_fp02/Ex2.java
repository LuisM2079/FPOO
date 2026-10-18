/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pt.ipp.estg.pp.pp_fp02;

/**
 *
 * @author luism
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] temperaturas = {12, 5, -2, 10, 8, 22, 3, 18, 8, -1};
        
        int menor = temperaturas[0];
        int maior = temperaturas[0];
        int soma = 0;

        for (int i=0; i<10; i++) {
            int temp = temperaturas[i];
            soma += temp;

            if (temp < menor) {
                menor = temp;
            }
            if (temp > maior) {
                maior = temp;
            }
        }
        float media = soma/10;
                
        System.out.println("Média das temperaturas: " + media);
        System.out.println("Menor temperatura: " + menor);
        System.out.println("Maior temperatura: " + maior);
    }
    
}
