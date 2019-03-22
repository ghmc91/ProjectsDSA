/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo5.dsa;

import java.util.Date;

/**
 *
 * @author Gustavo
 */
public class Palestra {
    
    private String titulo;
    private Date data;
    private String local;
    private Funcionario palestrante;
    
    public Palestra (String titulo, Date data, String local, Funcionario palestrante){
        this.titulo = titulo;
        this.data = data;
        this.local = local;
        this.palestrante = palestrante;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Funcionario getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(Funcionario palestrante) {
        this.palestrante = palestrante;
    }

    
    
    
    
    
    
    
}
