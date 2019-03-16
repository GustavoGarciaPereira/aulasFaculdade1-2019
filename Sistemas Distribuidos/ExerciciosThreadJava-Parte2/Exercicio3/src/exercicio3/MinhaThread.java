/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

/**
 *
 * @author gustavo
 */

public class MinhaThread extends Thread{
    int indentificador = 0;
    int indentificadorAn = 0;
    String nome;
    public MinhaThread(int indentificador, int numT){
        this.indentificador = indentificador;
        
        if(!(indentificador == 0)){
            this.indentificadorAn = indentificador-1;
        }else{
            this.indentificadorAn = numT-1;
        }
    }
    
    
    public void run(){
        //System.out.println("thread: "+ this.indentificador);
        synchronized(this){
            if(this.indentificador == 0){
                System.out.println("terminou "+this.indentificador);
                System.out.println("anterior "+this.indentificadorAn);
                //notify();
            }
            if(this.indentificador == 1){
                System.out.println("terminou "+this.indentificador);
                System.out.println("anterior "+this.indentificadorAn);
                //notify();
            }
            if(this.indentificador == 2){
                System.out.println("terminou "+this.indentificador);
                System.out.println("anterior "+this.indentificadorAn);
                //notify();
            }
            if(this.indentificador == 3){
                System.out.println("terminou "+this.indentificador);
                System.out.println("anterior "+this.indentificadorAn);
                notify();
            }
            
        }
    }
    
}
