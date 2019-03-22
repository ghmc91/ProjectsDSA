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
public class Exercicio7 {
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa("Gustavo", "Costa");
        //p.nome = "Gustavo";
        //p.sobrenome = "Costa";
        
        System.out.println(p.getNomeCompleto());
    }
}
