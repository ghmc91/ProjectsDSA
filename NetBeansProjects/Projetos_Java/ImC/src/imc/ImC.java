/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

import java.util.Scanner;



/**
 *
 * @author Gustavo
 */
public class ImC {

  
    public static void main(String[] args) {
        float altura;
        float peso;
        float imc;
        
        Scanner teclado = new Scanner (System.in);
        System.out.print("Digite sua altura: ");
        altura = teclado.nextFloat();
        
        Scanner teclado2 = new Scanner (System.in);
        System.out.println("Digite seu peso: ");
        peso = teclado2.nextFloat();
        imc = iMc(altura,peso);
        
        System.out.println("IMC: " + imc);
    }
    /**
     * 
     * @param alt altura
     * @param peso peso
     * @return IMC
     */
    public static float iMc (float alt, float peso){
    float imc = peso/(alt*alt);
    return imc;    
}
}