package lancandoexcessoes;

/**
 *
 * @author Gustavo
 */
public class LancandoExcessoes {

    /**
     * @param args the command line arguments
     */
    public static int anosParaCem(int idade) {

        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa");
        }
        if (idade > 100) {
            throw new IllegalArgumentException("Idade não pode ser maior que 100");
        }

        return 100 - idade;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            int anosPara100 = anosParaCem(30);
            System.out.println(anosPara100);
        } catch (IllegalArgumentException ae) {
            System.out.println("Valor de idade inválido" + ae.getMessage());
        }

    }
}
