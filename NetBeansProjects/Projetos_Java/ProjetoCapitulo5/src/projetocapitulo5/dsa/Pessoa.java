/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo5.dsa;

/**
 *
 * @author Gustavo
 */
public class Pessoa {

        // Vou deixar este cÃ³digo comentado pois caso contrÃ¡rio darÃ¡ erro
    // nos cÃ³digos dos exercÃ­cios anteriores, pois os mesmos nÃ£o poderiam
    // acessar as variÃ¡veis de instÃ¢ncia

    private String nome;
    private String sobrenome;
    private int idade;
    private String sexo;
    private String cargo;
    private String pais;

    /*public String nome;
    public String sobrenome;
    public int idade;
    public String sexo;
    public String cargo;
    public String pais;*/

    public Pessoa() {

    }

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade < 0 || idade > 150) {
            throw new IllegalArgumentException("Idade invÃ¡lida");
        }
        else {
            this.idade = idade;
        }
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
