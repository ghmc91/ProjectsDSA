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
public class Retangulo extends Forma{

    float lado, altura;
    
    @Override
    float calcularArea() {
        return lado * altura;
    }

    @Override
    float calcularPerimetro() {
        return (lado*2) + (altura * 2);
    }
    
}
