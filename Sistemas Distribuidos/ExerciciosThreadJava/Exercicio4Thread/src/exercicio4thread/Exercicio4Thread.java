package exercicio4thread;

import java.util.Scanner;

/**
 * @author gustavo
 */
public class Exercicio4Thread {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      
      
        System.out.println("Quantas Threads você quer? ");
        int p = entrada.nextInt();
        
        MinhaThread t;
        for(int i=0; i<p; i++){
            t = new MinhaThread(i);
            t.start();
        }
    }
    
}
