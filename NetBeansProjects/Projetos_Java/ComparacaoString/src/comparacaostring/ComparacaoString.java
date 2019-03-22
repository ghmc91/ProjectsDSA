/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author Gustavo
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String n1="Gustavo";
        String n2="Gustao";
        String n3=new String ("Gustavo");
        String res;
        res = (n1.equals(n3) && n2.equals(n3))?"igual":"Diferente";
        System.out.println(res);
    }
    
}
