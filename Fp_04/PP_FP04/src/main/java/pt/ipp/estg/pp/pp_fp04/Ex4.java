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
public class Ex4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor em graus:");
        double graus = scanner.nextDouble();
        double radianos = graus * Math.PI / 180;

        System.out.println(graus + " graus = " + radianos + " radianos");
    }
    
}
