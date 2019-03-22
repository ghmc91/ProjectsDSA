/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abcautopecas;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Gustavo
 */
public class Cliente {

    private int codigo;
    private String nome;
    private Calendar dataCadastro;
    private int telefone;
    
    

    public Cliente(int codigo, String nome, Calendar dataCadastro, int telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataCadastro = dataCadastro;
        this.telefone = telefone;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataCadastro() {
        if (dataCadastro != null){
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            return sdf.format(dataCadastro.getTime());
        }
        else
            return "Sem data definida";
    }

    public void setDataCadastro(Calendar dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

}
