/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt.ipp.estg.pp.pp_fp04;
import java.util.Scanner;
/**
 *
 * @author luism
 */
public class Ex5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor:");
        double valor = scanner.nextDouble();

        System.out.println("Taxa de conversao:");
        double taxa = scanner.nextDouble();

        double resultado = valor * taxa;

        System.out.printf("%.2f%n", resultado);
    }
    
}
