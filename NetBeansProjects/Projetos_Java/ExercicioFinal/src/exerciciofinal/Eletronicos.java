package exerciciofinal;

/**
 *
 * @author Gustavo 
 * Classe Eletronicos herda da super classe abstrata Produto e
 * implementa a interface Preco
 */
public class Eletronicos extends Produto implements Preco {

    private String tipo;
    private String marca;
    private String modelo;
    private String garantia;
    private float valorCompra;

    /**
     *
     * @param tipo tipo de eletrônico
     * @param marca marca do eletrônico
     * @param modelo modelo do eletrônico
     * @param garantia tempo de gararntia
     * @param valorCompra valor de aquisição
     * @param cadastro cadastro da super classe Produto
     */
    public Eletronicos(String tipo, String marca, String modelo, String garantia, float valorCompra, int cadastro) {
        super(cadastro);
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.garantia = garantia;
        this.valorCompra = valorCompra;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
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
     * valor de compra por uma margem de lucro (que no caso de eletrônicos é
     * 1.7)
     */
    @Override
    public float precoProduto() {
        return valorCompra * 1.7f;
    }

}
