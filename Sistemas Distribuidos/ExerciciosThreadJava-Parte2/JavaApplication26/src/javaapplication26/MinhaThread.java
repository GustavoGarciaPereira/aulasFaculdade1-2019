/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;


import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gustavo
 */
public class MinhaThread extends Thread{
    Random random = new Random();
    String nome;
    int distancia = 0;
    int qtd = 0;
    public MinhaThread(String nome, int distancia, int qtd){
        this.nome = nome;
        this.distancia = distancia;
        this.qtd = qtd;
    }
    
    
    public void run(){
//        int percorrer = this.distancia/calculo();
//        System.out.println("percorrer "+calculo());
        int velocidade = random.nextInt(3)+12;
        
        
        
        for(int i=0;i<this.distancia;i+=velocidade){
            //System.out.println("Cavalo numero = "+this.nome);

            //System.out.println("velo>>"+velocidade);
            
        }
            System.out.println("ter "+this.nome);
        
    
    }
}