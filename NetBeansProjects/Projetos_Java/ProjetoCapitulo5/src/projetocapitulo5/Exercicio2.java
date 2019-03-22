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
public class Exercicio2 {

    public static void main(String[] args) {
        Funcionario f = new Funcionario("Gustavo", "Costa", "Desenvolvedor", 1000F);
        System.out.println(f.getNomeCompleto() + " é " + f.getCargo() + " e recebe " + f.getSalario());
    }

}
