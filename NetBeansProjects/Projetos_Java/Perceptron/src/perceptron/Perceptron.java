/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perceptron;

import java.util.Random;

/**
 *
 * @author Gustavo
 */
public class Perceptron {
    
    //Vetor de pesos
    double w[];
    //Número de entradas
    int n;

    //Construtor - Recebe o número de entradas e inicializa os pesos
    public Perceptron(int n) {
        this.n = n;
        inicializaPesos(this.n);
    }
    
    //Inicia os pesos com valores aleatórios entre 0 e 1
    private void inicializaPesos(int n){
        Random r = new Random();
        this.w = new double[n+1];
        for (int i = 0; i<=n; i++){
            this.w[i] = r.nextDouble();
        }
    }
    
    //Treina o perceptron usando exemplos, a taxa de aprendizagem e o número de epochs
    public void treinaPerceptron(int x[][], int y[], double taxaDeAprendizagem, int epoch){
        //Para cada epoch ...
        for (int i = 0; i < epoch; i++){
            //Para cada exemplo
            for (int j = 0; j < y.length; j++){
                //Calcula o resultado
                int y_calc = calculaResultado(x[j]);
                //passo 2: Calcula o erro
                double erro = y_calc - y[j];
                //Para cada peso...
                for (int k = 0; k<=n; k++){
                    if (k == 0){
                        w[k] = w[k] - erro * taxaDeAprendizagem;
                        }
                    else{
                        w[k] = w[k] - x[j][k-1] * erro * taxaDeAprendizagem;
                    }
                }
            }
        }
    }
    

    public Perceptron(double[] w) {
        this.w = w;
    }
    
    /**
     * Função para calcular o resultado
     * @param x 
     * @return Retorna o resultado da função de passo
     */
    public int calculaResultado(int x[]) {
        double h = 0;
        for (int i = 0; i < x.length; i++) {
            if (i == 0) 
                h = h + x[i];
                else
                h = h + x[i - 1]*w[i];
            }
        return stepFunction(h);
    }
    
    public double[] getW(){
        return w;
    }
    
    /**
     * 
     * @param h
     * @return 
     */
    private int stepFunction(double h){
        if (h<0)
            return 0;
        else
            return 1;
    }
}
