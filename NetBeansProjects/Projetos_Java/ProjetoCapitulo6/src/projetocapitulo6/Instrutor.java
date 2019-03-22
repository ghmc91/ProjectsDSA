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
public class Instrutor extends Pessoa implements Comparable {

    private int matricula;
    private float salario;

    public Instrutor(int matricula, String nome, float salario) {
        this.matricula = matricula;
        this.setNome(nome);
        this.salario = salario;
    }

    Instrutor() {
        
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public int compareTo(Object t) {
        return this.matricula - ((Instrutor)t).matricula;
    }

    @Override
    public void imprime() {
        System.out.println("Nome do Instrutor " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Salário: " + getSalario());
    }

}
