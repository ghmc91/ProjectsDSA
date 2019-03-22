/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulacaodatas;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Gustavo
 */
public class ManipulacaoDatas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Obtendo uma instância de um calendário
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        
        cal.setTime(new Date());
        
        int dia = cal.get(Calendar.DATE);
        int mes = cal.get(Calendar.MONTH)+1;
        int ano = cal.get(Calendar.YEAR);
        
        System.out.println(dia + "/" + mes + "/" + ano);
        
        //Alterar o ano de uma data (da mesma forma outros campos podem ser manipulados)
        cal.set(Calendar.YEAR,2018);
        System.out.println(cal.toInstant().toString());
        
        //Manipulação de datas
        cal.add(Calendar.MONTH, 1);
        cal.add(Calendar.DATE, -7);
        System.out.println(cal.toInstant().toString());
        
        Calendar outroCal = Calendar.getInstance();
        System.out.println(outroCal.after(cal));
        
    }
    
    /*Para Java 8 ou superior utilize classes do pacote java.time*/
}
