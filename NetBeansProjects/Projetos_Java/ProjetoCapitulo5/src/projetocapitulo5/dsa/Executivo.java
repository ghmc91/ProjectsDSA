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
public class Executivo extends Funcionario implements Palestrante {

    private static final int BONUS_PERCENTUAL = 10;

    public Executivo(String nome, String sobrenome, String cargo, float salario) {
        super(nome, sobrenome, cargo, salario);
    }
    
    @Override
    public float getBonus() {
        return this.salario / 100 * BONUS_PERCENTUAL;
    }

    @Override
    public float getBonusPalestra() {
        return 3000;

    }

}
