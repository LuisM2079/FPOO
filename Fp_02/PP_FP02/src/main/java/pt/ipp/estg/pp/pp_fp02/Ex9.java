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
public class Ex9 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        double a = scanner.nextDouble();
        System.out.print("Segundo número: ");
        double b = scanner.nextDouble();

        if (a > b) {
            System.out.println("O maior é: " + a);
        } else {
            System.out.println("O maior é: " + b);
        }

        scanner.close();
    }
    
}
