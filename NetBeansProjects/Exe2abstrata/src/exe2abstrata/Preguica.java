
package exe2abstrata;

public class Preguica extends Animal {
    
    public Preguica(String n, String s) {
        super(n, s);
    }

    @Override
    public void imprime() {
        System.out.println("Nome da preguiça: "+getNome()+"\n"+"Sexo: "+getSexo());
    }
    
}
