/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto2;

/**
 *
 * @author Gustavo
 */
public class Projeto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=1, y=3;
        int resp = soma(x, y);
        System.out.println("A soma é: " + resp);
        linhadivisoria();
        System.out.println(soma(5,8));
        linhadivisoria();
        System.out.println(divi(9,3));
        
        
        
        
    }//Fim da classe
    
    public static int soma(int x, int y){
        int resposta = x + y;
        return resposta;
    }
    
    /**
     * Rotina que permite a divisão de dois números com casas decimais
     * @param a número com casas decimais
     * @param b número com casas decimais
     * @return com valor com ponto flutuante, resultado da divisão
     */
    public static double divi(double a, double b){
        double resultado;
        resultado = a / b;
        return resultado;
           
    }
    /**
     * Função para imprimir linha divisória
     */
    public static void linhadivisoria(){
        System.out.println("-------------------------");
    }
    
}
