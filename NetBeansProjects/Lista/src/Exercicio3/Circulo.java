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
public class Circulo extends Forma{

    float raio;
    
    @Override
    float calcularArea() {
        return (float) (raio * 3.14);
    }

    @Override
    float calcularPerimetro() {
        return (float) (2 * raio * 3.14);
    }
    
    
}
