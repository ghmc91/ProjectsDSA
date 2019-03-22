/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulacaostring;

/**
 *
 * @author Gustavo
 */
public class ManipulacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Obtendo o caracter de uma string em uma posição específica 
        String anotherPalindrome = "Niagara. O roar again";
        
        /*char aChar = anotherPalindrome.charAt(2);
        System.out.println(aChar);*/
        
        //Obtendo uma sub-String de uma string
        /*String roar = anotherPalindrome.substring(11,15);
        System.out.println(roar);*/
        
        //Dividindo (separando) conteúdo de uma String
        /*String nomes = "João, José, Maria, Pedro, DididoOFoda";
        String[] arrayNomes = nomes.split(",");
        for (String nome : arrayNomes)
            System.out.println(nome);*/
        
        //Obtendo o comprimento de uma String
        // Lembrando que o índice inicial é zero
        /*System.out.println
                            (String.format
                            ("%s tem %d caracteres",anotherPalindrome,anotherPalindrome.length()));*/
        
        //Convertendo para maiúscula
        /*System.out.println("Didico é foda".toUpperCase());*/
        
        //Procurando a 1ª ocorrência de sub-String em uma String
        /*int primeiraOcorrencia = anotherPalindrome.indexOf("gas");
        System.out.println(primeiraocorrencia);*/
        
         //Procurando a última ocorrência de sub-String em uma String
        /*int ultimaOcorrencia = anotherPalindrome.lastIndexOf("ga");
        System.out.println(ultimaOcorrencia);*/
        
        //Verificando se uma String possui uma sub-String
        //Retorno do método contains é booleano
        /*System.out.println("Didico é incrível".contains("é"));
        System.out.println("Didico é incrível".contains("curso ruim"));*/
        
        //Substituindo caracteres e realizando encadeamento
        String frase = "Seja-bem-vindo-ao-curso-Java-fundamentos"
                .replace('-',' ')
                .replaceAll(""," ")
                .replaceFirst("ja","CA"); 
        System.out.println(frase);
        
    }
    
}
