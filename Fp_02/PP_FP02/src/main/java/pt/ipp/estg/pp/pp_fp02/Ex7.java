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
public class Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int positivo = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Telefonou para a vitima? (sim ou não)");
        String resposta1 = scanner.nextLine();
        if(resposta1.equals("sim")){
            positivo++;
        }
        System.out.print("Esteve no local do crime? (sim ou não)");
        String resposta2 = scanner.nextLine();
        if(resposta2.equals("sim")){
            positivo++;
        }
        System.out.print("Mora perto da vitima? (sim ou não)");
        String resposta3 = scanner.nextLine();
        if(resposta3.equals("sim")){
            positivo++;
        }
        System.out.print("Devia para a vitima? (sim ou não)");
        String resposta4 = scanner.nextLine();
        if(resposta4.equals("sim")){
            positivo++;
        }
        System.out.print("Já trabalhou com a vitima? (sim ou não)");
        String resposta5 = scanner.nextLine();
        if(resposta5.equals("sim")){
            positivo++;
        }
        
        if(positivo == 5){
            System.out.println("Assassino");
        }else if(positivo >=3){
            System.out.println("Cúmplice");
        }else if(positivo == 2){
            System.out.println("Suspeita");
        }else{
            System.out.println("Inocente");
        }
    
    }
    
}