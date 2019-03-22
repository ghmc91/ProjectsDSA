
package Capitulo8;
import Models.Livro;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Exercicio7 {
    
    public static void main(String[] args) {
        
        List<Livro> livros = new ArrayList<Livro>();
        livros.add(new Livro(1, "Geografia", 200, 30f));
        livros.add(new Livro(2, "Geografi", 300, 40f));
        livros.add(new Livro(3, "Geografa", 400, 50f));
        livros.add(new Livro(4, "Geogra", 500, 60f));
        
        //Operação de redução para retornar o livro que tem maior valor
        Optional<Livro> oi;
        oi = livros.stream()//Obtém uma Stream
                .reduce((livro1, livro2)
                        ->livro1.getPreco() / livro1.getPaginas() > livro2.getPreco() / livro2.getPaginas()? livro1 : livro2);
        if(oi.isPresent()){
            System.out.println(oi.get().getTitulo() + ":" + oi.get().getPreco());
        }
    }
}
