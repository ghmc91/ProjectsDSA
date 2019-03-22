/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo6;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Gustavo
 */
public class Exercicio11 {
    
    public static void main(String[] args) {
        
        Queue fila = new LinkedList();
        fila.offer(new Instrutor(3, "Angelina", 1000));
        fila.offer(new Instrutor(2, "Mariza", 2000));
        fila.offer(new Instrutor(3, "Sandro", 3000));
        
        //Peek retorna mas não remove o primeiro elemento da fila
        Instrutor instrutor = (Instrutor) fila.peek();
        System.out.println(instrutor.getNome());
        System.out.println(fila.size());
        
        System.out.println("-----");
        
        //Pool retorna e remove o primeiro elemento da fila ou nulo se  a fila estiver vazia
        instrutor = (Instrutor) fila.poll();
        System.out.println(instrutor.getNome());
        System.out.println(fila.size());
        
        System.out.println("-----");
        
        //Remove retorna e remove o primeiro elemento da fila
        instrutor = (Instrutor) fila.remove();
        System.out.println(instrutor.getNome());
        System.out.println(fila.size());
        
        //Teste Remove x Pool
        instrutor = (Instrutor) fila.poll();
        //instrutor = (Instrutor) fila.remove();
        
        //Tipando a estrutura, agora sóserão aceitos "alunos" ou suas sublcasses na fila
        Queue<Aluno> fila2 = new LinkedList<>();
    }
    
    
}
