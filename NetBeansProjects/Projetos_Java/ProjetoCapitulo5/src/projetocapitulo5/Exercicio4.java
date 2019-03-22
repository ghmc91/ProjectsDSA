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
public class Exercicio4 {

    public static void main(String[] args) {

        Funcionario f = new Funcionario("Gustavo", "Costa", "Desenvolvedor", 10000F);
        System.out.println(String.format("%s terá um bônus de %f", f.getNome(), f.getBonus()));

        Executivo e = new Executivo("Clodoaldo", "José", "Programdador", 2000F);
        System.out.println(String.format("%s terá um bônus de %f", e.getNome(), e.getBonus()));
    }
}
