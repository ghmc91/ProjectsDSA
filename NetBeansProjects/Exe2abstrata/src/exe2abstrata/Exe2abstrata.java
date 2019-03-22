
package exe2abstrata;

public class Exe2abstrata {

    public static void main(String[] args) {
        
        Cachorro c1 = new Cachorro("Zeus","M");
        Cavalo ca1 = new Cavalo("Pampa","M");
        Preguica p1 = new Preguica("Mafalda","F");
        
        System.out.println("___________________________________________");
        c1.imprime();
        System.out.println("___________________________________________");
        ca1.imprime();
        System.out.println("___________________________________________");
        p1.imprime();
        System.out.println("___________________________________________");
    }
    
}
