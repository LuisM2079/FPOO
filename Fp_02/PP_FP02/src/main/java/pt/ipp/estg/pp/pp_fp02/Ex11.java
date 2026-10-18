/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt.ipp.estg.pp.pp_fp02;

/**
 *
 * @author luism
 */
import java.util.Scanner;
public class Ex11 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um numero: ");
        double valor = scanner.nextDouble();

        if (valor > 0) {
            System.out.println("O numero é positivo.");
        } else if (valor < 0) {
            System.out.println("O numero é negativo.");
        } else {
            System.out.println("O numero é zero.");
        }

        scanner.close();
    }
    
}
