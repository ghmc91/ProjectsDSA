/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaJava;

import ClassesPetShop.Animais;
import ClassesPetShop.Cachorro;
import ClassesPetShop.Gato;
import ClassesPetShop.Pato;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class exercicio {
    
    public static void main(String[] args) {
        
        Gato gato = new Gato();
        gato.setNome("Bichano");
        gato.setAltura(0.5f);
        gato.setPeso(22f);
        gato.setCor("Preto");
                
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Artur");
        cachorro.setAltura(0.7f);
        cachorro.setPeso(35f);
        cachorro.setCor("Marron");
        
        Pato pato = new Pato();
        pato.setNome("Donald");
        pato.setAltura(1f);
        pato.setPeso(25);
        pato.setCor("Branco");
        
        /*System.out.println("Gato");
        System.out.println("Nome: " + gato.getNome());
        System.out.println("Altura: " + gato.getAltura() + "m");
        System.out.println("Peso: " + gato.getPeso() + "kg");
        System.out.println("Cor: " + gato.getCor());
        System.out.println("Som: " + gato.som());
        
        System.out.println("-------");
        
        System.out.println("Cachorro");
        System.out.println("Nome: " + cachorro.getNome());
        System.out.println("Altura: " + cachorro.getAltura() + "m");
        System.out.println("Peso: " + cachorro.getPeso() + "kg");
        System.out.println("Cor: " + cachorro.getCor());
        System.out.println("Som: " + cachorro.som());
        
        System.out.println("-------");
        
        System.out.println("Pato");
        System.out.println("Nome: " + pato.getNome());
        System.out.println("Altura: " + pato.getAltura() + "m");
        System.out.println("Peso: " + pato.getPeso() + "kg");
        System.out.println("Cor: " + pato.getCor());
        System.out.println("Som: " + pato.som());
        
        */
        
        List<Animais>lista = new ArrayList<>();
        lista.add(gato);
        lista.add(cachorro);
        lista.add(pato);
        
        for(Animais a : lista){
            if (a instanceof Gato){
                System.out.println("--------");
                System.out.println("Nome: " + ((Animais)a).getNome());
                System.out.println("Altura: " + ((Animais)a).getAltura());
                System.out.println("Peso: " + ((Animais)a).getPeso());
                System.out.println("Cor: " + ((Animais)a).getCor());
                System.out.println("Som: " + ((Animais)a).som());
            }
            else if (a instanceof Cachorro){
                System.out.println("--------");
                System.out.println("Nome: " + ((Animais)a).getNome());
                System.out.println("Altura: " + ((Animais)a).getAltura());
                System.out.println("Peso: " + ((Animais)a).getPeso());
                System.out.println("Cor: " + ((Animais)a).getCor());
                System.out.println("Som: " + ((Animais)a).som());
            }
            
            else if (a instanceof Pato){
                System.out.println("--------");
                System.out.println("Nome: " + ((Animais)a).getNome());
                System.out.println("Altura: " + ((Animais)a).getAltura());
                System.out.println("Peso: " + ((Animais)a).getPeso());
                System.out.println("Cor: " + ((Animais)a).getCor());
                System.out.println("Som: " + ((Animais)a).som());
            }
        }
        
    }
    
}
