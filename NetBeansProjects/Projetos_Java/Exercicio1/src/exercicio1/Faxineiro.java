package exercicio1;
public class Faxineiro extends Empregado implements CalculaSalario {

    public Faxineiro(String nome, double cpf) {
        super(nome, cpf);
    }

    public void mostraDadosFaxineiro() {
        System.out.println("Nome do faxineiro: " + getNome());
        System.out.println("Cpf: " + getCpf());
    }

    @Override
    public float CalculaSalarios(int horasTrabalhadas) {
        float salario;
        salario = (float) (horasTrabalhadas * 4.5);
        if (horasTrabalhadas <= 176) {
            return salario;
        } else {
            return salario + (horasTrabalhadas * 6);
        }

    }
}