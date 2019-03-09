/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio4thread;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gustavo
 */
public class MinhaThread extends Thread{
    Random gerador = new Random();
    
    public int i = 0;
    public int n = 0 ;
    public MinhaThread(int i){
        this.i = i;
        this.n = gerador.nextInt(10);
    }
    
    
    public void run(){
       try{

            for(int j = 0;j<=n;j++){
                System.out.println("thread ["+this.i+"] criada n = "+ this.n);
                if(j == this.n){
                    System.out.println("thread ["+i+"]  em espera" );
                    Thread.sleep(gerador.nextInt(6));
                    System.out.println("thread ["+i+"]  saindo em espera" );
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(MinhaThread.class.getName()).log(Level.SEVERE, null, ex);
        }
         System.out.println("thread ["+i+"]  finalizada" );   
    }
}

