/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkedexceptions;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Gustavo
 */
public class CheckedExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            imprimeArquivo("src\\checkedexceptions.java");
        } catch (IOException ex) {
            System.out.println("Ocorreu um erro");
            ex.printStackTrace();
        }

    }

    public static void imprimeArquivo(String nomeArquivo) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(nomeArquivo);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();

        }
    }
