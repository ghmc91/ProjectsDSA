/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo5.dsa;

/**
 *
 * @author Gustavo
 */
public class Aluno extends Pessoa {

    private String curso;
    private int matricula;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Aluno) {
            return this.matricula == ((Aluno) obj).getMatricula()
                    && this.getNome().equals(((Aluno)obj).getNome());
        } else {
            return false;
        }
    }
}