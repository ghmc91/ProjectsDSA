/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Métodos Get e 
 */
package projetocapitulo4;

import projetocapitulo4.dsa.Pessoa;

/**
 *
 * @author Gustavo
 */
public class Exercicio4 {

    public static void main(String[] args) {
        Pessoa p = new Pessoa("ggtg","fdsa");
        p.setIdade(90);

        System.out.println(p.getIdade());

    }

}
