package aula2909;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

public class Aula2909 {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2017,5,20);
        
        List <String> lista = new ArrayList<>();
        lista.add("Gustavo");
        lista.add("Márcia");
        lista.add(1, "Adriana");
        
        /*
        lista.add(3, 2230);
        lista.add(cal);
        */

        /*lista.remove("Adriana");
        lista.remove(0);
         */
 /*System.out.println("==> Exemplo For loop...");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Posição " + i + ": " + lista.get(i));  
            System.out.println("-----------------------------------");
        }
         */
 /*System.out.println("==> Exemplo Iterator <==");
        Iterator lstIterator = lista.iterator();
        while (lstIterator.hasNext())
            System.out.println(lstIterator.next());
    }*/
        System.out.println("==> Exemplo while loop <==");
        int i = 0;
        while (i < lista.size()) {
            System.out.println(lista.get(i));
            i++;
        }
        
        System.out.println("==> Exemplo For each <==");
        for (Object temp : lista){
            System.out.println(temp);
        }

    }
}
