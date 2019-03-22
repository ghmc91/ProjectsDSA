
package exe2abstrata;

public class Cavalo extends Animal {
    
    public Cavalo(String n, String s) {
        super(n, s);
    }

    @Override
    public void imprime() {
        System.out.println("Nome do cavalo: "+getNome()+"\n"+"Sexo: "+getSexo());
    }
    
}
