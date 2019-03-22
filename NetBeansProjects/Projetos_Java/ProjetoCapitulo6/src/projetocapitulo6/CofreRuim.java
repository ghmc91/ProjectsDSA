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
public class CofreRuim {
    
    private Object objeto;
    
    public void guardar(Object objeto){
        this.objeto = objeto;
    }
    
    public Object obter (Object objeto){
        return this.objeto;
    }
    
}
