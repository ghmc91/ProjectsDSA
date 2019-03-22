/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo8;

import Models.Livro;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Gustavo
 */
public class Exercicio10 {
    
    public static void main(String[] args) {
        
        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro(1, "Geografia", 200, 300f));
        livros.add(new Livro(2, "Geografia 1", 300, 140f));
        livros.add(new Livro(3, "Geografia 2", 400, 250f));
        livros.add(new Livro(4, "Geografia 3", 90, 60f));
        livros.add(new Livro(5, "Senhor dos anéis", 150, 25f));
        livros.add(new Livro(6, "Pop", 125, 40f));
        
        //Obtendo uma lista de livro com preço maior que 100 reais
        List<Livro>precoMaiorQue100 = 
                livros.stream()
                .filter(i-> i.getPreco()>100)
                .collect(Collectors.toList());//Operação terminal que retorna em formato List<livro>
        
        System.out.println(precoMaiorQue100);
        System.out.println("-------");
        
        //Obtendo String com os nomes dos títulos separados por vírgulas
        String titulosLivros = precoMaiorQue100.stream()
                .map(l->l.getTitulo())
                .collect(Collectors.joining(", "));
        
        System.out.println(titulosLivros);
        System.out.println("----");
        
        int totalPaginas1 = livros.stream()
                .collect(Collectors.summingInt(l-> l.getPaginas()));
        int totalPaginas2 = livros.stream()
                .collect(Collectors.summingInt(Livro::getPaginas));//Referência de métodos
        
        System.out.println("Total de página de todos os livros: " +totalPaginas1 + " = " + totalPaginas2);
    }
}
