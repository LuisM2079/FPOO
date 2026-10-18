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
public class Ex7 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dividendo:");
        int dividendo = scanner.nextInt();

        System.out.println("Divisor:");
        int divisor = scanner.nextInt();

        int quociente = 0;
        int resto = dividendo;

        if (divisor == 0) {
            System.out.println("Nao e possivel dividir por zero");
        } else {
            while (resto >= divisor) {
                resto = resto - divisor;
                quociente = quociente + 1;
            }

            System.out.println("Resultado da divisao: " + quociente);
            System.out.println("Resto da divisao: " + resto);
        }
    }
    
}
