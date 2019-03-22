/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo5;

import projetocapitulo5.dsa.Aluno;
import projetocapitulo5.dsa.Pessoa;

/**
 *
 * @author Gustavo
 */
public class Exercicio13 {
    
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa();
        p.setNome("Gustavo");
        p.setSobrenome("Costa");
        System.out.println("Nome completo: "+ p.getNomeCompleto());
        
        Aluno a = new Aluno();
        a.setNome("Gabriel");
        a.setSobrenome("Martins");
        a.setMatricula(2);
        System.out.println("Nome completo: " + a.getNomeCompleto());
    }
    
}
