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
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inssira um numero ");
        int num = scanner.nextInt();
        
        if(num % 2 == 0){
            System.out.println("O numero é par");
        }else{
            System.out.println("O numero é impar");
        }
        
    }
    
}
