/*
 Faça uma aplicação em que a thread principal cria N threads, cujo construtor 
da classe thread recebe um identificador (de 0 a N-1). Cada thread criada deverá 
enviar uma mensagem a thread com identificador +1, exceto a thread com 
identificador N-1 que enviará uma mensagem a thread de identificador 0. 
As threads só podem terminar sua execução no momento em que receberem a sua 
mensagem. Resumindo, implementar uma comunicação em anel entre as threads 
(sem envolver a thread principal).
 */
package exercicio3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gustavo
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        MinhaThread a = new MinhaThread("Primeria");
        MinhaThread b = new MinhaThread("Segunda");

        a.start();
        synchronized(a){
            try {
                a.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Exercicio3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        b.start();
        synchronized(b){
            try {
                b.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Exercicio3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
  
        
    }
   
}
