/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5thread;

import java.util.Random;

/**
 *
 * @author gustavo
 */
public class MinhaThread extends Thread{
    public boolean cronometro(int segundos){
        long time, time1;
         	//a variavel time vai receber a hora atual do sistema em milisegundos
            time = System.currentTimeMillis();
            //enquanto o tempo do sistema atual - o tempo do sistema recebido na chamada do metodo for menor q o tempo 
            //q o usuario colocou para aquecer o loop continuara, quando sair irá mostrar a msg q o aquecimento esta
            //pronto.
            
            do {
                time1 = System.currentTimeMillis();
            
            } while ((time1 - time) < (segundos * 1000)) ;
            return true;
     }
    
    public void run(){
        Random random = new Random();
        int i = 0; 
        
        System.out.println("Id: "+this.getId()+" Fui Criada!!!!");
       if(cronometro(random.nextInt(5))){
          System.out.println("Id: "+this.getId()+" Processada!!!!");
       }
       System.out.println("Id: "+this.getId()+" Destruida!!!!");

    }
}
    
