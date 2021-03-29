/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exnove;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ExNove {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //9. Faça um programa que calcule e imprima a área de um trapézio.
        Scanner entrada = new Scanner(System.in);
        float baseMaior;
        float baseMenor;
        float altura;
        float area;
        
        System.out.println("Digite o valor da base maior: ");
        baseMaior = entrada.nextFloat();
        System.out.println("Digite o valor da base menor: ");
        baseMenor = entrada.nextFloat();
        System.out.println("Digite a altura: ");
        altura = entrada.nextFloat();
        area = ((baseMaior+baseMenor)*altura)/2;
        
        System.out.println("A area do trapézio é de: "+area + " "+ "cm²");
    }
    
}
