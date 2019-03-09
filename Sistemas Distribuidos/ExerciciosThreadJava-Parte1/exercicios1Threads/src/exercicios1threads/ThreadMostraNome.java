<<<<<<< HEAD:Sistemas Distribuidos/ExerciciosThreadJava/exercicios1Threads/src/exercicios1threads/ThreadMostraNome.java
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
=======
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
>>>>>>> 2cb4bcfaa7dc569a972e27c2d0409f08e0b25899:Sistemas Distribuidos/ExerciciosThreadJava-Parte1/exercicios1Threads/src/exercicios1threads/ThreadMostraNome.java
