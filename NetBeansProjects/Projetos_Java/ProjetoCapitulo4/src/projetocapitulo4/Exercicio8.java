/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo4;

import projetocapitulo4.dsa.Conta;

/**
 *
 * @author Gustavo
 */
public class Exercicio8 {
    public static void main(String[] args) {
        Conta c = new Conta();
        
        //Depositando 1000 conto rsrs
        c.deposita(1000);
        System.out.println("Valor do primeiro depósito: " + c.getSaldo());
        
        //Agenda o valor de novo depósito, logo o saldo não é alterado
        c.deposita(300, 2);
        System.out.println(c.getSaldo());
        
        //Deposita o bônus
        c.deposita(300, 10F);
        System.out.println(c.getSaldo());
        
    }
}
