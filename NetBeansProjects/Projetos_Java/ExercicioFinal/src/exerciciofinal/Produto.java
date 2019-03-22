package exerciciofinal;

/**
 *
 * @author Gustavo 
 * Super classe abstrata Produto. Toda classe herdeira dessa
 * classe obrigatoriamente tem que implementar um cadastro.
 * É abstrata pois sempre que se instanciar um produto, o mesmo deve ser classificado
 * dentro das classes de produtos do sistema
 */
public abstract class Produto {

    private int cadastro;

    public Produto(int cadastro) {
        this.cadastro = cadastro;
    }

    public int getCadastro() {
        return cadastro;
    }

    public void setCadastro(int cadastro) {
        this.cadastro = cadastro;
    }

}
