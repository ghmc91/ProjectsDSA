package exerciciofinal;

/**
 *
 * @author Gustavo Classe Brinquedos herda da super classe abstrata Produto e
 * implementa a interface Preco
 */
public class Brinquedos extends Produto implements Preco {

    private String tipo;
    private String nome;
    private String marca;
    private float valorCompra;

    /**
     * Método Construtor
     *
     * @param tipo tipo de brinquedo
     * @param nome nome do brinquedo
     * @param marca marca do brinquedo
     * @param valorCompra valor que o brinquedo foi adquirido
     * @param cadastro cadastro da super classe Produto
     */
    public Brinquedos(String tipo, String nome, String marca, float valorCompra, int cadastro) {
        super(cadastro);
        this.tipo = tipo;
        this.nome = nome;
        this.marca = marca;
        this.valorCompra = valorCompra;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    /**
     *
     * @return O preço final do produto que é calculado pela multiplicação do
     * valor de compra por uma margem de lucro (que no caso de brinquedos é 1.8)
     */
    @Override
    public float precoProduto() {
        return valorCompra * 1.8f;
    }

}
