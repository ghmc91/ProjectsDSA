/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversaotiposdados;

/**
 *
 * @author Gustavo
 */
public class ConversaoTiposDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Bolean para String
        String flag = String.valueOf(true);
        
        //int para String
        String idadeEmString = String.valueOf(10);
        
        //float para String
        String salarioEmString = String.valueOf(122345.567);
        
        // array de caracteres para String 
        char[] arrayChar = {'D','S','A'};
        String nome = String.valueOf(arrayChar);
        
        // String para int
        int idade = Integer.parseInt("10");
        
        //String para float
        float salario = Float.parseFloat("12345.87");
        
        // String para double
        double salarioMuitoGrande = Double.parseDouble("1234567.9876");
        
        int salarioTruncado = (int) 12346.76F;
        
        //Um int pode receber um short
        /*short meuShort = 10;
        int meuInteiro = meuShort;*/
        
        //Um short não pode receber um int
        /*int meuInteiro = 20000000000;
        short meuShort = meuInteiro;*/
        
        //Concersão explicita
        int meuInteiro = 200000000;
        short meuShort = (short) meuInteiro;
        System.out.println(meuShort);
        
        
        
        
        
        
        
        

        
    }
    
}
