/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class Exercicio17 {
    
    public static void main(String[] args) {
        
        Livro livro = new Livro ("Senhor dos anéis", 1000);
        
        CofreRuim cofreRuim = new CofreRuim();
        cofreRuim.guardar(livro);
        
        Livro livroDoCofre = (Livro) cofreRuim.obter(livro);
        System.out.println(livro.getTitulo());
        
        List<Livro> livros = new ArrayList<>();
        livros.add(livro);
        Livro livro1 = livros.get(0);
        
        List<Boneca> boneca = new ArrayList<>();
        Boneca boneca1 = boneca.get(0);
        
        
    }
    
}
