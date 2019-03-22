/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo4.dsa;

/**
 *
 * @author Gustavo
 */
public class Conta {

    public Conta(){
        saldo += 10;
    }
    
    public Conta(String titular){
        this();
        this.titular = titular;
        
    }
    
    public String titular;
    private float saldo;

    public float getSaldo() {
        return saldo;
    }

    /*public void setSaldo(float saldo) {
        this.saldo = saldo;
    }*/
    public void saca(float valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor inválido:" + valor);
        } else if (saldo - valor < 0) {
            throw new IllegalArgumentException("Saque maior que o valor em conta");
        } else {
            saldo -= valor;
        }
    }

    public void deposita(float valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido:" + valor);
        } else {
            saldo += valor;
        }
    }
    //possibilita o agendamento
    public void deposita (float valor, int emQuantosDias){
        if (emQuantosDias == 0){
            deposita(valor);
        }
        else {
            System.out.println("Depósito agendado");
            //código do agendamento
        }
    }
    
    //Bônus por depósito
    public void deposita (float valor, float bonus){
        deposita(valor+bonus);
    }
}
