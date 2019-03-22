/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo5;

import projetocapitulo5.dsa.Calculadora;

/**
 *
 * @author Gustavo
 */
public class Exercicio7 {
    
    public static void main(String[] args) {
        System.out.println("3 + 7 = 10" + Calculadora.soma(3, 7));
        
        for (int i=0; i<50; i++){
            Calculadora c = new Calculadora();
        }
        
        System.out.println("Total de calculos feitos: " + Calculadora.getTotalDeCalculadoras());
        
    }
    
}
