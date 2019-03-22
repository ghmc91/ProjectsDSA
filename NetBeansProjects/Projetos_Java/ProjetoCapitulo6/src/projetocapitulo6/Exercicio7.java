/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo6;

import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class Exercicio7 {
    
    public static void main(String[] args) {
        
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Aluno joao = new Aluno(30, 5,"Gustavo");
        pessoas.add(joao);
        
        pessoas.add(new Aluno(25, 6, "Gabriel"));
        pessoas.add(new Instrutor(1, "Lucas", 20));
        
        Pessoa p = pessoas.get(1);
        System.out.println(p.getNome());
        
        Instrutor i = (Instrutor) pessoas.get(2);
        System.out.println(i.getNome() + " recebe: " + i.getSalario());
        
        //i = (Instrutor) pessoas.get(0);
        
        for (Pessoa pes : pessoas){
            if (pes instanceof Aluno)
                System.out.println("O aluno " + pes.getNome() + " Tirou " + ((Aluno) pes).getNota());
            else if (pes instanceof Instrutor)
                System.out.println("O Instrutor " + pes.getNome() + " Recebe " + ((Instrutor) pes).getSalario());
        }
    }
    
}
