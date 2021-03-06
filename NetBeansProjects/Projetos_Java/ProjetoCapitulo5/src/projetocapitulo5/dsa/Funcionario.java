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
public class Funcionario extends Pessoa {

    public String cargo;
    protected float salario;
    private Conta conta;
    
    private static final int TAXA_ADMINISTRACAO_BONUS = 50;
    private static final int BONUS_PERCENTUAL = 2;

    public Funcionario() {
        this.conta = new Conta();
    }
    
    public Funcionario(String nome, String sobrenome, String cargo, float salario) {
        super(nome, sobrenome);
        this.cargo = cargo;
        this.salario = salario;
    }

    public Funcionario(String nome, String sobrenome, String cargo, float salario, Conta conta) {
        this(nome, sobrenome, cargo, salario);
        this.conta = conta;
        }
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public float getBonus(){
        return (this.salario - TAXA_ADMINISTRACAO_BONUS)/100 * BONUS_PERCENTUAL;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
    
}
