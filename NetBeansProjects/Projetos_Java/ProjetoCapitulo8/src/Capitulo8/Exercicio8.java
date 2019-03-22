/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo8;

import Models.Livro;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Gustavo
 */
public class Exercicio8 {
    
    public static void main(String[] args) {
        
        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro(1, "Geografia", 200, 300f));
        livros.add(new Livro(2, "Geografi", 300, 140f));
        livros.add(new Livro(3, "Geografa", 400, 250f));
        livros.add(new Livro(4, "Geogra", 90, 60f));
        
        Predicate<Livro>pMaisDeCemPaginas = livro -> livro.getPaginas()>100;
        Predicate<Livro>pPrecoMaiorQueCem = livro -> livro.getPreco()>100;
        
        //E
        Predicate<Livro>pMaisDeCemPagECemReais = 
                pMaisDeCemPaginas.and(pPrecoMaiorQueCem);
        
        //Ou
        Predicate<Livro>pMaisDeCemPagouCemReais = 
                pMaisDeCemPaginas.or(pPrecoMaiorQueCem);
        
        //Negação
        Predicate<Livro>cemPaginasOuMenos = 
                pMaisDeCemPaginas.negate();
        
        System.out.println("Livros com mais de cem páginas e preço maior que cem: ");
        livros.stream()
                .filter(pMaisDeCemPagECemReais)
                .forEach(i->System.out.println(i.getTitulo()));
        System.out.println("-------");
        
        System.out.println("Livros com mais de cem páginas ou mais caro que cem reais: ");
        livros.stream()
                .filter(pMaisDeCemPagouCemReais)
                .forEach(i->System.out.println(i.getTitulo()));
        System.out.println("-------");
        
        System.out.println("Livros com menos de cem páginas: ");
        livros.stream()
                .filter(cemPaginasOuMenos)
                .forEach(l -> System.out.println(l.getTitulo()));
    }
    
}
