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
public class Exercicio6 {

    public static void main(String[] args) {

        Conta c = new Conta("Gustavo");
        System.out.println(c.titular + ", seu Saldo é: " + c.getSaldo());
    }
}
