package exerciciofinal;

/**
 *
 * @author Gustavo
 * Classe abstrata Alimentos herda de da super classe abstrata Produto e implementa a interface Preco
 * É abstrata para que sempre que se instancie um alimento, o mesmo seja classificado como Perecível ou não perecível
 */
public abstract class Alimentos extends Produto implements Preco {
    
    private String tipo;
    private String marca;
    private String unidadeMedida;
    private int valorUnidadeMedida;
    float valorCompra;
    
    
    /**
     * Método Construtor
     * @param tipo tipo de alimento
     * @param marca marca do alimento
     * @param unidadeMedida unidade de medida (Kg, l, mg)
     * @param valorUnidadeMedida Valor da unidade de medida
     * @param valorCompra Valor que o produto foi comprado
     * @param cadastro cadastro da super classe Produto
     */
    public Alimentos(String tipo, String marca, String unidadeMedida, int valorUnidadeMedida, float valorCompra, int cadastro) {
        super(cadastro);
        this.tipo = tipo;
        this.marca = marca;
        this.unidadeMedida = unidadeMedida;
        this.valorUnidadeMedida = valorUnidadeMedida;
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

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public int getValorUnidadeMedida() {
        return valorUnidadeMedida;
    }

    public void setValorUnidadeMedida(int valorUnidadeMedida) {
        this.valorUnidadeMedida = valorUnidadeMedida;
    }

    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

  
}
