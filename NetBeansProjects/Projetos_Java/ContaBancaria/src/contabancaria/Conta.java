
package contabancaria;

public abstract class Conta {
    //Drclaração de variavéis
    private float saldo;
    private int conta;
    /**
     * Método Contrutor
     * @param saldo
     * @param conta 
     */
    public Conta(float saldo, int conta){
        setSaldo(saldo);
        setConta(conta);
    }
    //Métodos bastratos
    public abstract void depositar(float valor);
    public abstract void saldo();
    public abstract void sacar(float valor);
    public abstract void jurosDiarios(int dias);

    /**
     * @return the saldo
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the conta
     */
    public int getConta() {
        return conta;
    }

    /**
     * @param conta the conta to set
     */
    public void setConta(int conta) {
        this.conta = conta;
    }
}

