package dosearch;

import java.util.Scanner;



public class DoSearch {
    public static void main(String[] args) {

        int[] primos = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 
		41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
                
        
        System.out.println("Digite um número primo de 2 a 97");
        Scanner ler = new Scanner(System.in);
        int x = ler.nextInt();
        int indice = binario(primos, x);
        
        System.out.println("Número escolhido é o " + (indice + 1) + "º número primo");
        
    }
    
    public static int binario(int[] s, int x){
        int inicio, meio, fim;
        inicio = 0;
        fim = s.length - 1;
        
        while(inicio <= fim){
            meio = (inicio + fim)/2;
            if(s[meio] == x){
                return meio;
            }else if (s[meio] < x){
                inicio = meio + 1;
            }else if (s[meio] > x){
                fim = meio -1;
            }
        }
        return -1;
    }
    
}
