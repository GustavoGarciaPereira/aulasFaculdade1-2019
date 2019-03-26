/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

import java.util.logging.Level;
import java.util.logging.Logger;
import sun.rmi.runtime.Log;

/**
 *
 * @author gustavo
 */

public class MinhaThread extends Thread {
  
    String nome;
    
    public MinhaThread(String nome){
        this.nome = nome;
    }
    
    public synchronized void acesso(){
        
        boolean flag = true;
        if(flag){
            try {
                System.out.println(" T oi"+this.nome);
                Thread.sleep(500);
                notify();
            } catch (InterruptedException ex) {
                Logger.getLogger(MinhaThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            flag = false;
        }
        if(!flag){
            try {
                System.out.println(" F oi"+this.nome);
                Thread.sleep(500);
                notify();
            } catch (InterruptedException ex) {
                Logger.getLogger(MinhaThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            flag = true;
        }
        //notifyAll();
        
    }
    
    
    public void run(){
        
        while(true){
            
            System.out.println("++++++++++++++++++++++++++++++++");
            acesso();
        
        }
    }
 }