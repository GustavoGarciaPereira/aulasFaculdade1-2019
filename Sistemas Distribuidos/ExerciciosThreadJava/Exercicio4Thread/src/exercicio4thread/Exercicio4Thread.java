package exercicio4thread;

import java.util.Scanner;

/**
 * @author gustavo
 */
public class Exercicio4Thread {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      
      
        System.out.println("Quantas Threads você quer? ");
        int quantidadeDeThreads = entrada.nextInt();
        
        MinhaThread t;
        for(int i=0; i<quantidadeDeThreads; i++){
            t = new MinhaThread(i);
            t.start();
        }
    }
    
}
