/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estselmult;

/**
 *
 * @author Gustavo
 */
public class EstSelMult {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int mes = 2;
        int ano = 2002;
        int numDias = 0;

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDias = 30;
                break;
            case 2:
                if (((ano % 4 == 0) && (ano % 100 == 0) || (ano % 400 == 0))) {
                    numDias = 29;
                } else {
                    numDias = 28;
                }
                break;
            default:
                System.out.println("Mês inválido");
                break;
        }
        
        System.out.println("Número de dias: " + numDias);
         */
        String mes = "Maio";

        switch (mes) {
            case "Janeiro":
                System.out.println("Janeiro");
                break;
            case "Fevereiro":
                System.out.println("Fevereiro");
                break;
            case "Março":
                System.out.println("Março");
                break;
            case "Abril":
                System.out.println("Abril");
                break;
            case "Maio":
                System.out.println("Maio");
                break;
            case "Junho":
                System.out.println("junho");
                break;
            case "Julho":
                System.out.println("Julho");
                break;
            case "Agosto":
                System.out.println("Agosto");
                break;
            case "Setembro":
                System.out.println("Setembro");
                break;
            case "Outubro":
                System.out.println("Outubro");
                break;
            case "Novembro":
                System.out.println("Novembro");
                break;
            case "Dezembro":
                System.out.println("Dezembro");
                break;
        }
    }

}
