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
    public MinhaThread(String nome, int distancia){
        this.nome = nome;
        this.distancia = distancia;
    }
    
    
//    public int calculo(){
//        
//    }
    
    
    
    
    
    
    
    
    
    public void run(){
//        int percorrer = this.distancia/calculo();
//        System.out.println("percorrer "+calculo());
        int i = 0;
        while(i<= this.distancia){
//            i += percorrer;
           
        }
        
        System.out.println("cavalo numero = "+nome+" @@@@@@@@@@@@@@@@@@@@@@@@@");
    }
    
}
