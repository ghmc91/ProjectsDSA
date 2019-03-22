package exerciciofinal;

/**
 *
 * @author Gustavo Classe Pereciveis herda da classe abstrata Alimentos
 */
public class Pereciveis extends Alimentos {

    private String conservacao;

    /**
     *
     * @param conservacao Modo de conservação
     * @param tipo tipo de alimento
     * @param marca marca do aliemnto
     * @param unidadeMedida unidade de medida
     * @param valorUnidadeMedida valor da unidade de medida
     * @param valorCompra Valor que o alimento foi adquirido
     * @param cadastro cadastro da super classe Produto
     */
    public Pereciveis(String conservacao, String tipo, String marca, String unidadeMedida, int valorUnidadeMedida, float valorCompra, int cadastro) {
        super(tipo, marca, unidadeMedida, valorUnidadeMedida, valorCompra, cadastro);
        this.conservacao = conservacao;
    }

    public String getConservacao() {
        return conservacao;
    }

    public void setConservacao(String conservacao) {
        this.conservacao = conservacao;
    }

    /**
     *
     * @return O preço final do produto que é calculado pela multiplicação do
     * valor de compra por uma margem de lucro (que no caso de pereciveis é 1.6)
     */
    @Override
    public float precoProduto() {
        return valorCompra * 1.6f;
    }

}
