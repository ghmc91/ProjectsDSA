/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularimc;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class CalcularIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float altura;
        float peso;
        float imc;
        String clas;
        
        Scanner teclado = new Scanner (System.in);
        System.out.print("Digite sua altura: ");
        altura = teclado.nextFloat();
        
        Scanner teclado2 = new Scanner (System.in);
        System.out.print("Digite seu peso: ");
        peso = teclado2.nextFloat();
        imc = iMc(altura,peso);
        clas = classificacao(imc);
        
        System.out.println("IMC: " + imc);
        System.out.println(clas);
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
    /**
     * 
     * @param valorImc valor do IMC
     * @return 
     */    
    public static String classificacao (float valorImc){
        if (valorImc < 15)
            return "Extremamente abaixo do peso";
        else if (valorImc<16)
            return "Gravemente abaixo do peso";
        else if (valorImc<18.5)
            return "Abaixo do peso ideal";
        else if (valorImc<25)
            return "Faixa de peso ideal";
        else if (valorImc<30)
            return "sobrepeso";
        else if (valorImc<35)
            return "obesidade 1";                
        return null;
        }
}