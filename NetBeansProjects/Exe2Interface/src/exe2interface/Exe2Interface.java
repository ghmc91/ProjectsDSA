
package exe2interface;

public class Exe2Interface {

    public static void main(String[] args) {
      
        Cachorro c1 = new Cachorro();
        c1.setNome("Rex");
        c1.setIdade(3);
        Cavalo ca1 = new Cavalo();
        ca1.setNome("Estrela");
        ca1.setIdade(5);
        Preguica p1 = new Preguica();
        p1.setNome("Dora");
        p1.setIdade(3);
        
        System.out.println("___________________________________________");
        c1.imprimeAnimal(c1);
        System.out.println("___________________________________________");
        ca1.imprimeAnimal(ca1);
        System.out.println("___________________________________________");
        p1.imprimeAnimal(p1);
        System.out.println("___________________________________________");
        
        
    }
    
}
