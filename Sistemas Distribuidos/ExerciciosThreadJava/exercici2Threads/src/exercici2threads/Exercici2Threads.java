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
public class Exercici2Threads{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        MinhaThread t1 = new MinhaThread("Primeira");
        MinhaThread t2 = new MinhaThread("Segunda");
        MinhaThread t3 = new MinhaThread("Terceira");
        MinhaThread t4 = new MinhaThread("Querta");
        
        t1.start();
        t2.start();
        
        t1.join();
        t3.start();
        t4.start();
    }
    
    
}
