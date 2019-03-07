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
    public static void main(String[] args){
        Contador t1 = new Contador("Primeira");
        Contador t2 = new Contador("Segunda");
        Contador t3 = new Contador("Terceira");
        Contador t4 = new Contador("Querta");
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
    
    
}
