
package exe2interface;

public class Cavalo implements Animal {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public boolean instrucaoAnimal(Animal a) {
        return true;
    }

    @Override
    public void imprimeAnimal(Animal a) {
        System.out.println("Nome do cavalo: "+getNome()+"\n"+"Idade: "+getIdade());
    }
    
}
