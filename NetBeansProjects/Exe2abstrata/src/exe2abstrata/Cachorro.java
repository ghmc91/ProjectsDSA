
package exe2abstrata;

public class Cachorro extends Animal {
    
    public Cachorro(String n, String s) {
        super(n, s);
    }

    @Override
    public void imprime() {
        System.out.println("Nome do cachorro: "+getNome()+"\n"+"Sexo: "+getSexo());
    }
    
}
