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
public class Instrutor extends Funcionario implements Palestrante {

    private String Curso;

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    @Override
    public float getBonusPalestra() {
        return 1000;
    }

}
