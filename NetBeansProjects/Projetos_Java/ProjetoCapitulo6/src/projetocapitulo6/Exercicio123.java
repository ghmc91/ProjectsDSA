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
public class Exercicio123 {
    public static void main(String[] args) {
        
        String nome = "Joao";
        nome = nome + " " + "Silva";
        System.out.println(nome);
        
        //Utilizando StringBuilder
        
        //Cria uma StringBuilder com capacidade de 16 caracteres
        StringBuilder sb1 = new StringBuilder();
        
        // Cria uma String Builder com capacidade de 20 caracteres
        StringBuilder sb2 = new StringBuilder(20);
        
        //Cria uma StringBuilder com capacidade para tamanho da String + 16 caracteres 
        StringBuilder sb3 = new StringBuilder("DSA");
        
        System.out.println("Tamanho: " + sb3.length());
        System.out.println("Capacidade: " + sb3.capacity());
        
        sb3.ensureCapacity(100);
        System.out.println("Nova capacidade: " + sb3.capacity());
        
        String formacao1 = " Formação Cientista de dados ";
        float precoFormacao1 = 2000;
        
        sb3.append(" Possui promoção para ")
                .append(formacao1)
                .append(" por ")
                .append(precoFormacao1);
        
        System.out.println(sb3.toString());
        
        //Performance
        //Armazenar todos os números entre 1 e 10000
        
        long ti = System.currentTimeMillis();
        String resultadoStr = " ";
        for (int i = 0; i <= 50000; i++){
            resultadoStr = resultadoStr + " " + i;
        }
        
        long tf = System.currentTimeMillis();
        System.out.println("Tempo de concatenação com String " + (tf - ti));
        
        ti = System.currentTimeMillis();
        StringBuilder resultadosSb = new StringBuilder(200000);
        for (int i = 0; i <=50000; i++){
            resultadosSb.append(" ").append(i);
        }
        
        System.out.println("Tempo de concatenação com StringBuilder " + (tf-ti));
               
        
    }
}
