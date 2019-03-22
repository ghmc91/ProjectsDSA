/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciofinal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class FuncaoPrincipal {

    public static void main(String[] args) {

        // Instanciando um objeto para cada classe de produtos (brinquedos, eletrônicos, pereciveis, não pereciveis
        Brinquedos b = new Brinquedos("Carrinho", "Hot Whells", "Estrela", 1.25f, 01);

        Eletronicos e = new Eletronicos("Celular", "Nokia", "1100", "1 ano", 1000f, 02);

        Pereciveis p = new Pereciveis("Freezer", "Carne", "JBS", "Kg", 1, 5.5f, 03);

        NaoPereciveis nP = new NaoPereciveis("Feijão", "Branco", "Zanfas", "Kg", 2, 2.2f, 04);

        //Adicionando as instâncias a uma lista de produtos
        List<Produto> lista = new ArrayList<>();
        lista.add(b);
        lista.add(e);
        lista.add(p);
        lista.add(nP);

        //A variável produtos do tipo Produto receberá cada elemento do ArrayList Lista
        for (Produto produtos : lista) {

            System.out.println("--------");

            //Comparação para verificar de qual classe cada elemento pertence
            if (produtos instanceof Brinquedos) {
                System.out.println("Produto: Brinquedo");
                System.out.println("Cadastro: " + produtos.getCadastro());
                System.out.println("Tipo: " + ((Brinquedos) produtos).getTipo());
                System.out.println("Nome: " + ((Brinquedos) produtos).getNome());
                System.out.println("Marca: " + ((Brinquedos) produtos).getMarca());
                System.out.printf("Valor de compra: R$ %.2f %n", ((Brinquedos) produtos).getValorCompra());
                System.out.printf("Valor de venda: R$ %.2f %n", ((Brinquedos) produtos).precoProduto());
            }

            if (produtos instanceof Eletronicos) {
                System.out.println("Produto: Eletrônicos");
                System.out.println("Cadastro: " + produtos.getCadastro());
                System.out.println("Tipo: " + ((Eletronicos) produtos).getTipo());
                System.out.println("Modelo: " + ((Eletronicos) produtos).getModelo());
                System.out.println("Marca: " + ((Eletronicos) produtos).getMarca());
                System.out.println("Garantia: " + ((Eletronicos) produtos).getGarantia());
                System.out.printf("Valor de compra: R$ %.2f %n", ((Eletronicos) produtos).getValorCompra());
                System.out.printf("Valor de venda: R$ %.2f %n", ((Eletronicos) produtos).precoProduto());
            }

            if (produtos instanceof Pereciveis) {
                System.out.println("Produto: Alimentos perecíveis");
                System.out.println("Cadastro: " + produtos.getCadastro());
                System.out.println("Tipo: " + ((Pereciveis) produtos).getTipo());
                System.out.println("Marca: " + ((Pereciveis) produtos).getMarca());
                System.out.println("Unidade de medida: " + ((Pereciveis) produtos).getUnidadeMedida());
                System.out.println("Valor da unidade de medida: " + ((Pereciveis) produtos).getValorUnidadeMedida());
                System.out.println("Local de conservação: " + ((Pereciveis) produtos).getConservacao());
                System.out.printf("Valor de compra: R$ %.2f %n", ((Pereciveis) produtos).getValorCompra());
                System.out.printf("Valor de venda: R$ %.2f %n", ((Pereciveis) produtos).precoProduto());
            }

            if (produtos instanceof NaoPereciveis) {
                System.out.println("Produto: Alimentos não perecíveis");
                System.out.println("Cadastro: " + produtos.getCadastro());
                System.out.println("Tipo: " + ((NaoPereciveis) produtos).getTipo());
                System.out.println("Qualidade: " + ((NaoPereciveis) produtos).getQualidade());
                System.out.println("Marca: " + ((NaoPereciveis) produtos).getMarca());
                System.out.println("Unidade de medida: " + ((NaoPereciveis) produtos).getUnidadeMedida());
                System.out.println("Valor da unidade de medida: " + ((NaoPereciveis) produtos).getValorUnidadeMedida());
                System.out.printf("Valor de compra: R$ %.2f %n", ((NaoPereciveis) produtos).getValorCompra());
                System.out.printf("Valor de venda: R$ %.2f %n", ((NaoPereciveis) produtos).precoProduto());
            }
        }

    }

}
