package projetoescola;

public class ProjetoEscola {

    public static void main(String[] args) {

        Aluno a = new Aluno("12345", "Gustavo");
        a.setProva1(25);
        a.setProva2(25);

        System.out.println("Matricula: " + a.getMatricula());
        System.out.println("Nome: " + a.getNome());
        System.out.println("Nota 1: " + a.getProva1());
        System.out.println("Nota 2: " + a.getProva2());
        System.out.println("Nota final: " + a.CalcularNotaFinal());
    }

}   
