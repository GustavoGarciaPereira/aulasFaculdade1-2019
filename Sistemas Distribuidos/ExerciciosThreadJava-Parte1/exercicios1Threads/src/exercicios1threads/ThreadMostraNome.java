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
public class ThreadMostraNome extends Thread{

    private String nomeTheread;
    public ThreadMostraNome(String nomeTheread){
        this.nomeTheread = nomeTheread;
    }
    public void run(){
        System.out.println("nome da minha thread: "+nomeTheread);
    }
}
