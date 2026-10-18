/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pt.ipp.estg.pp.pp_fp02;

/**
 *
 * @author luism
 */
import java.util.Scanner;
public class Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1º nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("2º nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("3º nota: ");
        double nota3 = scanner.nextDouble();
        
        double soma = nota1+nota2+nota3;
        double media = soma / 3;
        
        if(media>=9.5){
            System.out.println("Aprovado");
        }
        if(media>=7.5){
        System.out.println("Reprovado");
        }else{
            System.out.println("Sem nota minima");
        }
        
    }
    
}
