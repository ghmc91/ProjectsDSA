/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo5.dsa;

import dsainterfaces.Palestrante;

/**
 *
 * @author Gustavo
 */
public class Consultor extends Pessoa implements Palestrante {
    
    private String especialidade;
    
    public String getEspecialidade(){
        return especialidade;
    }
    
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    
    public float getBonusPalestra() {
        return 1000;
    }
    
    /*
    @Override
    public float getGastosPalestra() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */
    
    
}
