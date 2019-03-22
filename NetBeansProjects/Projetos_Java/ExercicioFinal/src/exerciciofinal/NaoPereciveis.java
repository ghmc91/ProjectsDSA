package exerciciofinal;

/**
 *
 * @author Gustavo 
 * Classe NaoPereciveis herda da classe abstrata Alimentos
 */
public class NaoPereciveis extends Alimentos {

    private String qualidade;

    /**
     *
     * @param tipo tipo de alimento (feijão)
     * @param qualidade qualidade do tipo de alimento (feijão branco)
     * @param marca marca do aliemnto
     * @param unidadeMedida unidade de medida
     * @param valorUnidadeMedida valor da unidade de medida
     * @param valorCompra Valor que o alimento foi adquirido
     * @param cadastro cadastro da super classe Produto
     */
    public NaoPereciveis(String tipo, String qualidade, String marca, String unidadeMedida, int valorUnidadeMedida, float valorCompra, int cadastro) {
        super(tipo, marca, unidadeMedida, valorUnidadeMedida, valorCompra, cadastro);
        this.qualidade = qualidade;
    }

    public String getQualidade() {
        return qualidade;
    }

    public void setQualidade(String qualidade) {
        this.qualidade = qualidade;
    }

    /**
     *
     * @return O preço final do produto que é calculado pela multiplicação do
     * valor de compra por uma margem de lucro (que no caso de não perecíveis é
     * 1.5)
     */
    @Override
    public float precoProduto() {
        return valorCompra * 1.5f;
    }

}
