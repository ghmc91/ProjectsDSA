/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo5;

import projetocapitulo5.dsa.Executivo;
import projetocapitulo5.dsa.Funcionario;

/**
 *
 * @author Gustavo
 */
public class Exercicio3 {

    public static void main(String[] args) {
        Executivo e = new Executivo("Gustavo", "Costa", "Diretor", 10000F);
        System.out.println(e.getNomeCompleto() + " é " + e.getCargo() + "e tera um bônus de " + e.getBonus());

        Funcionario f = new Funcionario();
        System.out.println(f.getSalario());
    }

}
