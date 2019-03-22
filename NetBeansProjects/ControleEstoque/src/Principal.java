
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gustavo
 */
public class Principal {

    public static void main(String[] args) {
        //Declaração de variaveis
        int opcao = 0;
        String codigo = null, descricao = null;
        int quantidade = 0;
        float precoUnit = 0;
        Estoque e = new Estoque();
        
        Scanner entrada = new Scanner(System.in);
        //Laço de repetição: Enquanto o usuário não optar por sair o programa vai sendo executado
        while (opcao != 3) {
            System.out.println("Menu: \n1 - Cadastrar mercadoria \n2 - Buscar mercadoria \n3 - Sair \nOpção: ");
            opcao = entrada.nextInt();
            //Opção de cadastro: Seta os valores das variavéis
            if (opcao == 1) {
                System.out.println("Codigo: ");
                Scanner entCod = new Scanner(System.in);
                e.setCodigo(entCod.next());
                System.out.println("Descrição: ");
                Scanner entDesc = new Scanner(System.in);
                e.setDescricao(entDesc.next());
                System.out.println("Quantidade: ");
                Scanner entQtd = new Scanner(System.in);
                e.setQuantidade(entQtd.nextInt());
                System.out.println("Preço unitário:");
                Scanner entPreco = new Scanner(System.in);
                e.setPrecoUnit(entPreco.nextFloat());
                //Operação de consulta:
            }else if(opcao == 2){
                System.out.println("Código: " + e.getCodigo() + "\nDescrição: " + e.getDescricao()
                + "\nQuantidade: " + e.getQuantidade() + "\nPreço unitário: " + e.getPrecoUnit());
                //Sair do programa
            }else{
                System.out.println("Fim");
            }
        }

    }

}
