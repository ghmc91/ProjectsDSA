/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo5;

import com.sun.org.apache.xpath.internal.operations.Equals;
import projetocapitulo5.dsa.Aluno;

/**
 *
 * @author Gustavo
 */
public class Exercicio11 {
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Gustavo");
        aluno1.setMatricula(1);
        
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Gustao");
        aluno2.setMatricula(1);
        
        if (aluno1.equals(aluno2))
            System.out.println("Iguais");
        else
            System.out.println("Diferentes");
        
        
    }
   
}
