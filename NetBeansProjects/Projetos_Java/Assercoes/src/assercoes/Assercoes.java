package assercoes;

/**
 *
 * @author Gustavo
 */
public class Assercoes {

    /**
     * @param args the command line arguments
     */
    private static int max(int num1, int num2) {

        int maior = 0;

        if (num1 > num2) {
            maior = num1;
        } else if (num2 > num1) {
            maior = num2;
        }
        
        assert (maior == num1 || maior == num2): "Retorno diferente dos parâmetros";

        return maior;
    }

    public static void main(String[] args) {
        System.out.println("Maior entre 3 e 5: " + max(3, 5));
        System.out.println("Maior entre 5 e 3: " + max(5, 3));
        System.out.println("Maior entre 5 e 5: " + max(5, 5));
    }

}
