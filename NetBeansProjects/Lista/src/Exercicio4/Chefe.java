/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio4;

/**
 *
 * @author Gustavo
 */
public class Chefe implements Empregado{
    
    float salarioSemanal;

    public Chefe(float salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public float calcularGanho() {
    return salarioSemanal * 4;
    }
    
}
