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
public class Exercicio3 {
    
    public static void main(String[] args) {
        Pessoa p = new Pessoa("tytr","trew");
        p.nome = "Carlos";
        p.sobrenome = "Roberto";
        
        System.out.println(p.getNomeCompleto());
    }
    
}
