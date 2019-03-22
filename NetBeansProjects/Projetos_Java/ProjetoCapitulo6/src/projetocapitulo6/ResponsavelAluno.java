package projetocapitulo6;

public class ResponsavelAluno extends Pessoa{
    private String tipoResponsavel;
    private String matAluno;
    private int telContato;

    public String getTipoResponsavel() {
        return tipoResponsavel;
    }

    public void setTipoResponsavel(String tipoResponsavel) {
        this.tipoResponsavel = tipoResponsavel;
    }

    public String getMatAluno() {
        return matAluno;
    }

    public void setMatAluno(String matAluno) {
        this.matAluno = matAluno;
    }

    public int getTelContato() {
        return telContato;
    }

    public void setTelContato(int telContato) {
        this.telContato = telContato;
    }

    @Override
    public void imprime() {
        System.out.println("Nome do responsável: " + getNome());
        System.out.println("Tel: " + getTelContato());
    }
    
}
