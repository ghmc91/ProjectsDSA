/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio3;

/**
 *
 * @author Gustavo
 */
public class Principal {
    
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.altura = 2;
        retangulo.lado = 2;
        System.out.println("Area: " + retangulo.calcularArea() + "\nPerimetro: " + retangulo.calcularPerimetro());
        
        Circulo circulo = new Circulo();
        circulo.raio = 3;
        System.out.println("Area: " + circulo.calcularArea() + "\nPerimetro: " + circulo.calcularPerimetro());
        
    }
    
}
