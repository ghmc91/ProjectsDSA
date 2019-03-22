/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshopif;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class PetshopIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Animal a1 = new Animal("Artur", "Cachorro", "Masculino", 10);
        Animal a2 = new Animal("Che", "Cachorro", "Masculino", 10);
        
        List<Animal> animais = new ArrayList<>();
        animais.add(a1);
        animais.add(a2);
        
        System.out.println(animais.size());
        
        for (Animal lista : animais) {
            System.out.println(lista);
            System.out.println("-------------");
        }
        
        System.out.println("Nome: " + a1.getNome() + "\nEspécie: " + a1.getEspecie() + 
                "\nSexo: " + a1.getSexo() + "\nIdade: " + a1.getIdade());
        
        System.out.println("----------------------");
                
        System.out.println("Nome: " + a2.getNome() + "\nEspécie: " + a2.getEspecie() + 
                "\nSexo: " + a2.getSexo() + "\nIdade: " + a2.getIdade());

    }
    
}
