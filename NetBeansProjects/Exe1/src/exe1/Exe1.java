
package exe1;

public class Exe1 {

    public static void main(String[] args) {
        
        Cachorro c1 = new Cachorro("Bingo","Pastor");
        c1.setFicha(1);
        c1.setAlimento("Ração de Cachorro");
        
        Gato g1 = new Gato("Wisk","Peludo");
        g1.setFicha(2);
        g1.setAlimento("Ração de Gato");
        
           System.out.println("___________________________________________");
           c1.exibirdados();
           System.out.println("___________________________________________");
           c1.tipoalimento();
           System.out.println("___________________________________________");
           c1.latir();
           System.out.println("___________________________________________");
           g1.exibirdados();
           System.out.println("___________________________________________");
           g1.tipoalimento();
           System.out.println("___________________________________________");
           g1.miar();
           System.out.println("___________________________________________");
    }
    
       
}
