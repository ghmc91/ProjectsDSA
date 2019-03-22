/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Gustavo
 */
public class Exercicio9 {

    public static void main(String[] args) {

        URL url = null;
        BufferedReader in = null;

        try {
            url = new URL("https://archive.ics.uci.edu/ml/machine-learning-databases/iris/iris.data");
            in = new BufferedReader(new InputStreamReader(url.openStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            in.close();

        }catch(MalformedURLException e){
            e.printStackTrace();
        }catch (IOException i){
            i.printStackTrace();
        }
        finally{
            if (in != null){
                try{
                    in.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

}
