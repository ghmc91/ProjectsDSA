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
public class TrabalhadoPecaProduzida implements Empregado{
    
    float remuneracao;
    int quantidade;

    public TrabalhadoPecaProduzida(float remuneracao, int quantidade) {
        this.remuneracao = remuneracao;
        this.quantidade = quantidade;
    }

    @Override
    public float calcularGanho() {
    return remuneracao * quantidade;
    }
    
}
