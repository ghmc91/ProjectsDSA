public class Empregado implements CalculaSalario {
    protected String nome;
    protected double cpf;
    protected String cargo;
    protected int horasTrabalhadas = 0;



    public Empregado(String nome, double cpf, String cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
    }

    public Empregado(String nome, double cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void mostraDados(){
        System.out.println("nome: " + getNome());
        System.out.println("cpf: " + getCpf());
        System.out.println("cargo: " + getCargo());
    }

    @Override
    public float CalculaSalarios(int horasTrabalhadas){
        this.horasTrabalhadas = horasTrabalhadas;
        return 415;
    }


}
