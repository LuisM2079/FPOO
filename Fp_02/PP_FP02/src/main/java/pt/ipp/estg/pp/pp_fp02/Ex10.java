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
public class Ex10 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        
        System.out.print("Primeiro número: ");
        a = scanner.nextInt();
        
        System.out.print("Segundo número: ");
        b = scanner.nextInt();
        
        System.out.print("Terceiro número: ");
        c = scanner.nextInt();

        if ((a > b) && (c > a)) {
            System.out.println("Primeira mensagem");
        } else if ((a < b) || (b < c)) {
            System.out.println("Segunda mensagem");
        } else if (c == a) {
            System.out.println("Terceira mensagem");
        } else {
            System.out.println("Quarta mensagem");
        }
        System.out.println("Quinta mensagem");

        scanner.close();
    }
    
}
