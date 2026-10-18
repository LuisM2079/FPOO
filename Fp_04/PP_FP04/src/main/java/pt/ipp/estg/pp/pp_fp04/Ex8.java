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
public class Ex8 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor em euros:");
        double valor = scanner.nextDouble();

        int centimos = (int) (valor * 100);

        int m200 = centimos / 200;
        centimos = centimos % 200;

        int m100 = centimos / 100;
        centimos = centimos % 100;

        int m50 = centimos / 50;
        centimos = centimos % 50;

        int m20 = centimos / 20;
        centimos = centimos % 20;

        int m10 = centimos / 10;
        centimos = centimos % 10;

        int m5 = centimos / 5;
        centimos = centimos % 5;

        int m2 = centimos / 2;
        centimos = centimos % 2;

        int m1 = centimos;

        if (m200 > 0) {
            System.out.println(m200 + " moedas de 2 euros");
        }
        if (m100 > 0) {
            System.out.println(m100 + " moedas de 1 euro");
        }
        if (m50 > 0) {
            System.out.println(m50 + " moedas de 50 centimos");
        }
        if (m20 > 0) {
            System.out.println(m20 + " moedas de 20 centimos");
        }
        if (m10 > 0) {
            System.out.println(m10 + " moedas de 10 centimos");
        }
        if (m5 > 0) {
            System.out.println(m5 + " moedas de 5 centimos");
        }
        if (m2 > 0) {
            System.out.println(m2 + " moedas de 2 centimos");
        }
        if (m1 > 0) {
            System.out.println(m1 + " moedas de 1 centimo");
        }
    }
    
}
