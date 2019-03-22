/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author Gustavo
 */
public class Enums {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 1 para soma
        // 2 para subtração
        // 3 para multiplicação
        // 4 para divisão
        calcular (1,4,tipoOp.MULTIPLICACAO);
    }
    
    /*public static void calcular (int op1, int op2, int tipoOp){
        if (tipoOp == 1)
            System.out.println(op1+op2);
        else if (tipoOp == 2)
            System.out.println(op1 - op2);
        else if (tipoOp == 3)
            System.out.println(op1 * op2);
        else if (tipoOp == 4)
            System.out.println(op1/op2);
        else System.out.println("Operador inválido");
    */
        
        public static void calcular (int op1, int op2, tipoOp tipoOp){
        if (tipoOp == tipoOp.ADICAO)
            System.out.println(op1+op2);
        else if (tipoOp == tipoOp.SUBTRACAO)
            System.out.println(op1 - op2);
        else if (tipoOp == tipoOp.MULTIPLICACAO)
            System.out.println(op1 * op2);
        else if (tipoOp == tipoOp.DIVISAO)
            System.out.println(op1/op2);
        else System.out.println("Operador inválido");
            
    }
        
        enum tipoOp {
            ADICAO, SUBTRACAO, MULTIPLICACAO, DIVISAO;
        }
            
    
}
