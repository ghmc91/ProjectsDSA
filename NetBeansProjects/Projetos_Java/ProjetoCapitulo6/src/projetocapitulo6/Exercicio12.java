/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo6;

import java.util.Stack;

/**
 *
 * @author Gustavo
 */
public class Exercicio12 {
    
    public static void main(String[] args) {
        
        Stack<Aluno> pilha = new Stack<>();
        pilha.push(new Aluno(1, 2, "Gustavo"));
        pilha.push(new Aluno(2, 3, "Gabriel"));
        pilha.push(new Aluno(3, 4, "Lucas"));
        
        // push empilha um elemento na estrutura
        // No caso acima, Lucas está no topo e portanto é o primeiro a sair
        
        Aluno lucas = pilha.peek();//Obtendo Lucas, mas sem remove-lo
        System.out.println(lucas.getNome());
        
        lucas = pilha.pop();//Obtendo e removendo Lucas
        System.out.println(lucas.getNome());
        
        Aluno proximoAluno = pilha.pop();
        System.out.println(proximoAluno.getNome());
        
        
    }
    
}
