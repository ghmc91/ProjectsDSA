package exercicio1;

public class Gerente extends Empregado implements CalculaSalario{


    private int bonus;

    public Gerente(String nome, double cpf, int bonus) {
        super(nome,cpf);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void mostraDadosGerente() {
        System.out.println("Nome do Gerente: " + getNome());
        System.out.println("Cpf: " + getCpf());
        System.out.println("Bonus: " + getBonus());
    }


    @Override
    public float CalculaSalarios(int horasTrabalhadas) {
        return (horasTrabalhadas * 30) + bonus;
    }
}
