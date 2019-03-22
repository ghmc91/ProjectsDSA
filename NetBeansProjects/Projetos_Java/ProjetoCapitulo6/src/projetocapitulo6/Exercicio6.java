/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo6;

/**
 *
 * @author Gustavo
 */
public class Exercicio6 {
    
    public static void main(String[] args) {
        
        int idade = 10;
        // idade = null; Erro, tipo primitivo não aceita null
        // Se quisermos atribuir nulo a uma variável inteira
        // devemos usar a classe que empacota o tipo primitivo int
        //Uma referência a um objeto poderá receber nulo
        
        Integer novaIdade = 20; //Auto boxing
        System.out.println("Nova idade: " + novaIdade);
        
        int idadePrimitivo = novaIdade; //Auto Unboxing 
        System.out.println("IdadePrimitivo: " + idadePrimitivo);
        
        novaIdade = null;
        System.out.println(novaIdade);
        
        idadePrimitivo = novaIdade; // gera um NullPointerException
        
        
    }
    
}
