/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo8;

import java.util.ArrayList;
import java.util.List;
import Models.Funcionarios;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author Gustavo
 */
public class Exercicio11 {
    
    public static void main(String[] args) {
        
        List<Funcionarios> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionarios("Gustavo", 2000d, "TI"));
        funcionarios.add(new Funcionarios("Gabriel", 1000d, "Contabilidade"));
        funcionarios.add(new Funcionarios("Pedro", 1200d, "Administrativo"));
        funcionarios.add(new Funcionarios("Lucas", 3000d, "TI"));
        funcionarios.add(new Funcionarios("João", 400d, "Limpeza"));
        
        //Obtendo o total de salários por setor
        Map<String, Double> mapSalariosPorDepartamento = 
                funcionarios.stream()
                .collect(Collectors.groupingBy(f-> f.getDepartamento(),
                        Collectors.summingDouble(f->f.getSalario())));
        
        for(String departamento : mapSalariosPorDepartamento.keySet()){
            System.out.println
        (String.format("Total de salários em %s: %.2f",departamento, mapSalariosPorDepartamento.get(departamento)));
        }
        
        System.out.println("------");
         
        //Obtendo o total de funcionários por departamento
        Map<String, Long> mapFuncionariosPorDepartamento = 
                funcionarios.stream()
                .collect(Collectors.groupingBy(f-> f.getDepartamento(),
                        Collectors.counting()));
        
        for(String departamento : mapFuncionariosPorDepartamento.keySet()){
            System.out.println
        (String.format("Total de Funcionários em %s: %d",departamento, mapFuncionariosPorDepartamento.get(departamento)));
        }
        
        System.out.println("------");
        
         Map<String, Double> mapMediaSalarialPorDep = 
                funcionarios.stream()
                .collect(Collectors.groupingBy(f-> f.getDepartamento(),
                        Collectors.averagingDouble(f -> f.getSalario())));
        
        for(String departamento : mapMediaSalarialPorDep.keySet()){
            System.out.println
        (String.format("Média Salarial por departamento %s: %.2f"
                ,departamento, mapMediaSalarialPorDep.get(departamento)));
        }
    }
    
}
