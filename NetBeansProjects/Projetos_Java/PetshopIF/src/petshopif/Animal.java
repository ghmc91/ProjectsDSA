/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshopif;

/**
 *
 * @author Gustavo
 */
public class Animal {
    
    private String nome;
    private String especie;
    private String sexo;
    private int idade;

    /**
     * Contrutor inicializando as variavéis com vazio
     * e 0
     */
    public Animal(){
        especie = "";
        nome = "";
        sexo = "";
        idade = 0;
    }
    /**
     * Os parâmetros falam por si só
     * @param nome
     * @param especie
     * @param sexo
     * @param idade 
     */
    public Animal(String nome, String especie, String sexo, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.sexo = sexo;
        this.idade = idade;
    }

    /**
     * 
     * @return nome 
     */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    @Override
    public String toString(){
    String resp;
    resp =  "Nome: " + this.getNome() + 
            "\nEspécie: " + this.getEspecie() + 
            "\nSexo: " + this.getSexo() + 
            "\nIdade: " + this.getIdade();
    return resp;
    }
    
}
