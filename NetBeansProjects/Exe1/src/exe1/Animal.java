
package exe1;

public abstract class Animal {
    private String nome;
    private String raca;
    
    Animal(String n, String r){
        nome=n;
        raca=r;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public abstract void exibirdados();
    public abstract void tipoalimento();
}
