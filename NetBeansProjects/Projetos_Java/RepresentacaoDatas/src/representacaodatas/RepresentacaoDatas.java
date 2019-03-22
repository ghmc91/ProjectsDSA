/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package representacaodatas;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Gustavo
 */
public class RepresentacaoDatas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Data é Java representando como um número (long)
        // que indica quantos milisegundos passaram desde 01/01/1970
        
        Date dataAtual = new Date();//obtém a data atual
        System.out.println(dataAtual.getTime());
        System.out.println(dataAtual);
        
        Date outraData = new Date(0);
        System.out.println(outraData);
        
        outraData.setTime(223323232L);
        System.out.println(outraData);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(sdf.format(dataAtual));
        
        SimpleDateFormat sd = new SimpleDateFormat("D");
        System.out.println(sd.format(dataAtual));
        
        System.out.println(outraData.before(dataAtual));
        System.out.println(outraData.after(dataAtual));
        
    }
    
}
