/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float x;
        float y;
        float total;
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        x = reader.nextFloat();
        
        System.out.println("Digite o segundo valor: ");
        y = reader.nextFloat();
        
        total = somar(x,y);
        System.out.println("Soma:" + total);
        
        total = sub(x,y);
        System.out.println("Subtração:" + total);
        
        total = mult(x,y);
        System.out.println("Multiplicação:" + total);
        
        total = div(x,y);
        System.out.println("Divisão:" + total);
    }
    
    public static float somar (float num1, float num2){
        return num1+num2;
    }
    
     public static float sub (float num1, float num2){
        return num1-num2;
    }
     
      public static float mult (float num1, float num2){
        return num1*num2;
    }
       public static float div (float num1, float num2){
        return num1/num2;
    }
}
