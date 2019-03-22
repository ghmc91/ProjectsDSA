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
public class Exercicio5 {

    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();
        System.out.println("Tamanho: " + alunos.size());
        System.out.println("Array está vazio? " + alunos.isEmpty());

        alunos.add("João");
        alunos.add(0, "Pedro");
        System.out.println("Tamanho: " + alunos.size());
        System.out.println("Array está vazio? " + alunos.isEmpty());
        
        String nome = "Maria";
        alunos.add(nome);
        
        for (int i = 0; i < alunos.size();i++){
            System.out.println(alunos.get(i));
        }
        
        System.out.println("----------");
        
        for (String aluno : alunos){
            System.out.println(aluno);
        }
        
         System.out.println("----------");
         
         System.out.println("Roberto está na lista? " + alunos.contains("Roberto"));
         System.out.println("Posição de Roberto: " + alunos.indexOf("Roberto"));
         System.out.println("João está na lista? " + alunos.contains("João"));
         System.out.println("Posição de João: " + alunos.indexOf("João"));
         alunos.add("João");
         System.out.println("Posição do João: " + alunos.indexOf("João"));
         System.out.println("Posição do último João: " + alunos.lastIndexOf("João"));
         
         alunos.remove(0);
         alunos.remove(alunos.lastIndexOf("João"));
         alunos.remove("Maria");
         
         ArrayList<String> outrosAlunos = new ArrayList<>();
         outrosAlunos.add("Gustavo");
         outrosAlunos.add("Gabriel");
         outrosAlunos.add("Lucas");
         
         alunos.addAll(outrosAlunos);
         for (String aluno: alunos){
             System.out.println(aluno);
         }
         
         System.out.println("-------");
         
         alunos.removeAll(outrosAlunos);
         for (String aluno: alunos){
             System.out.println(aluno);
         }
         
         System.out.println("-------");
         
         alunos.set(0, "João Silva");
         System.out.println(alunos.get(0));
         
         String[] alunosArray = new String[alunos.size()];
         alunosArray = alunos.toArray(alunosArray);
         
         for (String aluno:alunosArray){
             System.out.println(aluno);
         }
    }
}
