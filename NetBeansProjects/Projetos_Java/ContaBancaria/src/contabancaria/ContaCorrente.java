package contabancaria;

public class ContaCorrente extends Conta {

    //Declaração de variavéis
    float saldo, juros;
    int conta = getConta(), i;
    float valor;

    /**
     * Método contrutor de conta, recebido por herança
     *
     * @param saldo = Recebe o saldo da conta
     * @param conta = Recebe o número da conta
     */
    public ContaCorrente(float saldo, int conta) {
        super(saldo, conta);
    }

    /**
     * Método abstrato depositar da Classe Conta que recebe o valor digitado
     * pelo usuário, soma ao saldo atual e armazena na variavel saldo
     *
     *     * @param valor = Valor depositado
     */
    @Override
    public void depositar(float valor) {
        saldo = getSaldo();
        saldo += valor;
        setSaldo(saldo);
    }

    // Retorna o saldo
    @Override
    public void saldo() {
        System.out.println("Seu saldo é: " + getSaldo());
    }

    /**
     * Método abstrato sacar ca classe conta Recebe o valor do saque e subtrai
     * do saldo
     *
     * @param valor
     */
    @Override
    public void sacar(float valor) {
        /**
         * Se o Valor do saldo for menor que o valor sacado, ele impossibilita o
         * saque e informa o motivo
         */
        if (getSaldo() < valor) {
            System.out.println("Você não possui saldo suficiente");
        } else {
            saldo -= valor;
            setSaldo(saldo);
        }
    }

    /**
     * Método abstrato jurosDiarios da classe Conta
     *
     * @param dias = recebe a quantidade de dias
     */
    @Override
    public void jurosDiarios(int dias) {
        saldo = getSaldo();
        if (saldo >= 1000) {
            while (i < dias) {
                juros = (float) ((saldo * 0.01) / 100);
                saldo += juros;
                i++;
            }

            System.out.println("Em " + dias + " dias seu saldo será de: " + saldo);
        }else{
            System.out.println("Para aplicações bancárias, o valor em conta mínimo é de R$1000,00");
        }
    }
}
