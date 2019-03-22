/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class ExercicioSala {

    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        a1.setNome("Carlos");
        a1.setMatricula(1);
        a1.setNota(10);

        Aluno a2 = new Aluno();
        a2.setNome("Pedro");
        a2.setMatricula(2);
        a2.setNota(10);

        List<Aluno> lista = new ArrayList<>();
        lista.add(a2);
        lista.add(a1);
        
        System.out.println("Alunos");
        for (Aluno a : lista) {
            a.imprime();
        }
        
        Instrutor i1 = new Instrutor();
        i1.setNome("Flávio");
        i1.setIdade(34);
        i1.setSalario(3330);
        
        Instrutor i2 = new Instrutor();
        i2.setNome("José");
        i2.setIdade(34);
        i2.setSalario(3330);
        
        System.out.println("Professores");
        
        List <Instrutor> listaP = new ArrayList<>();
        listaP.add(i1);
        listaP.add(i2);
        
        for (Instrutor i : listaP){
            i.imprime();
        }
        
        System.out.println("Responsáveis");
        ResponsavelAluno r1 = new ResponsavelAluno();
        r1.setNome("Alfredo");
        r1.setTelContato(333333333);
        r1.imprime();
    }

}
