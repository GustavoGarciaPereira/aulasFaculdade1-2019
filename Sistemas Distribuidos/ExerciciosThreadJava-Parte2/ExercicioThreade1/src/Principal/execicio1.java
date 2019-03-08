package Principal;

import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usrlab01
 */
public class execicio1 {
    public  void main(String[] args) {
        inicializaThread();
    }
    public  void inicializaThread(){
        MinhaThread t1 = new MinhaThread("Primeira", this);
        MinhaThread t2 = new MinhaThread("Segunda", this);
        MinhaThread t3 = new MinhaThread("Terceira", this);
        MinhaThread t4 = new MinhaThread("Quarta", this);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
    
    public boolean podeContinuar(){
        Random random = new Random();
        
        return random.nextBoolean();
    }
    
    
}
