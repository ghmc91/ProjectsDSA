/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo4;

import projetocapitulo4.dsa.Pessoa;

/**
 *
 * @author Gustavo
 */
public class Exercicio1 {

    public static void main(String[] args) {

        Pessoa p = new Pessoa("dd","tt");
        p.nome = "Gustavo";
        p.pais = "Brasil";
        
        Pessoa p2 = p;
        
        p2.nome = "Costa";
        
        System.out.println(p.nome + " mora no " + p.pais);

    }

}
