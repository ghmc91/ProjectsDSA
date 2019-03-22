import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class principal {

    public static void main(String[] args) {

        String nome = null;
        double cpf = 0;
        String cargo = null;
        int horasT = 0;


        String entrada = "";
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Deseja inserir Empregado, Gerente ou faxineiro?");
        try {
            entrada = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (entrada.equals("Empregado")) {
            BufferedReader inNome = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Nome: ");
            try {
                nome = inNome.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            BufferedReader inCpf = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Cpf: ");
            try {
                cpf = Double.parseDouble(inCpf.readLine());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            BufferedReader inCargo = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Cargo: ");
            try {
                cargo = inCargo.readLine();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            BufferedReader inHorasTrabalhadas = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Horas trabalhadas: ");
            try {
                horasT = Integer.parseInt(inHorasTrabalhadas.readLine());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            Empregado empregado = new Empregado(nome, cpf, cargo);
            empregado.mostraDados();
            System.out.println("Salário: " + empregado.CalculaSalarios(horasT));
        }

        if (entrada.equals("Faxineiro")) {
            BufferedReader inNome = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Nome: ");
            try {
                nome = inNome.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            BufferedReader inCpf = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Cpf: ");
            try {
                cpf = Double.parseDouble(inCpf.readLine());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            BufferedReader inHorasTrabalhadas = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Horas trabalhadas: ");
            try {
                horasT = Integer.parseInt(inHorasTrabalhadas.readLine());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            Faxineiro faxineiro = new Faxineiro(nome, cpf);
            faxineiro.mostraDadosFaxineiro();
            System.out.println("Salário: " + faxineiro.CalculaSalarios(horasT));
        }

        if (entrada.equals("Gerente")) {
            int bonus = 0;
            BufferedReader inNome = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Nome: ");
            try {
                nome = inNome.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            BufferedReader inCpf = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Cpf: ");
            try {
                cpf = Double.parseDouble(inCpf.readLine());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            BufferedReader inBonus = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Bonus: ");
            try {
                bonus = Integer.parseInt(inBonus.readLine());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            BufferedReader inHorasTrabalhadas = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Horas trabalhadas: ");
            try {
                horasT = Integer.parseInt(inHorasTrabalhadas.readLine());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            Gerente gerente = new Gerente(nome,cpf,bonus);
            gerente.mostraDadosGerente();
            System.out.println(horasT);
            System.out.println("Salário: " + gerente.CalculaSalarios(horasT));

        }
    }
}