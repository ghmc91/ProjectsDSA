/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo8;

import Models.Jogador;
import Models.Time;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class Exercicio12 {
    
    public static void main(String[] args) {
        
        List<Time> times = new ArrayList<>();
        
        Time gremio = new Time("Gremio");
        gremio.adicionarJogador(new Jogador("Paulo Nunes"));
        gremio.adicionarJogador(new Jogador("R10"));
        
        Time internacional = new Time("Internacional");
        internacional.adicionarJogador("Pato");
        internacional.adicionarJogador("D'Alessandro");
        
        times.add(gremio);
        times.add(internacional);
        
        //Flatmaps pode transformar um elemento de uma Stream
        //em uma stream de outros objetos
        //Uma entrada pode ser mapeada em 0,1 ou em muitas saídas
        //No caso, cada entrada(time) é mapeada em várias saídas jogadores
        
        times.stream()
                .flatMap(f -> f.obterJogador().stream())
                .forEach(j->System.out.println(j.getNome()));
        
               
        
    }
    
}
