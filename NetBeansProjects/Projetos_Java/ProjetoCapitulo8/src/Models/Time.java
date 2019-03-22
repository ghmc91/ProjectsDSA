/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class Time {
    
    private String nome;
    private List<Jogador> jogadores;

    public Time(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
    }
    
    public String getNome(){
        return nome;
    }
    
    public void adicionarJogador(Jogador jogador){
        this.jogadores.add(jogador);
    }
    
    public List<Jogador> obterJogador(){
        return this.jogadores;
    }

    public void adicionarJogador(String dAlessandro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
    
       

