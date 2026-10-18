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
public class Ex6 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor em centimos:");
        int total = scanner.nextInt();

        int euros = total / 100;
        int centimos = total % 100;

        System.out.println(euros + " euros e " + centimos + " centimos");
    }
    
}
