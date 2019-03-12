/*
2 - Faça uma aplicação Java com threads que simule uma corrida de cavalos, em que 
cada cavalo é uma thread. Os cavalos devem percorrer alguma quantidade de metros 
na corrida (por exemplo, 500 metros), e cada cavalo tem uma velocidade média de 
16m/s, podendo variar para mais e para menos (variação esta que deve ser calculada 
de forma aleatória). Faça uma aplicação java em que o usuário insere o número de 
cavalos da corrida e o a quantidade de metros da corrida, e inicie uma thread para 
cada cavalo, que a cada interação anda alguns metros (dependendo da sua velocidade). 
Em seguida, informe qual cavalo foi o campeão.
 */
package javaapplication26;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        MinhaThread t;
        
        
        System.out.println("Informe a quantidade de cavalos:");
        
        int cavalos = entrada.nextInt();
        int i = 0;
        while(i<=cavalos){
            t = new MinhaThread(""+i,1000);
            i++;
            t.start();
        }
       
       
       
    }
    
}
