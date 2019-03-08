/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usrlab01
 */
public class MinhaThread extends Thread{
    execicio1 e;
    
    private final String nome;
    public MinhaThread(String nome, execicio1 e){
        this.nome = nome;
    }
    
    
    public void run(){
        
        
        try {
            
            while(e.podeContinuar()){
            Thread.sleep(1000);
            System.out.println(" Thererada "+nome);
        }
        } catch (InterruptedException ex) {
            Logger.getLogger(MinhaThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
