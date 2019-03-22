/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo5;

import das2.Animais;
import das2.Cachorro;
import das2.Gato;
import das2.Pato;

/**
 *
 * @author Gustavo
 */
public class Exercicio14 {

    public static void main(String[] args) {

        Animais a = new Pato();
        Gato g = new Gato();
        System.out.println(a.som());
        System.out.println(g.som());

        a = new Cachorro();
        System.out.println(a.som());
    }
}
