
package contabancaria;

import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args) {
        //Declaração de variavéis
        int op = 0, conta, tipoConta;
        float saldo, valor;
        Conta c1 = null;
        Scanner entrada = new Scanner(System.in);
        while (op != 6){
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Criar conta \n2 - Extrato \n3 - Depositar \n4 - Sacar \n5 - Atualizar saldo em função de dias  \n6 - Sair");
            op = entrada.nextInt();
            switch(op){
                case 1:
                    System.out.println("Escolha o tipo de conta:");
                    System.out.println("1 - Conta Corrente | 2 - Conta Poupança");
                    tipoConta = entrada.nextInt();
                    if(tipoConta == 1){
                        System.out.println("Conta Corrente");
                        System.out.println("Digite o saldo inicial");
                        saldo = entrada.nextFloat();
                        conta = 1;
                        c1 = new ContaCorrente((float) saldo, conta);
                    }else if(tipoConta == 2){
                        System.out.println("Conta Poupança");
                        System.out.println("Digite o saldo inicial");
                        saldo = entrada.nextFloat();
                        conta = 2;
                        c1 = new ContaPoupanca((float) saldo, conta);
                    }else{
                        System.out.println("Tipo de conta inválido");
                    }
                    break;
                case 2:
                    if (c1 == null){
                        System.out.println("Primeiro, crie uma conta");
                    }else{
                        c1.saldo();
                    }
                    break;
                case 3:
                    if (c1 == null){
                        System.out.println("Primeiro, crie uma conta");
                    }else{
                        System.out.println("Qual valor deseja depositar?");
                        valor = entrada.nextFloat();
                        c1.depositar((float) valor);
                    }
                    break;
                case 4:
                    if (c1 == null){
                        System.out.println("Primeiro, crie uma conta");
                    }else{
                        System.out.println("Qual valor deseja sacar?");
                        valor = entrada.nextFloat();
                        c1.sacar((float) valor);
                    }
                    break;
                case 5:
                    if (c1 == null){
                        System.out.println("Primeiro, crie uma conta");
                    }else{
                        System.out.println("Deseja aplicar por quantos dias?");
                        valor = entrada.nextInt();
                        c1.jurosDiarios((int) valor);
                    }
                    break;
                case 6:
                    System.out.println(" ");
                    break;
            }
        }  
    }
    
}
