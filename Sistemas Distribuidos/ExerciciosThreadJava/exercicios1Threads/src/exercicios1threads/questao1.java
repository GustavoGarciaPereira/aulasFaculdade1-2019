/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios1threads;

/**
 *
 * @author usrlab01
 */
public class questao1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ThreadMostraNome t1 = new ThreadMostraNome("gugu");
        ThreadMostraNome t2 = new ThreadMostraNome("pereira");
        
        t1.start();
        t2.start();
    }
    
}
