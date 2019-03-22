/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

/**
 *
 * @author Gustavo
 */
public class Gato extends Animal {

    public Gato(String nome, String raca) {
        super(nome, raca);
    }

    @Override
    void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Raça: " + getRaca());
    }

    @Override
    void tipoAlimento() {
        System.out.println("Peixe");
    }

}
