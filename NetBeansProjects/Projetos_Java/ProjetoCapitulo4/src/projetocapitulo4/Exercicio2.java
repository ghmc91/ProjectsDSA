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
public class Exercicio2 {
    public static void main(String[] args) {
        Pessoa pessoa = null;
        pessoa = new Pessoa("t","232");
        pessoa.nome = "José";
        if (pessoa != null)
            System.out.println(pessoa.nome);
        
            
        //System.out.println(pessoa.nome.length());
    }
    
}
