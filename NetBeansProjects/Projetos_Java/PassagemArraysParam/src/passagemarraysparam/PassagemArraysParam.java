package passagemarraysparam;

import sun.security.util.Length;

public class PassagemArraysParam {

    public static void main(String[] args) {
        // Passagem de array por parâmetros
        int[] salariosDiretores = {10000,20000,30000};
        int[] salariosExecutivos = {40000,50000,60000};
        int[] salariosTodos = somaArrays(salariosDiretores, salariosExecutivos);
        
        for (int salario: salariosTodos){
            System.out.println(salario);
        }
        
    }
    public static int[] somaArrays (int[] a, int [] b ){
        int[] resultado = new int [a.length + b.length];
        
        int i = 0;
        for (int num:a){
            resultado[i]=num;
            i++;
        }
        
        for (int num:b){
            resultado[i]=num;
            i++;
        }
        
        return resultado;
    }
}
