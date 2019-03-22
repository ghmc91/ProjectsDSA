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
public class TrabalhadorComissionado implements Empregado{

    float salario,comissao,quantidade;

    public TrabalhadorComissionado(float salario, float comissao, float quantidade) {
        this.salario = salario;
        this.comissao = comissao;
        this.quantidade = quantidade;
    }
    @Override
    public float calcularGanho() {
        return salario + (comissao * quantidade);
    }
    
}
