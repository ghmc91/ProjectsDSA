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
public class Exercicio18 {
    
    public static void main(String[] args) {
        
        Boneca elsa = new Boneca();
        elsa.setTitulo("Frozen");
        elsa.setCorRoupa("Azul");
        
        Cofre<Boneca> cofreBoneca = new Cofre<>("1234");
        cofreBoneca.abrir("1234");
        cofreBoneca.guardar(elsa);
        cofreBoneca.fechar();
        
        cofreBoneca.abrir("1234");
        Boneca bonecaGuardada = cofreBoneca.obter();
        cofreBoneca.fechar();
        
        System.out.println(bonecaGuardada.getTitulo() + " esta com roupa " + elsa.getCorRoupa());
    }
}
