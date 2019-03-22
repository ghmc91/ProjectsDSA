/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo5;

import java.util.Date;
import projetocapitulo5.dsa.Executivo;
import projetocapitulo5.dsa.Funcionario;
import projetocapitulo5.dsa.Palestra;

/**
 *
 * @author Gustavo
 */
public class Exercicio8 {

    public static void main(String[] args) {

        Executivo daniel = new Executivo("Daniel", "Costa", "Executivo", 4000);

        Funcionario gustavo = new Funcionario("Gustavo", "Henrique", "Desenvolvedor", 2600);

        Palestra palestra = new Palestra("Gestão", new Date(), "Rio de Janeiro", daniel);
        System.out.println(palestra.getPalestrante().getNome() + " Dará a palestra de: " + palestra.getTitulo());
        
        System.out.println 
                (palestra.getPalestrante().getNome() + " reberá de bonificação: " 
                + palestra.getPalestrante().getBonus());

    }
}
