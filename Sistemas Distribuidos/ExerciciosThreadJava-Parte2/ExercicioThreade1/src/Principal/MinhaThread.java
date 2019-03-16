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
public class MinhaThread extends Thread {

    execicio1 exercicio;

    private final String nome;

    public MinhaThread(String nome) {
        this.nome = nome;
        exercicio = new execicio1();
    }

    public void run() {

        try {

            while (true) {
                System.out.println("ttu"+activeCount());
                if (exercicio.podeContinuar()) {
                    System.out.println("Sim Thread " + this.nome);
                    Thread.sleep(1000);
                }else{
                    System.out.println("Não Thread " + this.nome);
                    stop();
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(MinhaThread.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
