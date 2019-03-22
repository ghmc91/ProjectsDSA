
package contabancaria;

public class ContaPoupanca extends Conta {
    //Declaração de variáveis
    float saldo,juros;
    int conta = getConta(), i;
    float valor;

    /**
     * Método contrutor de conta, recebido por herança
     *
     * @param saldo = Recebe o saldo da conta
     * @param conta = Recebe o número da conta
     */
    public ContaPoupanca(float saldo, int conta) {
        super(saldo, conta);
    }
    
    /**
     * Método abstrato depositar da Classe Conta que recebe o valor digitado pelo usuário,
     * soma ao saldo atual e armazena na variavel saldo
     *     * @param valor = Valor depositado
     */
    @Override
    public void depositar(float valor){
        saldo = getSaldo();
        saldo = saldo + valor;
        setSaldo(saldo);
    }
    
    // Retorna o saldo
    @Override
    public void saldo(){
        System.out.println("Seu saldo é: " + getSaldo());
    }
    
    /**
     * Método abstrato sacar ca classe conta Recebe o valor do saque e subtrai
     * do saldo
     * @param valor
     */
    @Override
    public void sacar(float valor){
        saldo = getSaldo();
        if(saldo < valor){
            System.out.println("Você não possui saldo suficiente");
        }else{
            saldo = saldo - valor;
            setSaldo(saldo);
        }
    }
    
    @Override
    public void jurosDiarios(int dias){
        saldo = getSaldo();
        while (i < dias){
            juros = (float) ((saldo * 0.02)/100);
            saldo = saldo + juros;
            i++;
        }
        setSaldo(saldo);
        System.out.println("Novo saldo: " + saldo);
    }
}
