/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo5;

import projetocapitulo5.dsa.Conta;
import projetocapitulo5.dsa.Funcionario;

/**
 *
 * @author Gustavo
 */
public class Exercicio5 {

    public static void main(String[] args) {

        Funcionario f = new Funcionario("Gustavo", "Costa", "Desenvolvedor", 1000F, new Conta());
        f.getConta().deposita(1000);
        System.out.println(f.getConta().getSaldo());

        Conta c = new Conta();
        c.deposita(200);
        f.setConta(c);
        System.out.println(f.getConta().getSaldo());
        
        Funcionario f2 = new Funcionario();
        System.out.println(f2.getConta().getSaldo());
    }

}
