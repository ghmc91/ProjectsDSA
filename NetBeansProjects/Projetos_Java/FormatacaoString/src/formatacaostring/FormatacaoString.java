/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formatacaostring;

import java.util.Date;

/**
 *
 * @author Gustavo
 */
public class FormatacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String msg;
        String curso = "Java Fundamentos";
        double valorCurso = 123.456;
        
        //passando uma String como argumento
        //msg = String.format("Bem-vindo ao curso %s da DataScience", curso);
        
        // passando uma String e um int como argumentos
        /*msg = String.format("Bem-vindo ao curso %s da DataScience. Teremos %d videos", curso, 200);
        System.out.println(msg);
        
        
        // passando uma String e um double como argumentos
        //msg = String.format("Valor do curso %s: %f", curso, valorCurso);
        msg = String.format("Valor do curso %s: %.2f", curso, valorCurso);
        System.out.println(msg);
        */
        Date dataAtual = new Date();
        msg = String.format("Hoje é %tD",dataAtual);
        System.out.println(msg);
        
        
    }
    
}
