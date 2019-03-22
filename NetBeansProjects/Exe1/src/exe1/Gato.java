
package exe1;

public class Gato extends Animal {
    
    public Gato(String n, String r) {
         super(n,r);
    }
    
    private int ficha;
    private String alimento;

    public int getFicha() {
        return ficha;
    }

    public void setFicha(int ficha) {
        this.ficha = ficha;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public void exibirdados() {
        System.out.println("Nome do Gato: " + getNome());
        System.out.println("Raça: " + getRaca());
    }

    @Override
    public void tipoalimento() {
       System.out.println("Ração: " + getAlimento());
    }
    
    void miar(){
        System.out.println("Ficha: " + getFicha());
    }
}
