/*
IF - SJDR
Curso - Gestão da Tecnologia da Informação - 4º P
Atividade de Tópicos Avançados em Programação
Autores: Gustavo Costa e Igor Davin
Setembro de 2017

 */
package atividatap;

import java.util.Scanner;

public class AtividaTAP {

    public static void main(String[] args) {
        //Declaração de variáveis
        String nome;
        int p1;
        int p2;
        int nF;
        String bolsa;
        String res;
        String sit;
        double sitBolsa;
        //Rebendo as informações do usuário
        
        
        Scanner reader = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = reader.next();

        //Rebendo as informações do usuário
        Scanner reader1 = new Scanner(System.in);
        System.out.print("Informe a nota da primeira prova: ");
        p1 = reader1.nextInt();

        //Controle de erro
        if (p1 < 0 || p1 > 50) {
            throw new IllegalArgumentException();
            }

        //Rebendo as informações do usuário
        Scanner reader2 = new Scanner(System.in);
        System.out.print("Informe a nota da segunda prova: ");
        p2 = reader2.nextInt();

        //Controle de erro
        if (p2 < 0 || p2 > 50) {
            throw new IllegalArgumentException();
        }

        // Comparação de Strings para a resposta da pergunta: bolsista?
        do {
            Scanner reader3 = new Scanner(System.in);
            System.out.print("Bolsista?(sim/nao)");
            bolsa = reader.next();
            if (bolsa.equals("nao") == false && bolsa.equals("sim") == false) {
                System.out.println("Resposta inválida");
            }
        } while (bolsa.equals("nao") == false && bolsa.equals("sim") == false);

        //Condição para bolsistas
        if (p1 + p2 >= 60) {
            res = bolsa.equals("sim") ? "Direito a bolsa integral" : " ";
        } else if (p1 + p2 >= 40) {
            res = bolsa.equals("sim") ? "Direito a bolsa parcial" : " ";
        } else {
            res = bolsa.equals("sim") ? "Sem direito a bolsa" : " ";
        }

        //Chamando as funções e passando os parâmetros
        nF = notaFinal(p1, p2);
        sit = situacao(p1, p2);
        sitBolsa = tipoBolsa(p1, p2);

        System.out.println("------Situação do aluno------");
        System.out.println("Aluno:" + nome);
        System.out.println("Nota final: " + nF);
        System.out.println("Situação: " + sit);
        System.out.println(res);
        if (res != " " && nF >= 40) {
            System.out.println("Valor da bolsa: R$ " + sitBolsa);
        }

    }

    /**
     *
     * @param x nota prova 1
     * @param y nota prova 2
     * @return soma das notas
     */
    public static int notaFinal(int x, int y) {
        return x + y;
    }

    /**
     *
     * @param x nota prova 1
     * @param y nota prova 2
     * @return situação do aluno
     */
    public static String situacao(int x, int y) {
        if (x + y < 40) {
            return "Reprovado";
        } else if (x + y < 59) {
            return "Recuperação";
        } else {
            return "Aprovado";
        }
    }

    /**
     *
     * @param x nota prova 1
     * @param y nota prova 2
     * @return o valor da bolsa que o aluno tem direito
     */
    
    public static double tipoBolsa(int x, int y) {
        if (x + y >= 60) {
            return 1000;
        } else if (x + y >= 40) {
            return 1000 * 0.5;
        }
        else
            return 0;
    }
}