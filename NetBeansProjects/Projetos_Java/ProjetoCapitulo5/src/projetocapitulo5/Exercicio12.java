/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo5;

import dsainterfaces.Palestrante;
import java.util.Date;
import projetocapitulo5.dsa.Palestra2;

/**
 *
 * @author Gustavo
 */
public class Exercicio12 {
    
    public static void main(String[] args) {
        Palestra2 palestra = 
                new Palestra2("Macinhe Learning", new Date(), "SJBoladão", new Palestrante(){
                    @Override
                    public float getBonusPalestra(){
                        return 200;
                    }
                });
        
        Palestrante p = palestra.getPalestrante();
        System.out.println(p.getBonusPalestra());
    }
    
}
