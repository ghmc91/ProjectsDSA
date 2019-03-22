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
public class Cofre<T extends Guardavel> {

    private static final int TAMANHO_MINIMO_SENHA = 3;

    private T t;
    private boolean aberto = false;
    private String senha;

    public Cofre(String senha) {
        if (senha == null || senha.length() < TAMANHO_MINIMO_SENHA) {
            throw new IllegalArgumentException(String.format("Senha deverá conter no mínimo %d caracteres", TAMANHO_MINIMO_SENHA));
        }
        this.senha=senha;
    }

    public void guardar(T t) {
        if (!aberto) {
            throw new IllegalStateException("Cofre está fechado");
        }
        this.t = t;
    }
    
    public T obter() {
        if(!aberto)
            throw new IllegalStateException("Cofre está fechado");
        if (t == null)
            throw new IllegalStateException("Cofre vazio");
        return t;
    }
    
    public void abrir (String senha){
        if(aberto)
            throw new IllegalStateException("Cofre já aberto");
        if(!this.senha.equals(senha))
            throw new IllegalStateException("Senha incorreta");
        aberto = true;
    }
    
    public void esvaziar(){
        t = null;
    }
    
    public void fechar(){
        aberto=false;
    }
}
