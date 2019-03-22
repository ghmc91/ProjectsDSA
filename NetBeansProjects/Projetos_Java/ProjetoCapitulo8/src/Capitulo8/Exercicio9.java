/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo8;

import Models.Livro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class Exercicio9 {

    public static void main(String[] args) {

        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro(1, "Geografia", 200, 300f));
        livros.add(new Livro(2, "Geografia 1", 300, 140f));
        livros.add(new Livro(3, "Geografia 2", 400, 250f));
        livros.add(new Livro(4, "Geografia 3", 90, 60f));
        livros.add(new Livro(5, "Senhor dos anéis", 150, 25f));
        livros.add(new Livro(6, "Pop", 125, 40f));
        
        //Podemos mapear os elementos de uma coleção para outros tipos
        //Por exemplo, dado uma coleção de livros, retornar somente os títulos
        
        livros.stream()
                .map(l->l.getTitulo())//Mapeando para uma stream de Strings
                .filter(s -> s.startsWith("Geografia"))//Expressão lambda recebe uma String
                .map(s -> s.length())//Mapeando para um stream de inteiros
                .filter(i -> i > 8)//Expressão lambda recebe um inteiro
                .forEach(s -> System.out.println(s));
    }

}
