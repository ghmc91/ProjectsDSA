/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abcautopecas;

import java.util.Calendar;

/**
 *
 * @author Gustavo
 */
public class Exercicio2209 {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        c.set(2017, 8, 22);
        Cliente c1 = new Cliente(1, "Gustavo", c, 333333330);
        Cliente c2 = new Cliente(2, "Katia", c, 333333330);
        Cliente c3 = new Cliente(3, "Vitor", c, 333333330);

        Cliente[] listaCliente = new Cliente[3];
        listaCliente[0] = c1;
        listaCliente[1] = c2;
        listaCliente[2] = c3;

        for (int i = 0; i < 3; i++) {
            System.out.println("\nNome: " + listaCliente[i].getNome() + " Código: " + listaCliente[i].getCodigo() 
                    + " Telefone: " + listaCliente[i].getTelefone() + " Data de cadastro: " + listaCliente[i].getDataCadastro());

        }

    }

}
