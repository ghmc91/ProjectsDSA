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
public class Aluno extends Pessoa {
    
    private float nota;
    private int matricula;

    Aluno() {
        
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Aluno(float nota, int matricula, String nome) {
        this.nota = nota;
        this.setNome(nome);
        this.matricula = matricula;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return this.getNome();
    }

    @Override
    public boolean equals(Object o) {
        return this.getMatricula() == ((Aluno)o).getMatricula();
                }

    @Override
    public void imprime() {
        System.out.println("Nome: " + getNome());
        System.out.println("Nota: " + getNota());
            
    }
    
    
    
    
   }
