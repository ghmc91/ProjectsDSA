/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo5;

import projetocapitulo5.dsa.Funcionario;

/**
 *
 * @author Gustavo
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.setNome("Gustavo");
        f.setSobrenome("Costa");
        f.setCargo("Desenvolvedor");
        System.out.println(f.getNomeCompleto() + " é um " + f.getCargo());
        //System.out.println(f.getNomeCompleto());

    }
}
