/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici2threads;

/**
 *
 * @author usrlab01
 */
public class Contador extends Thread{

    private String nomeT;
    
    public Contador(String nomeT){
        this.nomeT = nomeT;
    }
    
    public void run(){
        for(long i=0;i<10;i++){
            System.out.println(nomeT+" :count = "+i);
        
        }
    }
}
