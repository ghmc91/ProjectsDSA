/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo5;

import java.util.Date;
import projetocapitulo5.dsa.Aluno;
import projetocapitulo5.dsa.Consultor;
import projetocapitulo5.dsa.Executivo;
import projetocapitulo5.dsa.Instrutor;
import projetocapitulo5.dsa.Palestra2;

/**
 *
 * @author Gustavo
 */
public class Exercicio9 {

    public static void main(String[] args) {

        Consultor c = new Consultor();
        c.setNome("Tiago");
        Palestra2 palestraML = new Palestra2("Machine Leraning", new Date(), "São Paulo", c);
        System.out.println("O consultor " + c.getNome() + " receberá bônus de " + c.getBonusPalestra());

        Executivo e = new Executivo("Pedro", "Vizew", "Executivo", 5000);
        Palestra2 palestraIA = new Palestra2("87", new Date(), "Barroso", e);
        System.out.println("O executivo " + e.getNomeCompleto()
                + "Dará palestra em " + palestraIA.getLocal() + "e reberá bônus de " + e.getBonusPalestra());

        Instrutor i = new Instrutor();
        i.setNome("Roberta");
        i.setCurso("Ciência Computacional");
        Palestra2 palestraCC = new Palestra2("Git", new Date(), "RJ", i);
        System.out.println("A Instrutora " + i.getNome()
                + "Dará palestra em " + palestraCC.getLocal() + "e reberá bônus de " + i.getBonusPalestra());
        
        Aluno a = new Aluno();
        a.setNome("Gustavo");
        System.out.println("O aluno " + a.getNome() + " Não pode ministrar palestras");
    }

    

}
