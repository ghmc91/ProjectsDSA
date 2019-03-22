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
public class TrabalhadorHora implements Empregado{
    
    float salarioHora, horas;

    public TrabalhadorHora(float salarioHora, float horas) {
        this.salarioHora = salarioHora;
        this.horas = horas;
    }

    @Override
    public float calcularGanho() {
    return salarioHora * horas;
    }
    
    
    
}
