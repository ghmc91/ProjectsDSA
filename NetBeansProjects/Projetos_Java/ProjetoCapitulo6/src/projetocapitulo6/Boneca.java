/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo6;

/**
 *
 * @author Gustavo
 */
public class Boneca extends Brinquedo implements Guardavel{
    
    private String corRoupa;

    public String getCorRoupa() {
        return corRoupa;
    }

    public void setCorRoupa(String corRoupa) {
        this.corRoupa = corRoupa;
    }
}
