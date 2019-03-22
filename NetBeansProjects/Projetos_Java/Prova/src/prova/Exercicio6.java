/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class Exercicio6 {
    
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Gustavo");
        nomes.add("Pedro");
        nomes.add("Lucas");
        
        for (int i = 0; i<nomes.size();i++){
            System.out.println(nomes.get(i));
        }
    }
            
    
}
