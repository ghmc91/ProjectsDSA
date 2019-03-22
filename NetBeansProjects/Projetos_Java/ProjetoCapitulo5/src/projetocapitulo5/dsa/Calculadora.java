/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo5.dsa;

/**
 *
 * @author Gustavo
 */
public class Calculadora {

    private static int totalDeCalculadoras = 0;

    public Calculadora() {
        totalDeCalculadoras++;
    }

    public static int soma(int num1, int num2) {
        return num1 + num2;
    }

    public static int getTotalDeCalculadoras() {
        return totalDeCalculadoras;
    }
    
    

}
